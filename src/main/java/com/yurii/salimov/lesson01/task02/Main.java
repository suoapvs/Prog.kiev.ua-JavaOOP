package com.yurii.salimov.lesson01.task02;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 1.2 Написать класс, который умеет считать
 * количество созданных объектов этого класса
 * (static).
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        singleThreadCounter();
        multiThreadCounter();
        multiThreadSynchronizedCounter();
    }

    private static void singleThreadCounter() {
        Counter.reset();
        for (int i = 0; i < 100; i++) {
            new Counter();
        }
        System.out.println("Single thread counter: " + Counter.getCount());
    }

    private static void multiThreadCounter() throws InterruptedException {
        Counter.reset();
        final Collection<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            final Thread th = new Thread(() -> {
                try {
                    Thread.sleep(System.nanoTime() % 50); // эмитируем бурную деятельность...
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                new Counter();
            });
            th.start();
            threads.add(th);
        }
        for (Thread th : threads) {
            th.join();
        }
        System.out.println("Multi thread counter: " + Counter.getCount());
    }

    private static void multiThreadSynchronizedCounter() throws InterruptedException {
        SynchronizedCounter.reset();
        final Collection<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            final Thread th = new Thread(() -> {
                try {
                    Thread.sleep(System.nanoTime() % 50); // эмитируем бурную деятельность...
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                new SynchronizedCounter();
            });
            th.start();
            threads.add(th);
        }
        for (Thread th : threads) {
            th.join();
        }
        System.out.println("Multi thread synchronized counter: " + SynchronizedCounter.getCount());
    }
}
