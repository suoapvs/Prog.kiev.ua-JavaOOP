package com.yurii.salimov.lesson12.task03;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class StressClient extends Thread {

    private final String ip;
    private final int port;
    private final String[] logins;
    private final String[] messages;

    public StressClient(
            final String ip, final int port,
            final String[] logins, final String[] messages
    ) {
        this.ip = ip;
        this.port = port;
        this.logins = logins;
        this.messages = messages;
    }

    @Override
    public void run() {
        try (final Socket socket = new Socket(this.ip, this.port);
             final OutputStream output = socket.getOutputStream()) {
            while (!isInterrupted()) {
                Message message = new Message(getRandomLogin(), getRandomLogin(), getRandomMessage());
                message.writeToStream(output);
                Thread.sleep((long) (Math.random() * 10000) + 1000);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private String getRandomLogin() {
        final int index = new Random().nextInt(this.logins.length);
        return this.logins[index];
    }

    private String getRandomMessage() {
        final int index = new Random().nextInt(this.messages.length);
        return this.messages[index];
    }

    public String getIp() {
        return ip;
    }

    public int getPort() {
        return port;
    }

    public String[] setLogins() {
        return logins;
    }

    public String[] setMessages() {
        return messages;
    }
}
