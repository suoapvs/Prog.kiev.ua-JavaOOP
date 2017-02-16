package com.yurii.salimov.lesson12.task04.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class ClientThread extends Thread {

    private final Socket socket;
    private final List<Message> messages;
    private int pos = 0;
    private String name;

    public ClientThread(Socket socket, List<Message> msg) {
        this.socket = socket;
        this.messages = msg;
    }

    private void listToBytes(OutputStream os) throws IOException {
        for (int i = pos; i < this.messages.size(); i++) {
            this.messages.get(i).writeToStream(os);
        }
        this.pos = this.messages.size();
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                try (final InputStream is = this.socket.getInputStream();
                     final OutputStream os = this.socket.getOutputStream()) {
                    if (this.pos < this.messages.size()) {
                        listToBytes(os);
                    }
                    final Message message = new Message().readFromStream(is);
                    if (message != null) {
                        System.out.println(message);
                        this.messages.add(message);
                        if (this.name == null) {
                            this.name = message.getFrom();
                            setName(this.name);
                        }
                    }
                }
            }
            this.socket.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
