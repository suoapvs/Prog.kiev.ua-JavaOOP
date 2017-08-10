package com.yurii.salimov.lesson02.task05.figure.rectangle;

import com.yurii.salimov.lesson02.task05.figure.Builder;

/**
 * The class implements a set of methods
 * for building an objects of the {@link Rectangle} class.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @see Rectangle
 */
public final class RectangleBuilder implements Builder<Rectangle> {

    /**
     * The rectangle width.
     */
    private double width;

    /**
     * The rectangle height.
     */
    private double height;

    /**
     * Builds and returns a new rectangle.
     *
     * @return The new rectangle.
     * @see Rectangle
     */
    @Override
    public Rectangle build() {
        final double width = getWidth();
        final double height = getHeight();
        return new RectangleFigure(width, height);
    }

    /**
     * Adds a new width to a new rectangle.
     *
     * @param width the new width to a new rectangle.
     * @return the rectangle builder.
     */
    public RectangleBuilder addWidth(final double width) {
        this.width = width;
        return this;
    }

    /**
     * Adds a new height to a new rectangle.
     *
     * @param height the new height to a new rectangle.
     * @return the rectangle builder.
     */
    public RectangleBuilder addHeight(final double height) {
        this.height = height;
        return this;
    }

    /**
     * Returns a width of a new rectangle.
     * Returns 0 if the width is negative.
     *
     * @return The width (newer negative).
     */
    private double getWidth() {
        return (this.width > 0) ? this.width : 0;
    }

    /**
     * Returns a height of a new rectangle.
     * Returns 0 if the height is negative.
     *
     * @return The height (newer negative).
     */
    private double getHeight() {
        return (this.height > 0) ? this.height : 0;
    }
}
