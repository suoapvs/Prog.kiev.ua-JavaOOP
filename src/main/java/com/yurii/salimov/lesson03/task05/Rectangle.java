package com.yurii.salimov.lesson03.task05;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Rectangle implements Figure {

    private final double width;
    private final double height;

    public Rectangle(final double width, final double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + this.width +
                ", height=" + this.height +
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
        final Rectangle that = (Rectangle) object;
        return (this.width == that.width) &&
                (this.height == that.height);
    }

    @Override
    public int hashCode() {
        int result = 12;
        result = 31 * result + Double.hashCode(this.width);
        result = 31 * result + Double.hashCode(this.height);
        return result;
    }
}
