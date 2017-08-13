package com.yurii.salimov.lesson12.task02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Stress extends Thread {

    private final Parameters parameters;

    public Stress(final Parameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            final List<Thread> clients = createClients();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                interruptedClients(clients);
                System.out.println(">>> All threads is interrupted.");
                return;
            } catch (Exception ex) {
                ex.printStackTrace();
                return;
            }
        }
    }

    public Parameters getParameters() {
        return this.parameters;
    }

    private List<Thread> createClients() {
        final List<Thread> threads = new ArrayList<>();
        Thread client;
        for (int i = 0; i < this.parameters.getNumberOfConnections(); i++) {
            client = new Client(this.parameters);
            client.start();
            threads.add(client);
        }
        return threads;
    }
    private static void interruptedClients(final List<Thread> clients) {
        clients.forEach(Thread::interrupt);
    }
}
