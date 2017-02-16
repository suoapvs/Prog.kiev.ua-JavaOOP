package com.yurii.salimov.lesson03.task05;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Circle extends Figure {

    private static final String NAME = "Circle";

    private double radius;

    public Circle(double radius) {
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

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static Circle combine(final Circle circle1, final Circle circle2) {
        return new Circle(circle1.getRadius() + circle2.getRadius());
    }
}
