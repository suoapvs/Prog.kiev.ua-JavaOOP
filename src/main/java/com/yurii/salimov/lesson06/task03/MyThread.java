package com.yurii.salimov.lesson06.task03;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class MyThread extends Thread {

    private static int counter;
    private final int id;

    public MyThread() {
        this.id = counter++;
    }

    @Override
    public void run() {
        System.out.println("Thread № " + this.id);
        while (!isInterrupted()) {
            sleep();
        }
    }

    public int getThreadId() {
        return this.id;
    }

    private void sleep() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            System.out.println("Thread stop!");
        }
    }
}
