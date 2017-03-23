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
        final Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        final UniversalArray<Integer> array = new UniversalArray<>(numbers);
        System.out.println(array);
    }
}
