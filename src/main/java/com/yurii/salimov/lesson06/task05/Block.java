package com.yurii.salimov.lesson06.task05;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Block implements Runnable {

    private final InputStream inStream;
    private final OutputStream outStream;
    private final long blockSize;

    public Block(final InputStream in, final OutputStream out, final long size) {
        this.inStream = in;
        this.outStream = out;
        this.blockSize = size;
    }

    @Override
    public void run() {
        copy();
    }

    private synchronized void copy() {
        try {
            final byte[] buffer = new byte[(int) (this.blockSize / 100)];
            int size;
            while (((size = this.inStream.read(buffer)) > 0) && (size < this.blockSize)) {
                this.outStream.write(buffer, 0, size);
            }
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
