package com.yurii.salimov.lesson08.task04;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class FileEvents implements IFileEvents {

    @Override
    public void onFileAdded(final String path) {
        System.out.println("File added: " + path);
    }

    @Override
    public void onFileDeleted(final String path) {
        System.out.println("File deleted: " + path);
    }
}
