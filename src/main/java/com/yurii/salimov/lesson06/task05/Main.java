package com.yurii.salimov.lesson06.task05;

/**
 * 6.5 * Копирование файла блоками (1 поток на блок).
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        try {
            final CopyFile copyFile = new CopyFile("c:\\SomeFile.pdf", "c:\\SomeFile_COPY.pdf", 10);
            final Thread th = new Thread(copyFile);
            th.start();
            th.join();
            System.out.println("Copying is completed!");
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}
