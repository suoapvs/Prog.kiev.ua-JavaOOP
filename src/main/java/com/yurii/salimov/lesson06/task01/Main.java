package com.yurii.salimov.lesson06.task01;

/**
 * 6.1 Модифицировать класс Counter так, чтобы он циклически выводил
 * числа из определенного диапазона.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        try {
            final Counter counter = new Counter(0, 10);
            counter.start();
            Thread.sleep(5000);
            counter.interrupt();
        } catch (InterruptedException ex) {
            ex.getMessage();
        }
    }
}
