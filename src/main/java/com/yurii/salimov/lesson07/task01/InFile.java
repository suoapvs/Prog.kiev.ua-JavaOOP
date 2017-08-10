package com.yurii.salimov.lesson07.task01;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class InFile {

    private final String path;

    public InFile(final String path) {
        this.path = path;
    }

    public synchronized void write(final String text) {
        try (RandomAccessFile out = new RandomAccessFile(this.path, "rw")) {
            out.seek(out.length());
            out.write(text.getBytes());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getPath() {
        return this.path;
    }
}
