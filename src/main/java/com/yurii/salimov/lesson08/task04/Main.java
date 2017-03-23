package com.yurii.salimov.lesson08.task04;

/**
 * 8.4 Написать монитор, которых хранит дату модификации
 * файлов и выводит сообщения при изменении в файлах*.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final String path = "c:/folder";
        final int timeout = 2000;
        final IFileEvents events = new FileEvents();
        new Monitor(path, timeout, events).start();
    }
}
