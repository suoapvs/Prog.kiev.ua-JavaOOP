package com.yurii.salimov.lesson02.task02;

import java.util.Date;

/**
 * 2.2 Проект "Students": сделать поиск по фамилии, сделать поиск по дате рождения,
 * сделать ф-ю удаления студента из списка, предусмотреть выход за пределы списка.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final StudentList list = createList();

        System.out.println(list.findByName("Max"));
        System.out.println(list.findBySurname("Einstein"));

        System.out.println("\nOld list:");
        list.showAllList();
        list.delete(0);
        list.delete(3);
        System.out.println("\nNew list:");
        list.showAllList();
    }

    private static StudentList createList() {
        final StudentList list = new StudentList();
        list.add(new Student("Vova", "Ivanov", new Date(1986, 1, 1)));
        list.add(new Student("Vasya", "Pupkin", new Date(1970, 3, 25)));
        list.add(new Student("Max", "Planck", new Date(1858, 4, 23)));
        list.add(new Student("Albert", "Einstein", new Date(1879, 3, 14)));
        list.add(new Student("Isaak", "Newton", new Date(1642, 12, 25)));
        return list;
    }
}
