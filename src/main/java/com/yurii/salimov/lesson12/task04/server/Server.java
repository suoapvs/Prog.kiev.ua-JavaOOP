package com.yurii.salimov.lesson12.task04.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Server {

    private int port;
    private Thread thread;
    private List<Message> messages = Collections.synchronizedList(new ArrayList<>());

    public Server(int port) {
        this.port = port;
    }

    public void start() {
        this.thread = new Thread() {
            @Override
            public void run() {
                try (final ServerSocket serverSocket = new ServerSocket(port)) {
                    while (!isInterrupted()) {
                        final Socket socket = serverSocket.accept();
                        new ClientThread(socket, messages).start();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        this.thread.start();
    }

    public void stop() {
        if (this.thread != null) {
            this.thread.interrupt();
        }
    }
}
