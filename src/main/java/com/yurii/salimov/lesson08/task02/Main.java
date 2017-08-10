package com.yurii.salimov.lesson08.task02;

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
        final Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        final Conversion<Integer> list = new Conversion<>(numbers);
        list.remove(0, 2); // удаляем первые 2 элемент
        list.remove(list.getList().size() - 1); // удаляем последний элемент
        System.out.println(list);

        // заполним лист поэлементно
        list.clear();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.remove(0, 2); // удаляем первые 2 элемент
        list.remove(list.getList().size() - 1); // удаляем последний элемент
        System.out.println(list);
    }
}
