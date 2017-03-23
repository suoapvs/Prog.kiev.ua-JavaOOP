package com.yurii.salimov.lesson07.task03;

/**
 * 7.3 Реализовать многопоточное перемножение квадратных матриц. Сравнить скорость
 * выполнения алгоритма с однопоточным решением.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        int size = 5;
        int rand = 10;
        final Matrix matrix = new Matrix(size, rand);
        createMyThreads(matrix, size);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        matrix.showAllMatrix();
    }

    private static void createMyThreads(final Matrix matrix, final int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                new Thread(new MyThread(matrix, i, j)).start();
            }
        }
    }
}


