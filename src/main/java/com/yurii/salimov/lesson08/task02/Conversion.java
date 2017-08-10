package com.yurii.salimov.lesson08.task02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Conversion<T> {

    private final List<T> list;

    public Conversion() {
        this.list = new ArrayList<>();
    }

    public Conversion(final T[] elements) {
        this.list = new ArrayList<>(Arrays.asList(elements));
    }

    @Override
    public String toString() {
        return "Conversion{list=" + this.list + '}';
    }

    public void add(final T element) {
        this.list.add(element);
    }

    public void remove(final int index) throws IndexOutOfBoundsException {
        checkIndex(index);
        this.list.remove(index);
    }

    public void remove(final int from, final int to) throws IndexOutOfBoundsException {
        checkIndex(from);
        checkIndex(to);
        this.list.subList(from, to).clear();
    }

    public void clear() {
        this.list.clear();
    }

    public List getList() {
        return this.list;
    }

    private void checkIndex(final int index) throws IndexOutOfBoundsException {
        if ((index < 0) || (index > this.list.size())) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + list.size());
        }
    }
}
