package com.yurii.salimov.lesson10.task05;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Database<K, V> implements Serializable {

    private static final long serialVersionUID = 1L;

    private final HashMap<K, V> map = new HashMap<>();

    public void add(final K key, final V value) {
        this.map.put(key, value);
    }

    public void delete(final K key) {
        this.map.remove(key);
    }

    public V get(final K key) {
        return this.map.get(key);
    }

    @Override
    public String toString() {
        if (this.map.isEmpty()) {
            return "Database is empty!";
        }
        final StringBuilder sb = new StringBuilder();
        for (Map.Entry<K, V> entry : this.map.entrySet()) {
            sb.append(entry.getKey())
                    .append(" ")
                    .append(entry.getValue());
        }
        return sb.toString();
    }
}
