package com.yurii.salimov.lesson04.task02;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Circle extends Figure {

    private static final String NAME = "Circle";

    private final double radius;

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

    public static Circle combine(final Circle first, final Circle second) {
        final double radius = first.getRadius() + second.getRadius();
        return new Circle(radius);
    }
}
