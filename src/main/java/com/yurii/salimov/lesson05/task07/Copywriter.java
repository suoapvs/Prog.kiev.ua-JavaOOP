package com.yurii.salimov.lesson05.task07;

import java.io.*;
import java.util.Vector;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Copywriter {

    private final static int BUF_SIZE = 2048;

    private final String path;

    public Copywriter(final String path) {
        this.path = path;
    }

    public void copy() throws IOException {
        final File directory = new File(this.path);
        checkDir(directory);
        copy(loadVector(directory), this.path);
    }

    public String getPath() {
        return this.path;
    }

    private static void checkDir(final File directory) {
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    private static Vector loadVector(final File directory) throws FileNotFoundException {
        Vector vector = new Vector();
        for (File file : directory.listFiles()) {
            vector.addElement(new FileInputStream(file));
        }
        return vector;
    }

    private static void copy(final Vector vector, final String path) throws IOException {
        try (SequenceInputStream sis = new SequenceInputStream(vector.elements());
             FileOutputStream fos = new FileOutputStream(path + "\\" + "OUT.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            final byte[] buf = new byte[BUF_SIZE];
            int size;
            do {
                size = sis.read(buf, 0, buf.length);
                if (size > 0) {
                    bos.write(buf, 0, size);
                }
            } while (size > 0);
        }
    }
}
