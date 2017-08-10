package com.yurii.salimov.lesson04.task01;

import java.util.Arrays;

/**
 * 4.1 Модифицировать код для сортировки Human чтобы элементы упорядочивались по убыванию.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final Human[] list = {new Human(20), new Human(40), new Human(3), new Human(7)};

        //Arrays.sort(list);
        //Arrays.sort(list, new HumanComparator());
        Arrays.sort(list, (h1, h2) -> h2.getAge() - h1.getAge());

        for (Human human : list) {
            System.out.println(human.getAge());
        }
    }
}
