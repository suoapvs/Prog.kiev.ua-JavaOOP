package com.yurii.salimov.lesson08.task05;

import java.util.Collection;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface MyList<T> {

    boolean add(T element);

    void add(int index, T object);

    boolean addAll(Collection<? extends T> objects);

    boolean addAll(int index, Collection<T> objects);

    T get(int index);

    T set(int index, T object);

    T remove(int index);

    boolean remove(T object);

    void clear();

    boolean contains(T object);

    int size();

    boolean isEmpty();

    int indexOf(T object);

    int lastIndexOf(T object);

    @Override
    boolean equals(Object object);

    @Override
    int hashCode();
}
