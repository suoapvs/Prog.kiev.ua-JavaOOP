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
        new Rectangle(height, width).draw();
        new Rectangle(2 * height, 2 * width).draw();
    }
}
