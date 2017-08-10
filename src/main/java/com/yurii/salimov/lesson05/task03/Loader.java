package com.yurii.salimov.lesson05.task03;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Loader {

    private final String path;
    private String text;

    public Loader(final String path) {
        this(path, "");
    }

    public Loader(final String path, final String text) {
        this.path = path;
        this.text = text;
    }

    public String read() throws IOException {
        try (RandomAccessFile in = new RandomAccessFile(path, "r")) {
            byte[] buf = new byte[(int) in.length()];
            in.read(buf);
            this.text = new String(buf);
            return this.text;
        }
    }

    public void write() throws IOException {
        try (RandomAccessFile out = new RandomAccessFile(path, "rw")) {
            byte[] buf = text.getBytes();
            out.setLength(0);
            out.write(buf);
        }
    }

    public String getPath() {
        return this.path;
    }

    public String getText() {
        return this.text;
    }

    public void setText(final String text) {
        this.text = text;
    }
}
