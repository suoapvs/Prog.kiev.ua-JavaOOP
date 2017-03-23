package com.yurii.salimov.lesson01.task02;

/**
 * 1.2 Написать класс, который умеет считать
 * количество созданных объектов этого класса
 * (static).
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Counter();
        }
        System.out.println(Counter.getCount());
    }
}
