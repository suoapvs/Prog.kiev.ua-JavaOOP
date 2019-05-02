package com.yurii.salimov.lesson08.task05;

import java.util.Random;

/**
 * 8.5 Написать свою реализацию классов ArrayList и LinkedList.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final int number = 1000;
        final int iterations = 10;
        System.out.println("MyArrayList: " + getAverageTime(new MyArrayList<>(), number, iterations) + " ms");
        System.out.println("MyLinkedList: " + getAverageTime(new MyLinkedList<>(), number, iterations) + " ms");
    }

    private static long getAverageTime(final MyList<? super User> list, final int number, final int iterations) {
        long time = 0;
        for (int i = 0; i < iterations; i++) {
            time += getTime(list, number);
        }
        return time / iterations;
    }

    private static long getTime(final MyList<? super User> list, final int number) {
        final long start = System.currentTimeMillis();
        addObjects(list, number);
        final long finish = System.currentTimeMillis();
        return (finish - start);
    }

    private static void addObjects(final MyList<? super User> list, final int number) {
        for (int i = 0; i < number; i++) {
            list.add(
                    (int) (Math.random() * list.size()),
                    new User("Name " + i, "Surname " + i)
            );
        }
    }
}
