package com.yurii.salimov.lesson10.task03_04;

import java.util.*;

/**
 * 10.3 Решить задачу подсчета повторяющихся элементов в массиве с помощью HashMap.
 *
 * 10.4 Пользователь вводит набор чисел в виде одной строки (“1, 2, 3, 4, 4, 5”).
 * Избавиться от повторяющихся элементов в строке и вывести
 * результат на экран.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final Integer[] arrayInt = {0, 1, 9, 2, 8, 3, 7, 4, 6, 5, 5, 6, 4, 7, 3, 8, 2, 9, 1, 0};
        final List<Integer> listInt = new Unique<>(arrayInt).getNonDuplicateList();
        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(listInt.toArray()));
        System.out.println("The number of repetitions = " + (arrayInt.length - listInt.size()));

        System.out.println();

        System.out.println("Enter a set of numbers:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        final List<String> listString = new Unique<String>(text).getNonDuplicateList();
        System.out.println(Arrays.toString(listString.toArray()));
    }
}
