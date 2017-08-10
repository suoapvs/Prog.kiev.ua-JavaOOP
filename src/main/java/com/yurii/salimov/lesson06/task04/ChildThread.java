package com.yurii.salimov.lesson06.task04;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class ChildThread extends Thread {

    private static int count;
    private final int threadId;

    public ChildThread() {
        threadId = count++;
    }

    @Override
    public void run() {
        System.out.println("Thread № " + this.threadId + ", ID: " + getId());
        while (!isInterrupted()) {
            Thread.yield();
        }
    }

    public int getThreadId() {
        return threadId;
    }
}
