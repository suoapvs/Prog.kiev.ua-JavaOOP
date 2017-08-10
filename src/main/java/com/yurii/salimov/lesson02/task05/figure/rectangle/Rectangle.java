package com.yurii.salimov.lesson02.task05.figure.rectangle;

import com.yurii.salimov.lesson02.task05.figure.Figure;
import com.yurii.salimov.lesson02.task05.figure.point.Point;

/**
 * The interface describes a set of methods
 * for working with a Rectangle geometric figures.
 * <pre>
 *               w i d t h
 *       A |←----------------→| B
 *      -- * * * * * * * * * * *
 *   h  ↑  * * * * * * * * * * *
 *   e  |  * * * * * * * * * * *
 *   i  |  * * * * * * * * * * *
 *   g  |  * * * * * * * * * * *
 *   h  |  * * * * * * * * * * *
 *   t  ↓  * * * * * * * * * * *
 *      -- * * * * * * * * * * *
 *       C                       D
 * </pre>
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface Rectangle extends Figure {

    /**
     * Returns a width of the rectangle.
     *
     * @return The rectangle width.
     */
    double getWidth();

    /**
     * Returns a height of the rectangle.
     *
     * @return The rectangle height.
     */
    double getHeight();

    /**
     * Calculates and returns a point A of the rectangle.
     *
     * @return the point A of the rectangle.
     */

    /**
     * Calculates and returns a point A of the rectangle.
     *
     * @return The point A of the rectangle.
     */
    Point getPointA();

    /**
     * Calculates and returns a point B of the rectangle.
     *
     * @return The point B of the rectangle.
     */
    Point getPointB();

    /**
     * Calculates and returns a point C of the rectangle.
     *
     * @return The point C of the rectangle.
     */
    Point getPointC();

    /**
     * Calculates and returns a point D of the rectangle.
     *
     * @return The point D of the rectangle.
     */
    Point getPointD();

    /**
     * Returns a builder for creating a new rectangle.
     *
     * @return the rectangle builder (newer null).
     */
    static RectangleBuilder getBuilder() {
        return new RectangleBuilder();
    }
}
