package com.yurii.salimov.lesson06.task06;

import java.io.*;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
final class CopyFile implements Runnable {

    private final File inFile;
    private final File outFile;
    private final IProgress progress;
    private int blockSize;

    public CopyFile(
            final String inFile,
            String outFile,
            final IProgress progress,
            final int blockSize
    ) {
        this.inFile = new File(inFile);
        this.outFile = new File(outFile);
        this.progress = progress;
        this.blockSize = blockSize;
    }

    @Override
    public void run() {
        if (this.inFile.exists() && this.inFile.isFile()) {
            copy();
        } else {
            System.out.println("The specified file is not available!");
        }
    }

    private void copy() {
        try (FileInputStream fis = new FileInputStream(this.inFile);
             FileOutputStream fos = new FileOutputStream(this.outFile);) {
            byte[] buffer = new byte[this.blockSize];
            int size;
            while ((size = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, size);
                if (this.progress != null) {
                    this.progress.update((double) size * 100 / this.inFile.length());
                }
            }
        } catch (IOException ex) {
            ex.getMessage();
        }
    }

    public File getInputFile() {
        return this.inFile;
    }

    public File getOutputFile() {
        return this.outFile;
    }

    public int getBlockSize() {
        return this.blockSize;
    }

    public void setBlockSize(int size) {
        this.blockSize = size;
    }

    public int getProgress() {
        return this.progress.getProgress();
    }
}
