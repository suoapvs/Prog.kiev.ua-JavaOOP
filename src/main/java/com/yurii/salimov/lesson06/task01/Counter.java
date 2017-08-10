package com.yurii.salimov.lesson06.task01;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Counter extends Thread {

    private final int rangeStart;
    private final int rangeEnd;

    public Counter(final int rangeStart, final int rangeEnd) {
        if (rangeStart < rangeEnd) {
            this.rangeStart = rangeStart;
            this.rangeEnd = rangeEnd;
        } else {
            this.rangeStart = rangeEnd;
            this.rangeEnd = rangeStart;
        }
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            for (int i = this.rangeStart; i <= this.rangeEnd; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            sleep();
        }
    }

    public int getRangeStart() {
        return this.rangeStart;
    }

    public int getRangeEnd() {
        return this.rangeEnd;
    }

    private void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Thread stop!");
        }
    }
}
