package com.yurii.salimov.lesson08.task05;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class MyArrayList<T> implements MyList<T> {

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] elementData;

    private int size;

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            this.elementData = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        }
    }

    public MyArrayList(Collection<? extends T> objects) {
        this();
        addAll(objects);
    }

    @Override
    public boolean add(T object) {
        ensureCapacity(this.size + 1);
        this.elementData[this.size++] = object;
        return true;
    }

    @Override
    public void add(int index, T object) {
        checkIndex(index);
        ensureCapacity(this.size + 1);
        System.arraycopy(this.elementData, index, this.elementData, index + 1, this.size - index);
        this.elementData[index] = object;
        this.size++;
    }

    @Override
    public boolean addAll(Collection<? extends T> objects) {
        Object[] array = objects.toArray();
        int arrayLength = array.length;
        ensureCapacity(this.size + arrayLength);
        System.arraycopy(array, 0, this.elementData, this.size, arrayLength);
        this.size += arrayLength;
        return arrayLength != 0;
    }

    @Override
    public boolean addAll(int index, Collection<T> objects) {
        checkIndex(index);
        Object[] array = objects.toArray();
        int arrayLength = array.length;
        ensureCapacity(size + arrayLength);

        int numMoved = this.size - index;
        if (numMoved > 0) {
            System.arraycopy(this.elementData, index, this.elementData, index + arrayLength, numMoved);
        }

        System.arraycopy(array, 0, this.elementData, index, arrayLength);
        this.size += arrayLength;
        return arrayLength != 0;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return (T) this.elementData[index];
    }

    @Override
    public T set(int index, T object) {
        checkIndex(index);
        T value = (T) this.elementData[index];
        this.elementData[index] = object;
        return value;
    }

    @Override
    public T remove(int index) {
        checkIndex(index);
        T value = (T) this.elementData[index];
        int numMoved = this.size - index - 1;
        System.arraycopy(this.elementData, index + 1, this.elementData, index, numMoved);
        this.elementData[--this.size] = null;
        return value;
    }

    @Override
    public boolean remove(T object) {
        if (object == null) {
            for (int i = 0; i < this.size; i++) {
                if (this.elementData[i] == null) {
                    remove(i);
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (object.equals(elementData[i])) {
                    remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            this.elementData[i] = null;
        }
        this.size = 0;
    }

    @Override
    public boolean contains(T object) {
        return indexOf(object) >= 0;
    }

    @Override
    public int size() {
        return size;
    }

    public void trimToSize() {
        if (this.size < this.elementData.length) {
            this.elementData = Arrays.copyOf(this.elementData, this.size);
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int indexOf(T object) {
        if (object == null) {
            for (int i = 0; i < this.size; i++) {
                if (this.elementData[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (object.equals(elementData[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T object) {
        if (object == null) {
            for (int i = this.size - 1; i >= 0; i--) {
                if (this.elementData[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = this.size - 1; i >= 0; i--) {
                if (object.equals(this.elementData[i])) {
                    return i;
                }
            }
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
        MyArrayList other = (MyArrayList) object;
        if (this.size != other.size) {
            return false;
        }
        for (int i = 0; i < this.size; i++) {
            if (!this.elementData[i].equals(other.elementData[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return (Arrays.hashCode(this.elementData) + this.size);
    }

    private void ensureCapacity(int minCapacity) throws IndexOutOfBoundsException {
        if (minCapacity > this.elementData.length) {
            Object[] oldData = new Object[this.size];
            System.arraycopy(this.elementData, 0, oldData, 0, this.size);
            int newCapacity = this.size * 3 / 2 + 1;
            this.elementData = new Object[newCapacity];
            System.arraycopy(oldData, 0, this.elementData, 0, this.size);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }
    }
}
