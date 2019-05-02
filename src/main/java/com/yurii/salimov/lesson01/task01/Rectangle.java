package com.yurii.salimov.lesson01.task01;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Rectangle {

    public static final String NAME = "Rectangle";

    private final int width;
    private final int height;

    public Rectangle(final int width, final int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int square() {
        return this.height * this.width;
    }

    @Override
    public String toString() {
        return NAME + "{" +
                "width=" + this.width +
                ", height=" + this.height +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if ((object == null) || (getClass() != object.getClass())) {
            return false;
        }
        final Rectangle that = (Rectangle) object;
        return this.width == that.width &&
                this.height == that.height;
    }

    @Override
    public int hashCode() {
        int result = 11;
        result = 31 * result + this.width;
        result = 31 * result + this.height;
        return result;
    }

    public static Rectangle combine(final Rectangle first, final Rectangle second) {
        return new Rectangle(first.width + second.width, first.height + second.height);
    }
}
