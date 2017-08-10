package com.yurii.salimov.lesson04.task03_04_05;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class FileEvent implements IFileEvent {

    private final static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy  hh:mm:ss");

    @Override
    public void onFileAdded(final File file) {
        final Date date = new Date(file.lastModified());
        System.out.println("File added: " + file.getPath() + ", date: " + DATE_FORMAT.format(date));
    }
}
