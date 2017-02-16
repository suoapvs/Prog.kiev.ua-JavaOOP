package com.yurii.salimov.lesson03.task05;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public abstract class Figure {

    @Override
    public String toString() {
        return getName() + ", area = " + getArea();
    }

    public abstract double getArea();

    public abstract String getName();
}
