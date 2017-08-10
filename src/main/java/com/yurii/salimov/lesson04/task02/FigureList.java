package com.yurii.salimov.lesson04.task02;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class FigureList {

    private final static int DEFAULT_CAPACITY = 10;

    private Figure[] list;
    private int counter;

    public FigureList() {
        this(DEFAULT_CAPACITY);
    }

    public FigureList(final int capacity) {
        if (capacity > 0) {
            this.list = new Figure[capacity];
        } else {
            this.list = new Figure[DEFAULT_CAPACITY];
        }
    }

    public void add(final Figure figure) {
        checkList();
        this.list[this.counter++] = figure;
    }

    public void showAllList() {
        System.out.println("------------------------------------------------");
        System.out.println("All figure:");
        for (int i = 0; i < this.counter; i++) {
            System.out.println((i + 1) + ") " + this.list[i]);
        }
        System.out.println("------------------------------------------------");
    }

    public void sort() {
        sort(Sorting.Type.DEFAULT);
    }

    public void sort(final Sorting.Type sortingType) {
        resizeList(this.counter);
        new Sorting(this.list, sortingType).sort();
    }

    public Figure get( final int index) {
        return this.list[index];
    }

    public Figure[] get() {
        return this.list;
    }

    public int getCounter() {
        return this.counter;
    }

    private void checkList() {
        if (this.counter == this.list.length) {
            resizeList(this.list.length * 3 / 2 + 1);
        }
    }

    private void resizeList( final int newLength) {
        final Figure[] list = new Figure[newLength];
        final int length = this.list.length < newLength ? this.list.length : newLength;
        System.arraycopy(this.list, 0, list, 0, length);
        this.list = list;
    }
}
