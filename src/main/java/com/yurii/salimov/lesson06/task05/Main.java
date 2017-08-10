package com.yurii.salimov.lesson06.task05;

/**
 * 6.5 * Копирование файла блоками (1 поток на блок).
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final String fromFile = "c:\\SomeFile.pdf";
        final String toFile = "c:\\SomeFile_COPY.pdf";
        final int blockNumber = 10;
        try {
            final CopyFile copyFile = new CopyFile(fromFile, toFile, blockNumber);
            final Thread th = new Thread(copyFile);
            th.start();
            th.join();
            System.out.println("Copying is completed!");
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}
