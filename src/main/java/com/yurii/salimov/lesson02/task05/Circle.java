package com.yurii.salimov.lesson02.task05;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Circle extends Figure {

    private static final String NAME = "Circle";

    private double radius;

    public Circle(final double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(final double radius) {
        this.radius = radius;
    }
}
