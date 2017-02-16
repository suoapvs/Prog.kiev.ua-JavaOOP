package com.yurii.salimov.lesson02.task05;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Rectangle extends Figure {

    private static final String NAME = "Rectangle";

    private double width;
    private double height;

    public Rectangle(final double width, final double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(final double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(final double height) {
        this.height = height;
    }
}
