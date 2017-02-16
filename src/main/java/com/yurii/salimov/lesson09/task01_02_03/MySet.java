package com.yurii.salimov.lesson09.task01_02_03;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class MySet<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private Set<T> set = new HashSet<>();

    public boolean add(T obj) {
        return set.add(obj);
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

    public void setSet(Set<T> set) {
        this.set = set;
    }

    public int size() {
        return set.size();
    }
}
