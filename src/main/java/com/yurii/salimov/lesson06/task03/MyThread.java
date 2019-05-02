package com.yurii.salimov.lesson06.task03;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread № " + getId());
        while (!isInterrupted()) {
            Thread.yield();
        }
    }
}
