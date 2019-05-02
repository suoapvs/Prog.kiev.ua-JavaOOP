package com.yurii.salimov.lesson01.task02;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class SynchronizedCounter {

    private static volatile AtomicInteger count = new AtomicInteger(0);

    public SynchronizedCounter() {
        increment();
    }

    public static int getCount() {
        return count.get();
    }

    public static void reset() {
        count.set(0);
    }

    private static void increment() {
        count.getAndIncrement();
    }
}
