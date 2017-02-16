package com.yurii.salimov.lesson01.task02;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Counter {

    private static int count;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
