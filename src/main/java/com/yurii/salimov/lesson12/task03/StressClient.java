package com.yurii.salimov.lesson12.task03;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class StressClient extends Thread {

    private String ip;
    private int port;
    private String[] logins;
    private String[] messages;

    public StressClient(String ip, int port, String[] logins, String[] messages) {
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
        return this.logins[new Random().nextInt(this.logins.length)];
    }

    private String getRandomMessage() {
        return messages[new Random().nextInt(messages.length)];
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String[] setLogins() {
        return logins;
    }

    public void setLogins(String[] logins) {
        this.logins = logins;
    }

    public String[] setMessages() {
        return messages;
    }

    public void setMessagesList(String[] messages) {
        this.messages = messages;
    }
}
