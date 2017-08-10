package com.yurii.salimov.lesson06.task07;

import java.math.BigInteger;

/**
 * 6.7 Разобраться с методом fact (рекурсия).
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        try {
            final int value = 100;
            final int threadsNumber = 3;
            final Finish finish = new Finish();
            start(value, threadsNumber, finish);
            Thread.sleep(1000);
            System.out.println(value + "! = " + finish.getResult());
        } catch (InterruptedException ex) {
            ex.getMessage();
        }
    }

    private static void start(final int arg, final int threadsNumber, final IFinish finish) {
        int start = arg;
        int end;
        for (int i = 0; i < threadsNumber; i++) {
            end = start - arg / threadsNumber;
            if (end <= 0) {
                end = 1;
            }
            final Task task = new Task(
                    BigInteger.valueOf(start),
                    BigInteger.valueOf(end),
                    finish
            );
            new Thread(task).start();
            start = end - 1;
        }
    }
}
