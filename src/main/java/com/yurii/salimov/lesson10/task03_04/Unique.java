package com.yurii.salimov.lesson10.task03_04;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Unique<T> {

    private final T[] array;

    public Unique(final T[] array) {
        this.array = array;
    }

    public Unique(final String value) {
        this((T[])value.replace(" ", "").split(","));
    }

    public List<T> getNonDuplicateList() {
        final Map<T, Object> map = new HashMap<>();
        final Object emptyObject = new Object();
        for (T arr : this.array) {
            map.put(arr, emptyObject);
        }
        return map.entrySet()
                .stream().map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
