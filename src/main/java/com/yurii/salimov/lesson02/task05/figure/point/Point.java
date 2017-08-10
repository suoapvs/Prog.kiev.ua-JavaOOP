package com.yurii.salimov.lesson02.task05.figure.point;

import com.yurii.salimov.lesson02.task05.figure.Figure;

/**
 * The interface describes a set of methods
 * for working with a Point geometric figures.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface Point extends Figure {

    /**
     * Returns a abscissa coordinate of the point.
     *
     * @return The point abscissa.
     */
    double getAbscissa();

    /**
     * Returns a ordinate coordinate of the point.
     *
     * @return The point ordinate.
     */
    double getOrdinate();

    /**
     * Returns a builder for creating a new point.
     *
     * @return the point builder (newer null).
     */
    static PointBuilder getBuilder() {
        return new PointBuilder();
    }
}
