
package com.yurii.salimov.lesson08.task01;

/**
 * 8.1 Написать метод для конвертации массива строк/чисел в список.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        final Conversion<Integer> integerConversion = new Conversion<>(numbers);
        System.out.println(integerConversion);

        final String[] lines = {"q", "w", "e", "r", "t", "y"};
        final Conversion<String> stringConversion = new Conversion<>(lines);
        System.out.println(stringConversion);
    }
}
