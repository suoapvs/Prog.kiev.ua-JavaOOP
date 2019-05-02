package com.yurii.salimov.lesson08.task01;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final  class Conversion<T> {

    private final T[] elements;

    public Conversion(final T[] elements) {
        this.elements = elements;
    }

    public List<T> convert() {
        return Arrays.asList(this.elements);
    }
}
