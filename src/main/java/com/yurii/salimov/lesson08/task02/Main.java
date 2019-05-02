package com.yurii.salimov.lesson08.task02;

import java.util.ArrayList;
import java.util.List;

/**
 * 8.2 Написать метод, который создаст список, положит в него
 * 10 элементов, затем удалит первые два и последний, а
 * затем выведет результат на экран.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        task();
    }

    private static void task() {
        final List<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(Integer.toString(i));
        }
        strings.remove(0);
        strings.remove(0);
        strings.remove(strings.size() - 1);
        System.out.println(strings);
    }
}
