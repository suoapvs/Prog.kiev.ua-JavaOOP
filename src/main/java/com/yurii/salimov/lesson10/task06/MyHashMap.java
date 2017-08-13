package com.yurii.salimov.lesson10.task06;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class MyHashMap<K, V> implements MyMap<K, V> {

    public static class Entry<K, V> {

        private K key;
        private V value;

        public Entry(final K key, final V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }

        public void setValue(final V value) {
            this.value = value;
        }
    }

    private static final int DEFAULT_CAPACITY = 16;
    private List[] arr;

    public MyHashMap(final int capacity) {
        this.arr = new LinkedList[capacity];
    }

    public MyHashMap() {
        this.arr = new LinkedList[DEFAULT_CAPACITY];
    }

    @Override
    public boolean containsValue(final V value) {
        List<Entry<K, V>> list;
        for (List ar : this.arr) {
            if (ar != null) {
                list = (LinkedList<Entry<K, V>>) ar;
                for (Entry<K, V> entry : list) {
                    if (entry.getValue().equals(value)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public Set<K> keySet() {
        final Set<K> set = new HashSet<>();
        LinkedList<Entry<K, V>> list;
        for (List ar : this.arr) {
            if (ar != null) {
                list = (LinkedList<Entry<K, V>>) ar;
                set.addAll(list.stream().map(Entry::getKey).collect(Collectors.toList()));
            }
        }
        return set;
    }

    public Set<Entry<K, V>> entrySet() {
        final Set<Entry<K, V>> set = new HashSet<>();
        LinkedList<Entry<K, V>> list;
        for (List ar : this.arr) {
            if (ar != null) {
                list = (LinkedList<Entry<K, V>>) ar;
                set.addAll(list);
            }
        }
        return set;
    }

    @Override
    public void put(final K key, final V value) {
        final Entry<K, V> entry = new Entry<>(key, value);
        final int hashCode = key.hashCode();
        final int index = Math.abs(hashCode % this.arr.length);
        if (this.arr[index] == null) {
            arr[index] = new LinkedList<>();
        }
        final List<Entry<K, V>> list = (LinkedList<Entry<K, V>>) arr[index];
        for (Entry<K, V> ent : list) {
            if (ent.getKey().equals(entry.getKey())) {
                ent.setValue(entry.getValue());
                return;
            }
        }
        list.add(entry);
    }

    @Override
    public V get(final K key) {
        final int hashCode = key.hashCode();
        final int index = Math.abs(hashCode % this.arr.length);
        if (this.arr[index] == null) {
            return null;
        }
        final LinkedList<Entry<K, V>> list = (LinkedList<Entry<K, V>>) this.arr[index];
        for (Entry<K, V> entry : list) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public boolean containsKey(final K key) {
        return get(key) != null;
    }

    @Override
    public int size() {
        List<Entry<K, V>> list;
        int size = 0;
        for (Object ar : this.arr) {
            list = (LinkedList<Entry<K, V>>) ar;
            if (list != null) {
                size += list.size();
            }
        }
        return size;
    }

    public void setCapacity(final int capacity) {
        this.arr = new LinkedList[capacity];
    }
}
