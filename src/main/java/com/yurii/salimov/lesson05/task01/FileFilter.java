package com.yurii.salimov.lesson05.task01;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class FileFilter implements FilenameFilter {

    private String[] ends;

    public FileFilter(final String[] ends) {
        this.ends = ends;
    }

    @Override
    public boolean accept(final File dir, final String name) {
        boolean result = false;
        for (String ex : this.ends) {
            if (name.endsWith(ex)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
