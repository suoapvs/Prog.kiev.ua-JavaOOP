
package com.yurii.salimov.lesson08.task01;

import java.util.List;

/**
 * 8.1 Написать метод для конвертации массива строк/чисел в список.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        final List<Integer> numbersList = new Conversion<>(numbers).convert();
        System.out.println(numbersList);

        final String[] lines = {"q", "w", "e", "r", "t", "y"};
        final List<String> linesList = new Conversion<>(lines).convert();
        System.out.println(linesList);
    }
}
