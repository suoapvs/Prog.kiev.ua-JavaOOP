package com.yurii.salimov.lesson06.task06;

/**
 * 6.6 Написать программу копирования файла с выводом прогресса в % на консоль.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        try {
            new Thread(getCopyFile()).start();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    private static CopyFile getCopyFile() {
        final String inputFile = "c:/inputFile.txt";
        final String outputFile = "c:/outputFile.txt";
        final IProgress progress = new Progress();
        final int blockSize = 10486760;
        return new CopyFile(inputFile, outputFile, progress, blockSize);
    }
}
