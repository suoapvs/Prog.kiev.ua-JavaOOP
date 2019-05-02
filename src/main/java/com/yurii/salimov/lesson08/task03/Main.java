package com.yurii.salimov.lesson08.task03;

/**
 * 8.3 Написать класс, который умеет хранить в себе массив
 * любых типов данных (int, long etc.). Реализовать метод,
 * который возвращает любой элемент массива по индексу.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final Number[] numbers = {0, 1.4, 2, 3, 4, 5L, 6, 7.434, 8, 9};
        final UniversalArray<Number> array = new UniversalArray<>(numbers);
        System.out.println(array);
        System.out.println(array.get(3));
    }
}
