package com.yurii.salimov.lesson06.task04;

import java.util.ArrayList;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class ParentThread extends Thread {

    @Override
    public void run() {
        final ArrayList<Thread> threads = createChildThreads();
        while (!isInterrupted()) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                interruptChildThreads(threads);
                return;
            }
        }
    }

    private static ArrayList<Thread> createChildThreads() {
        final ArrayList<Thread> threads = new ArrayList<>();
        Thread thread;
        for (int i = 0; i < 50; i++) {
            thread = new ChildThread();
            thread.start();
            threads.add(thread);
        }
        return threads;
    }

    private static void interruptChildThreads(final ArrayList<Thread> threads) {
        threads.stream().forEach(Thread::interrupt);
        System.out.println("All threads is interrupted.");
    }
}
