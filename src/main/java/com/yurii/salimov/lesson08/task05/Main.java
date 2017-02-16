package com.yurii.salimov.lesson08.task05;

/**
 * 5. Написать свою реализацию классов ArrayList и LinkedList.
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

    private static long getAverageTime(MyList<User> list, int number, int iterations) {
        long time = 0;
        for (int i = 0; i < iterations; i++) {
            time += getTime(list, number);
        }
        return time / iterations;
    }

    private static long getTime(MyList<User> list, int number) {
        long start = System.currentTimeMillis();
        addObjects(list, number);
        long finish = System.currentTimeMillis();
        return (finish - start);
    }

    private static MyList<User> addObjects(MyList<User> list, int number) {
        for (int i = 0; i < number; i++) {
            User user = new User("Name " + i, "Surname " + i);
            int index = (int) (Math.random() * list.size());
            list.add(index, user);
        }
        return list;
    }
}
