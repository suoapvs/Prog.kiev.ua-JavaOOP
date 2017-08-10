package com.yurii.salimov.lesson07.task01;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Task implements Runnable {

    private final InFile file;
    private final String text;

    public Task(final InFile file, final String text) {
        this.file = file;
        this.text = text;
    }

    @Override
    public void run() {
        this.file.write(this.text);
    }

    public String getText() {
        return this.text;
    }
}
