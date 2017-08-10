package com.yurii.salimov.lesson06.task05;

import java.io.*;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class CopyFile implements Runnable {

    private final File inFile;
    private final File outFile;
    private final int number;

    public CopyFile(final String inFile, final String outFile, final int number) {
        this.inFile = new File(inFile);
        this.outFile = new File(outFile);
        this.number = number;
    }

    @Override
    public void run() {
        if (this.inFile.exists() && this.inFile.isFile()) {
            try (final InputStream  inputStream = new FileInputStream(this.inFile);
                 final OutputStream outputStream = new FileOutputStream(this.outFile);) {
                final long size = this.inFile.length() / this.number + 1;
                final Block block = new Block(inputStream, outputStream, size);
                createThreads(block, this.number);
                Thread.sleep(100);
            } catch (Exception ex) {
                ex.getMessage();
            }
        } else {
            System.out.println("The specified file is not available!");
        }
    }

    public File getInputFile() {
        return this.inFile;
    }

    public File getOutputFile() {
        return this.outFile;
    }

    private static void createThreads(final Runnable runnable, final int number) {
        for (int i = 0; i < number; i++) {
            new Thread(runnable).start();
        }
    }
}
