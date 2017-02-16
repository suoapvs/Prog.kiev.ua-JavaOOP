package com.yurii.salimov.lesson06.task01;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Counter extends Thread {

    private int rangeStart;
    private int rangeEnd;

    public Counter(int rangeStart, int rangeEnd) {
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
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                break;
            }
        }
    }

    public int getRangeStart() {
        return this.rangeStart;
    }

    public void setRangeStart(int rangeStart) {
        this.rangeStart = rangeStart;
    }

    public int getRangeEnd() {
        return this.rangeEnd;
    }

    public void setRangeEnd(int end) {
        this.rangeEnd = end;
    }
}
