package com.yurii.salimov.lesson05.task02;

import java.io.File;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class CriterionImpl implements Criterion {

    private final static int CORRECT_FILE_LENGTH = 5;
    private final static char FILE_NAME = 'A';

    @Override
    public boolean check(final File file) {
        return checkFileLength(file) && checkFileName(file);
    }

    private boolean checkFileLength(final File file) {
        return file.getName().length() > CORRECT_FILE_LENGTH;
    }

    private boolean checkFileName(final File file) {
        return file.getName().charAt(1) == FILE_NAME;
    }
}
