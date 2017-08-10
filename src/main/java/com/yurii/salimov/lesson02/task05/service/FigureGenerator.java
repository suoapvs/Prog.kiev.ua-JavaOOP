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
            Figure figure;
            int figureNumber;
            for (int i = 0; i < number; i++) {
                figureNumber = getNextInt();
                figure = generateFigure(figureNumber);
                figures.add(figure);
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
        final CircleBuilder builder = new CircleBuilder();
        final int radius = getNextInt();
        builder.addRadius(radius);
        return builder.build();
    }

    /**
     * Creates and returns a Point geometric figure
     * with random fields.
     *
     * @return the Point geometric figure.
     */
    @Override
    public Point generatePoint() {
        final PointBuilder builder = new PointBuilder();
        final int abscissa = getNextInt();
        final int ordinate = getNextInt();
        builder.addAbscissa(abscissa).addOrdinate(ordinate);
        return builder.build();
    }

    /**
     * Creates and returns a Rectangle geometric figure
     * with random fields.
     *
     * @return the Rectangle geometric figure.
     */
    @Override
    public Rectangle generateRectangle() {
        final RectangleBuilder builder = new RectangleBuilder();
        final int width = getNextInt();
        final int height = getNextInt();
        builder.addWidth(width).addHeight(height);
        return builder.build();
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
        int sideA;
        int sideB;
        int sideC;
        do {
            sideA = getNextInt();
            sideB = getNextInt();
            sideC = getNextInt();
            builder.addSideA(sideA).addSideB(sideB).addSideC(sideC);
            triangle = builder.build();
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
