package com.yurii.salimov.lesson08.task01;

import java.util.Arrays;
import java.util.List;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Conversion<T> {

    private final T[] elements;
    private List<T> conversionElements;

    public Conversion(final T[] elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "Conversion{" +
                "elements=" + Arrays.toString(this.elements) +
                ", conversionElements=" + getConversionElements() +
                '}';
    }

    public List<T> convert() {
        this.conversionElements = Arrays.asList(this.elements);
        return this.conversionElements;
    }

    public T[] getElements() {
        return this.elements;
    }

    public List<T> getConversionElements() {
        if (this.conversionElements == null) {
            convert();
        }
        return this.conversionElements;
    }
}
