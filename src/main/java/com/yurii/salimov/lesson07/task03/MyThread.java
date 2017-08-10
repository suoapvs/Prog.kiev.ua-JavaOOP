package com.yurii.salimov.lesson07.task03;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class MyThread implements Runnable {

    private final Matrix matrix;
    private final int indexI;
    private final int indexJ;

    public MyThread(final Matrix matrix, final int indexI, final int indexJ) {
        this.matrix = matrix;
        this.indexI = indexI;
        this.indexJ = indexJ;
    }

    @Override
    public void run() {
        this.matrix.calculation(this.indexI, this.indexJ);
    }

    public Matrix getMatrix() {
        return this.matrix;
    }

    public int getIndexI() {
        return this.indexI;
    }

    public int getIndexJ() {
        return this.indexJ;
    }
}
