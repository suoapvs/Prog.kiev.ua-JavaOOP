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
        while (true) {
            for (int i = this.rangeStart; i <= this.rangeEnd; i++) {
                System.out.print(i + " ");
                sleep();
                if (isInterrupted()) {
                    return;
                }
            }
            System.out.println();
        }
    }

    // эмитируем бурную деятельность...
    private void sleep() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            interrupt();
        }
    }
}
