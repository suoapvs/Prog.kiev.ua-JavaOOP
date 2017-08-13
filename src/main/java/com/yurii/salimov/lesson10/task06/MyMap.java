package com.yurii.salimov.lesson10.task06;

import java.util.Set;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface MyMap<K, V> {

    void put(K key, V value);

    V get(K key);

    boolean containsKey(K key);

    int size();

    boolean containsValue(V value);

    Set<K> keySet();
}
