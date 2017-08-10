package com.yurii.salimov.lesson01.task01;

/**
 * 1.1. Написать класс Circle (круг) по аналогии с
 * Rectangle и метод, который будет возвращать его
 * площадь.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final Circle circle = new Circle(10);
        System.out.println(circle.getArea());
    }
}
