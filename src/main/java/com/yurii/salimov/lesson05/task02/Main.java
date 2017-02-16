package com.yurii.salimov.lesson05.task02;

/**
 * Написать рекурсивную ф-ю для вывода на экран всех файлов и каталогов,
 * имя которых длиннее 5 символов и вторая буква равна ‘A’.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        new Finder("c:/", new CriterionImpl()).findAndPrint();
    }
}
