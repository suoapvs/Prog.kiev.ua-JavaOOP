package com.yurii.salimov.lesson06.task03;

import java.util.ArrayList;

/**
 * 3. Создать 100 потоков, каждый их которых выведет на экран
 * свой номер и дождется, пока его прервут.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        try {
            final ArrayList<Thread> threads = createThreads();
            Thread.sleep(5000);
            interruptThreads(threads);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static ArrayList<Thread> createThreads() {
        final ArrayList<Thread> threads = new ArrayList<>();
        Thread thread;
        for (int i = 0; i < 100; i++) {
            thread = new MyThread();
            thread.start();
            threads.add(thread);
        }
        return threads;
    }

    private static void interruptThreads(final ArrayList<Thread> threads) {
        threads.stream().forEach(Thread::interrupt);
    }
}
