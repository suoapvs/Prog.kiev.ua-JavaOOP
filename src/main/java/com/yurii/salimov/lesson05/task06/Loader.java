package com.yurii.salimov.lesson05.task06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Loader {

    private final String fileName;
    private String text;

    public Loader(final String fileName) {
        this(fileName, "");
    }

    public Loader(final String fileName, final String text) {
        this.fileName = fileName;
        this.text = text;
    }

    public String read() throws IOException {
        try (final FileInputStream fis = new FileInputStream(this.fileName);
             final BufferedInputStream bis = new BufferedInputStream(fis)) {
            byte[] buf = new byte[bis.available()];
            bis.read(buf);
            this.text = new String(buf);
            return this.text;
        }
    }

    public void write() throws IOException {
        try (final FileOutputStream fos = new FileOutputStream(this.fileName);
             final BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            byte[] buf = this.text.getBytes();
            bos.write(buf, 0, buf.length);
        }
    }
}
