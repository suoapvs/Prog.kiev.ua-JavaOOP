package com.yurii.salimov.lesson05.task03;

import java.io.IOException;

/**
 * 5.3 Написать программу, которая считает текстовый файл, заменит в нем все
 * слова "Hello" на "1234" и запишет изменения в тот-же файл.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) throws IOException {
        final String srcPath = "c:\\file.txt";
        final String oldWord = "1234";
        final String newWord = "Hello";
        try {
            final Loader loader = new Loader(srcPath);
            String text = loader.read();
            text = text.replace(oldWord, newWord);
            loader.setText(text);
            loader.write();
        } catch (IOException ex) {
            ex.getMessage();
        }
        System.out.println("Done!");
    }
}
