package com.yurii.salimov.lesson12.task04.client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Чат-клиент.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        try {
            final Scanner scanner = new Scanner(System.in);
            final Socket socket = new Socket("192.168.0.100", 5000);
            final InputStream input = socket.getInputStream();
            final OutputStream output = socket.getOutputStream();
            System.out.println("Enter login: ");
            final String login = scanner.nextLine();
            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        while (!isInterrupted()) {
                            Message msg = new Message().readFromStream(input);
                            if (msg == null) {
                                Thread.yield();
                            } else if (msg.getTo().equals(login)) {
                                System.out.println(msg.toString());
                            }
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        return;
                    }
                }
            };
            th.setDaemon(true);
            th.start();
            try {
                while (true) {
                    String s = scanner.nextLine();
                    if (s.isEmpty()) {
                        break;
                    }
                    int del = s.indexOf(':');
                    String to = "";
                    String text = s;
                    if (del >= 0) {
                        to = s.substring(0, del);
                        text = s.substring(del + 1);
                    }
                    new Message(login, to, text).writeToStream(output);
                }
            } finally {
                th.interrupt();
                socket.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
