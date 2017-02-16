package com.yurii.salimov.lesson08.task05;

import java.util.Collection;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class MyLinkedList<T> implements MyList<T> {

    private static class Entry<T> {
        T element;
        Entry<T> next;
        Entry<T> prev;

        Entry(T element, Entry<T> next, Entry<T> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private Entry<T> header;
    private int size;

    public MyLinkedList() {
        this.header = new Entry<>(null, null, null);
        this.header.next = header;
        this.header.prev = header;
    }

    public MyLinkedList(Collection<? extends T> objects) {
        this();
        addAll(objects);
    }

    @Override
    public boolean add(T element) {
        Entry<T> newEntry = new Entry<>(element, this.header, this.header.prev);
        newEntry.prev.next = newEntry;
        newEntry.next.prev = newEntry;
        this.size++;
        return true;
    }

    @Override
    public void add(int index, T object) {
        checkIndex(index);
        Entry<T> entry = entry(index);
        Entry<T> newEntry = new Entry<>(object, entry, entry.prev);
        newEntry.prev.next = newEntry;
        newEntry.next.prev = newEntry;
        this.size++;
    }

    @Override
    public boolean addAll(Collection<? extends T> objects) {
        for (T object : objects) {
            add(object);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<T> objects) {
        checkIndex(index);
        int i = index;
        for (T object : objects) {
            add(i++, object);
        }
        return true;
    }

    @Override
    public T get(int index) {
        return entry(index).element;
    }

    @Override
    public T set(int index, T object) {
        checkIndex(index);
        T value = entry(index).element;
        entry(index).element = object;
        return value;
    }

    @Override
    public T remove(int index) {
        checkIndex(index);
        //T value = entry(index).element;
        Entry<T> entry = entry(index);
        T value = entry.element;
        entry.prev.next = entry.next;
        entry.next.prev = entry.prev;
        entry.next = null;
        entry.prev = null;
        this.size--;
        return value;
    }

    @Override
    public boolean remove(T object) {
        int index = indexOf(object);
        remove(index);
        return true;
    }

    @Override
    public void clear() {
        this.header = new Entry<>(null, this.header, this.header);
        this.size = 0;
    }

    @Override
    public boolean contains(T object) {
        return indexOf(object) >= 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int indexOf(T object) {
        Entry<T> entry = this.header;
        for (int i = 0; i < this.size; i++) {
            entry = entry.next;
            if (object.equals(entry.element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T object) {
        Entry<T> entry = this.header.prev;
        for (int i = this.size - 1; i > 0; i--) {
            if (object.equals(entry.element)) {
                return i;
            }
            entry = entry.prev;
        }
        return -1;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }

        MyLinkedList<T> other = (MyLinkedList<T>) object;
        if (this.size != other.size) {
            return false;
        }
        Entry<T> entry1 = this.header;
        Entry<T> entry2 = other.header;
        for (int i = 0; i < size; i++) {
            entry1 = entry1.next;
            entry2 = entry2.next;
            if (!entry1.element.equals(entry2.element)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        Entry<T> entry = this.header;
        for (int i = 0; i < this.size; i++) {
            entry = entry.next;
            result += entry.element.hashCode();
        }
        return result;
    }

    private Entry<T> entry(int index) throws IndexOutOfBoundsException {
        checkIndex(index);
        Entry<T> entry = this.header;
        if (index < (this.size >> 1)) {
            for (int i = 0; i <= index; i++) {
                entry = entry.next;
            }
        } else {
            for (int i = this.size; i > index; i--) {
                entry = entry.prev;
            }
        }
        return entry;
    }

    private void checkIndex(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }
    }
}
