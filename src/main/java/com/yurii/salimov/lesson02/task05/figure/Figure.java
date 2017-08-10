package com.yurii.salimov.lesson02.task05.figure;

/**
 * The interface describes a set of methods
 * for working with a geometric figures.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface Figure extends Drawable {

    /**
     * Calculates and returns the figure area.
     *
     * @return the figure area.
     */
    double getArea();

    /**
     * Calculates and returns the figure perimeter.
     *
     * @return the figure perimeter.
     */
    double getPerimeter();

    /**
     * Returns the figure name.
     *
     * @return the figure name
     */
    String getName();
}
