package com.yurii.salimov.lesson05.task07;

import java.io.IOException;

/**
 * 5.7 Написать программу, которая скопирует несколько файлов в один.
 * Подумать как для этого использовать java.io.SequenceInputStream.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final String dirName = "c:/dir1";
        try {
            new Copywriter(dirName).copy();
        } catch (IOException ex) {
            ex.getMessage();
        }
        System.out.println("Done!");
    }
}
