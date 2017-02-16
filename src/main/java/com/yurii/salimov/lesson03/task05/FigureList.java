package com.yurii.salimov.lesson03.task05;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class FigureList {

    private Figure[] list = new Figure[10];
    private int counter;

    public void add(Figure figure) {
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

    public Figure get(int index) {
        return this.list[index];
    }

    public int getCounter() {
        return this.counter;
    }

    private void checkList() {
        if (this.counter == this.list.length) {
            resizeList(this.list.length * 3 / 2 + 1);
        }
    }

    private void resizeList(int newLength) {
        final Figure[] list = new Figure[newLength];
        System.arraycopy(this.list, 0, list, 0, this.list.length);
        this.list = list;
    }
}
