package com.yurii.salimov.lesson06.task04;

/**
 * 6.4 Создать поток, который создаст 50 потоков, каждый их которых
 * выведет на экран свой номер и дождется, пока его прервут.
 * Прерывание дочерних потоков должно выполнятся из потока их
 * порождающего.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        try {
            final Thread thread = new ParentThread();
            thread.start();
            Thread.sleep(5000);
            thread.interrupt();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}
