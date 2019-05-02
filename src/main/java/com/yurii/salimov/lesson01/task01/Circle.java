package com.yurii.salimov.lesson01.task01;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Circle {

    public static final String NAME = "Circle";

    private final double radius;

    public Circle(final double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return NAME + "{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if ((object == null) || (getClass() != object.getClass())) {
            return false;
        }
        final Circle that = (Circle) object;
        return (this.radius == that.radius);
    }

    @Override
    public int hashCode() {
        int result = 15;
        result = 31 * result + Double.hashCode(this.radius);
        return result;
    }

    public static Circle combine(final Circle first, final Circle second) {
        return new Circle(first.radius + second.radius);
    }
}
