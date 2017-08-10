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
        return "UniversalArray{array=" + Arrays.toString(this.array) + '}';
    }

    public T[] getArray() {
        return this.array;
    }

    public T getElement(final int index) throws ArrayIndexOutOfBoundsException {
        checkIndex(index);
        return this.array[index];
    }

    public void setElement(final T value, final int index) throws ArrayIndexOutOfBoundsException {
        checkIndex(index);
        this.array[index] = value;
    }

    public int size() {
        return this.array.length;
    }

    private void checkIndex(final int index) throws ArrayIndexOutOfBoundsException {
        if ((index < 0) || (index >= this.array.length)) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + this.array.length);
        }
    }
}
