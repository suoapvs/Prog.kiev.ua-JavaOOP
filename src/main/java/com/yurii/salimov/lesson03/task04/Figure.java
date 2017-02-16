package com.yurii.salimov.lesson03.task04;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public abstract class Figure {

    @Override
    public String toString() {
        return "Area = " + getArea();
    }

    public abstract void draw();

    public abstract double getArea();
}
