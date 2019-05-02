package com.yurii.salimov.lesson08.task03;

import java.util.Arrays;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class UniversalArray<T extends Number> {

    private final T[] array;

    public UniversalArray(final T[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.array);
    }

    public T get(final int index) throws ArrayIndexOutOfBoundsException {
        checkIndex(index);
        return this.array[index];
    }

    private void checkIndex(final int index) throws ArrayIndexOutOfBoundsException {
        if ((index < 0) || (index >= this.array.length)) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + this.array.length);
        }
    }
}
