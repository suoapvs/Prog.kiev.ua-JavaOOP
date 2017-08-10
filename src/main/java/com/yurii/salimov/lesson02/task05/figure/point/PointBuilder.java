package com.yurii.salimov.lesson02.task05.figure.point;

import com.yurii.salimov.lesson02.task05.figure.Builder;

/**
 * The class implements a set of methods
 * for building an objects of the {@link Point} class.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @see Point
 */
public final class PointBuilder implements Builder<Point> {

    /**
     * The abscissa coordinate.
     */
    private double abscissa;

    /**
     * The ordinate coordinate.
     */
    private double ordinate;

    /**
     * Builds and returns a new point.
     *
     * @return The new point.
     * @see Point
     */
    @Override
    public Point build() {
        return new PointFigure(this.abscissa, this.ordinate);
    }

    /**
     * Adds a new abscissa to a new point.
     *
     * @param abscissa the new abscissa to a new point.
     * @return the point builder.
     */
    public PointBuilder addAbscissa(final double abscissa) {
        this.abscissa = abscissa;
        return this;
    }

    /**
     * Adds a new ordinate to a new point.
     *
     * @param ordinate the new ordinate to a new point.
     * @return the point builder.
     */
    public PointBuilder addOrdinate(final double ordinate) {
        this.ordinate = ordinate;
        return this;
    }
}
