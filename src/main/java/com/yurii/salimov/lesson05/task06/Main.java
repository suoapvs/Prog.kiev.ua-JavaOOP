package com.yurii.salimov.lesson05.task06;

import java.io.IOException;

/**
 * 5.6 Разобраться с java.io.BufferedInputStream и java.io. BufferedOutputStream.
 * Подумать как улучшить программу №3 с помощью этих классов.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final String srcPath = "c:\\file.txt";
        final String oldWord = "Hello";
        final String newWord = "1234";
        try {
            String text = new Loader(srcPath).read();
            text = text.replace(oldWord, newWord);
            new Loader(srcPath, text).write();
        } catch (IOException ex) {
            ex.getMessage();
        }
        System.out.println("Done!");
    }
}
