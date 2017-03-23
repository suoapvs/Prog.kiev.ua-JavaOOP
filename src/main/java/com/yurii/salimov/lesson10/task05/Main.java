package com.yurii.salimov.lesson10.task05;

/**
 * 10.5 Написать программу «База данных пользователей» с функциями
 * добавления, удаления, поиска и вывода информации о пользователе
 * по номеру.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final String baseFile = "dateBase.txt";
        final Menu menu = new Menu(baseFile);
        menu.show();
    }
}
