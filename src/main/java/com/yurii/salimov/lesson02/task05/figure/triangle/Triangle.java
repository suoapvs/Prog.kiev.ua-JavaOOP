package com.yurii.salimov.lesson02.task05.figure.triangle;

import com.yurii.salimov.lesson02.task05.figure.Figure;
import com.yurii.salimov.lesson02.task05.figure.point.Point;

/**
 * The interface describes a set of methods
 * for working with a Triangle geometric figures.
 * <pre>
 *                    a
 *    A |←---------------------------→|  B
 *    -- * * * * * * * * * * * * * * * *
 *    ↑  * alpha * * * * * * beta* *    \
 *    |  * * * * * * * * * * * *     ↗
 *    |  * * * * * * * * * *      /
 *  b |  * * * * * * * *      /
 *    |  * gamma* * *     /
 *    |  * * *  *     /    c
 *    ↓  * *     /
 *    -- *\   ↙
 *      C  \
 * </pre>
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface Triangle extends Figure {

    /**
     * Returns a side A of the triangle.
     * This is the side between the points B and C.
     *
     * @return the side A of the triangle.
     */
    double getSideA();

    /**
     * Returns a side B of the triangle.
     * This is the side between the points A and C.
     *
     * @return the side B of the triangle.
     */
    double getSideB();

    /**
     * Returns a side C of the triangle.
     * This is the side between the points A and B.
     *
     * @return the side C of the triangle.
     */
    double getSideC();

    /**
     * Calculates and returns a triangle angle Alpha.
     * This is the angle between the sides B and C.
     *
     * @return the triangle angle Alpha.
     */
    double getAngleAlpha();

    /**
     * Calculates and returns a triangle angle Beta.
     * This is the angle between the sides A and C.
     *
     * @return the triangle angle Beta.
     */
    double getAngleBeta();

    /**
     * Calculates and returns a triangle angle Gamma.
     * This is the angle between the sides A and B.
     *
     * @return the triangle angle Gamma.
     */
    double getAngleGamma();

    /**
     * Calculates and returns a point A of a triangle.
     * This is the point of intersection of sides B and C.
     *
     * @return the point A of the triangle.
     */
    Point getPointA();

    /**
     * Calculates and returns a point B of a triangle.
     * This is the point of intersection of sides A and C.
     *
     * @return the point B of the triangle.
     */
    Point getPointB();

    /**
     * Calculates and returns a point C of a triangle.
     * This is the point of intersection of sides A and B.
     *
     * @return the point C of the triangle.
     */
    Point getPointC();

    /**
     * Checks whether this geometric figure is a triangle.
     *
     * @return true if this geometric figure is a triangle,
     * false otherwise.
     */
    boolean isTriangle();

    /**
     * Returns a builder for creating a new triangle.
     *
     * @return the triangle builder (newer null).
     */
    static TriangleBuilder getBuilder() {
        return new TriangleBuilder();
    }
}
