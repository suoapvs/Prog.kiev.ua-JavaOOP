package com.yurii.salimov.lesson02.task05.service;

import com.yurii.salimov.lesson02.task05.figure.Figure;
import com.yurii.salimov.lesson02.task05.figure.circle.Circle;
import com.yurii.salimov.lesson02.task05.figure.circle.CircleBuilder;
import com.yurii.salimov.lesson02.task05.figure.point.Point;
import com.yurii.salimov.lesson02.task05.figure.point.PointBuilder;
import com.yurii.salimov.lesson02.task05.figure.rectangle.Rectangle;
import com.yurii.salimov.lesson02.task05.figure.rectangle.RectangleBuilder;
import com.yurii.salimov.lesson02.task05.figure.triangle.Triangle;
import com.yurii.salimov.lesson02.task05.figure.triangle.TriangleBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The class implements a set of methods
 * for creating a geometric figures.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class FigureGenerator implements Generator {

    /**
     * An instance of Random class to generate
     * a stream of pseudorandom numbers.
     */
    private final static Random RANDOM = new Random();

    /**
     * Maximum coordinate of a geometric figures.
     */
    private final int maxCoordinate;

    /**
     * Default constructor.
     * Initializes a random maximum coordinate
     * of a geometric figures.
     */
    public FigureGenerator() {
        this(Math.abs(RANDOM.nextInt()));
    }

    /**
     * Constructor.
     *
     * @param maxCoordinate the maximum coordinate of a geometric figures.
     * @throws IllegalArgumentException if the incoming maxCoordinate is negative value.
     */
    public FigureGenerator(final int maxCoordinate) throws IllegalArgumentException {
        if (maxCoordinate <= 0) {
            throw new IllegalArgumentException("Max coordinate must be positive value!");
        }
        this.maxCoordinate = maxCoordinate;
    }

    /**
     * Creates and returns a list of a random geometric figures.
     *
     * @param number the figures number.
     * @return the list of a random geometric figures.
     */
    @Override
    public List<Figure> generateFigures(final int number) {
        final List<Figure> figures = new ArrayList<>();
        if (number > 0) {
            for (int i = 0; i < number; i++) {
                figures.add(generateFigure(getNextInt()));
            }
        }
        return figures;
    }

    /**
     * Creates and returns a Circle geometric figure
     * with random fields.
     *
     * @return the Circle geometric figure.
     */
    @Override
    public Circle generateCircle() {
        return new CircleBuilder()
                .addRadius(getNextInt())
                .build();
    }

    /**
     * Creates and returns a Point geometric figure
     * with random fields.
     *
     * @return the Point geometric figure.
     */
    @Override
    public Point generatePoint() {
        return new PointBuilder()
                .addAbscissa(getNextInt())
                .addOrdinate(getNextInt())
                .build();
    }

    /**
     * Creates and returns a Rectangle geometric figure
     * with random fields.
     *
     * @return the Rectangle geometric figure.
     */
    @Override
    public Rectangle generateRectangle() {
        return new RectangleBuilder()
                .addWidth(getNextInt())
                .addHeight(getNextInt())
                .build();
    }

    /**
     * Creates and returns a Triangle geometric figure
     * with random fields.
     *
     * @return the Triangle geometric figure.
     */
    @Override
    public Triangle generateTriangle() {
        final TriangleBuilder builder = new TriangleBuilder();
        Triangle triangle;
        do {
            triangle = builder.addSideA(getNextInt())
                    .addSideB(getNextInt())
                    .addSideC(getNextInt())
                    .build();
        } while (!triangle.isTriangle());
        return triangle;
    }

    /**
     * Creates and returns a geometric figure
     * with random fields by the number:
     * 0 - Circle, 1 - Point, 2 - Rectangle, 3 - Triangle
     *
     * @param number the figure number.
     * @return the geometric figure.
     */
    private Figure generateFigure(final int number) {
        final Figure figure;
        switch (number) {
        case 0:
            figure = generateCircle();
            break;
        case 1:
            figure = generatePoint();
            break;
        case 2:
            figure = generateRectangle();
            break;
        case 3:
            figure = generateTriangle();
            break;
        default:
            figure = generateFigure(number % 4);
        }
        return figure;
    }

    /**
     * Returns a random number in diapason from 1 to maxCoordinate.
     *
     * @return the random integer.
     */
    private int getNextInt() {
        return RANDOM.nextInt(this.maxCoordinate) + 1;
    }
}
