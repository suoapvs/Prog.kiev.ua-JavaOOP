package com.yurii.salimov.lesson09.task01_02_03;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class MySet<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private final Set<T> set = new HashSet<>();

    public boolean add(final T obj) {
        return this.set.add(obj);
    }

    public boolean addAll(final Collection<T> collection) {
        return this.set.addAll(collection);
    }

    public void clear() {
        this.set.clear();
    }

    public void print() {
        int counter = 0;
        for (T object : set) {
            System.out.println(++counter + ") " + object);
        }
    }

    public Set getSet() {
        return set;
    }

    public int size() {
        return set.size();
    }
}
