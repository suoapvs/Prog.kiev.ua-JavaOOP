package com.yurii.salimov.lesson04.task02;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Rectangle extends Figure {

    private static final String NAME = "Rectangle";

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
    public String getName() {
        return NAME;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public static Rectangle combine(final Rectangle first, final Rectangle second) {
        final double width = first.getWidth() + second.getWidth();
        final double heigth = first.getHeight() + second.getHeight();
        return new Rectangle(width, heigth);
    }
}
