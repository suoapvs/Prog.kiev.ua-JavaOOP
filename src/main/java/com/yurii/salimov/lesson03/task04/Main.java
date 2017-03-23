package com.yurii.salimov.lesson03.task04;

/**
 * 3.4 Написать программу, которая будет рисовать на консоли прямоугольник с заданными длинами сторон.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final int width = 10;
        final int height = 4;

        final Rectangle rectangle1 = new Rectangle(height, width);
        System.out.println(rectangle1);
        rectangle1.draw();

        final Rectangle rectangle2 = new Rectangle(2 * height, 2 * width);
        System.out.println(rectangle2);
        rectangle2.draw();

        final Rectangle rectangle3 = Rectangle.combine(rectangle1, rectangle2);
        System.out.println(rectangle3);
        rectangle3.draw();
    }
}
