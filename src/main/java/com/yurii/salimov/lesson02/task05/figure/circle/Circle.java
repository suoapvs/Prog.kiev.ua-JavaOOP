package com.yurii.salimov.lesson02.task05.figure.circle;

import com.yurii.salimov.lesson02.task05.figure.Figure;
import com.yurii.salimov.lesson02.task05.figure.point.Point;

/**
 * The interface describes a set of methods
 * for working with a Circle geometric figures.
 * <pre>
 *           *
 *     * * d ↑ * * *
 *   * * * i | * * * *
 *   * * * a | radius *
 * * * * * m *←------→ *
 *   * * * e | ↖ * * *
 *   * * * t | * \ * *
 *     * * r ↓ * * \
 *           *      centre
 * </pre>
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface Circle extends Figure {

    /**
     * Returns a radius of the circle.
     *
     * @return The circle radius.
     */
    double getRadius();

    /**
     * Returns a diameter of the circle.
     *
     * @return The circle diameter.
     */
    double getDiameter();

    /**
     * Returns a centre point of the circle.
     *
     * @return The circle centre point.
     */
    Point getCentre();

    /**
     * Returns a builder for creating a new circle.
     *
     * @return the circle builder (newer null).
     */
    static CircleBuilder getBuilder() {
        return new CircleBuilder();
    }
}
