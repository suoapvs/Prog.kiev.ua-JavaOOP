package com.yurii.salimov.lesson06.task04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class ParentThread extends Thread {

    @Override
    public void run() {
        final Collection<Thread> threads = createChildThreads();
        while (!isInterrupted()) {
            Thread.yield();
        }
        interruptChildThreads(threads);
    }

    private static Collection<Thread> createChildThreads() {
        final Collection<Thread> threads = new ArrayList<>();
        Thread thread;
        for (int i = 0; i < 50; i++) {
            thread = new ChildThread();
            thread.start();
            threads.add(thread);
        }
        return threads;
    }

    private static void interruptChildThreads(final Collection<Thread> threads) {
        threads.forEach(Thread::interrupt);
        System.out.println("All threads is interrupted.");
    }
}
