package com.yurii.salimov.lesson03.task05;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Circle implements Figure {

    private final double radius;

    public Circle(final double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + this.radius +
                ", area=" + getArea() +
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
        int result = 14;
        result = 31 * result + Double.hashCode(this.radius);
        return result;
    }
}
