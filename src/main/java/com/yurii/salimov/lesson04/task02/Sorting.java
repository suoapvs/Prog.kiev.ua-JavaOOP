package com.yurii.salimov.lesson04.task02;

import java.util.Arrays;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Sorting {

    public enum Type {
        DEFAULT, BUBBLE, INSERTION, GNOME
    }

    private final Figure[] figures;

    private Type sortingType;

    public Sorting(final Figure[] figures) {
        this(figures, Type.DEFAULT);
    }

    public Sorting(final Figure[] figures, final Type sortingType) {
        this.figures = figures;
        this.sortingType = sortingType;
    }

    public Figure[] sort() {
        switch (sortingType) {
            case DEFAULT:
                systemSort(this.figures);
                break;
            case BUBBLE:
                bubbleSort(this.figures);
                break;
            case INSERTION:
                insertionSort(this.figures);
                break;
            case GNOME:
                gnomeSort(this.figures);
                break;
            default:
                systemSort(this.figures);
        }
        return this.figures;
    }


    private static void systemSort(final Figure[] list) {
        Arrays.sort(list, new FigureComparator<>());
    }

    private static void bubbleSort(final Figure[] list) {
        Figure temp;
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].getArea() < list[i].getArea()) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    private static void insertionSort(final Figure[] list) {
        Figure temp;
        int i;
        for (int j = 1; j < list.length; j++) {
            temp = list[j];
            i = j - 1;
            while (i >= 0 && list[i].getArea() > temp.getArea()) {
                list[i + 1] = list[i];
                i--;
            }
            list[i + 1] = temp;
        }
    }

    private static void gnomeSort(final Figure[] list) {
        int j = 0;
        Figure temp;
        while (j < list.length) {
            if (j == 0 || list[j - 1].getArea() <= list[j].getArea()) {
                j++;
            } else {
                temp = list[j];
                list[j] = list[j - 1];
                list[j - 1] = temp;
                j--;
            }
        }
    }
}
