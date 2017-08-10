package com.yurii.salimov.lesson05.task02;

/**
 * 5.2 Написать рекурсивную ф-ю для вывода на экран всех файлов и каталогов,
 * имя которых длиннее 5 символов и вторая буква равна ‘A’.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final String directory = "c:/";
        final Criterion criterion = new CriterionImpl();
        final Finder finder = new Finder(directory, criterion);
        finder.findAndPrint();
    }
}
