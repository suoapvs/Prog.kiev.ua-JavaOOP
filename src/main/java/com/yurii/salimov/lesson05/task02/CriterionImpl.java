package com.yurii.salimov.lesson05.task02;

import java.io.File;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class CriterionImpl implements Criterion {

    @Override
    public boolean check(final File file) {
        return (file.getName().length() > 5) && (file.getName().charAt(1) == 'A');
    }
}
