package com.yurii.salimov.lesson11.task03;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Server extends Thread {

    private static Integer numberRequest;
    private final int port;

    public Server(int port) {
        numberRequest = 0;
        this.port = port;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            try (final ServerSocket server = new ServerSocket(this.port);
                 final Socket socket = server.accept();
                 final OutputStream output = socket.getOutputStream()) {
                output.write(getInfo().getBytes());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private String getInfo() {
        return "OS: " + System.getenv("OS") +
                "\n\nProcessor: " +
                "\n identifier - " + System.getenv("PROCESSOR_IDENTIFIER") +
                "\n architecture - " + System.getenv("PROCESSOR_ARCHITECTURE") +
                "\n cores - " + Runtime.getRuntime().availableProcessors() +
                "\n\nRequest number: " + getNumberAndIncrement();
    }

    private synchronized int getNumberAndIncrement() {
        return numberRequest++;
    }
}
