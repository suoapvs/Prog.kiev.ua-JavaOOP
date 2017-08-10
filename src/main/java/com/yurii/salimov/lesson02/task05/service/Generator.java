package com.yurii.salimov.lesson02.task05.service;

import com.yurii.salimov.lesson02.task05.figure.Figure;
import com.yurii.salimov.lesson02.task05.figure.circle.Circle;
import com.yurii.salimov.lesson02.task05.figure.point.Point;
import com.yurii.salimov.lesson02.task05.figure.rectangle.Rectangle;
import com.yurii.salimov.lesson02.task05.figure.triangle.Triangle;

import java.util.List;

/**
 * The interface describes a set of methods
 * for creating a geometric figures.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface Generator {

    /**
     * Creates and returns a list of a geometric figures.
     *
     * @param number the figures number.
     * @return the list of a geometric figures.
     */
    List<Figure> generateFigures(int number);

    /**
     * Creates and returns a Circle geometric figure.
     *
     * @return the Circle geometric figure.
     */
    Circle generateCircle();

    /**
     * Creates and returns a Point geometric figure.
     *
     * @return the Point geometric figure.
     */
    Point generatePoint();

    /**
     * Creates and returns a Rectangle geometric figure.
     *
     * @return the Rectangle geometric figure.
     */
    Rectangle generateRectangle();

    /**
     * Creates and returns a Triangle geometric figure.
     *
     * @return the Triangle geometric figure.
     */
    Triangle generateTriangle();
}
