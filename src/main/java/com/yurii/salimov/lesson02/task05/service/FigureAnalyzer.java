package com.yurii.salimov.lesson02.task05.service;

import com.yurii.salimov.lesson02.task05.figure.Figure;

import java.util.List;

/**
 * The class implements a set of methods
 * for analyzing an incoming figures.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class FigureAnalyzer implements Analyzer {

    /**
     * Returns a figure with a maximum area.
     *
     * @param figures the figure list to analyze.
     * @return the figure with a maximum area.
     * @throws IllegalArgumentException if the incoming figures is null or empty.
     */
    @Override
    public Figure getWithMaxArea(final List<Figure> figures) throws IllegalArgumentException {
        if (figures == null || figures.isEmpty()) {
            throw new IllegalArgumentException("Incoming figures list is null or empty!");
        }
        Figure result = figures.get(0);
        for (Figure figure : figures) {
            result = getWithMaxArea(result, figure);
        }
        return result;
    }

    /**
     * Returns a figure with a maximum area.
     *
     * @param first  the first figure to analyze.
     * @param second the second figure to analyze.
     * @return the figure with a maximum area.
     */
    @Override
    public Figure getWithMaxArea(final Figure first, final Figure second) {
        return areaAnalyzer(first, second) ? first : second;
    }

    /**
     * Returns a figure with a minimum area.
     *
     * @param figures the figure list to analyze.
     * @return the figure with a minimum area.
     * @throws IllegalArgumentException if the incoming figures is null or empty.
     */
    @Override
    public Figure getWithMinArea(final List<Figure> figures) throws IllegalArgumentException {
        if (figures == null || figures.isEmpty()) {
            throw new IllegalArgumentException("Incoming figures list is null or empty!");
        }
        Figure result = figures.get(0);
        for (Figure figure : figures) {
            result = getWithMinArea(result, figure);
        }
        return result;
    }

    /**
     * Returns a figure with a minimum area.
     *
     * @param first  the first figure to analyze.
     * @param second the second figure to analyze.
     * @return the figure with a minimum area.
     */
    @Override
    public Figure getWithMinArea(final Figure first, final Figure second) {
        return areaAnalyzer(first, second) ? second : first;
    }

    /**
     * Returns a figure with a maximum perimeter.
     *
     * @param figures the figure list to analyze.
     * @return the figure with a maximum perimeter.
     * @throws IllegalArgumentException if the incoming figures is null or empty.
     */
    @Override
    public Figure getWithMaxPerimeter(final List<Figure> figures) throws IllegalArgumentException {
        if (figures == null || figures.isEmpty()) {
            throw new IllegalArgumentException("Incoming figures list is null or empty!");
        }
        Figure result = figures.get(0);
        for (Figure figure : figures) {
            result = getWithMaxPerimeter(result, figure);
        }
        return result;
    }

    /**
     * Returns a figure with a maximum perimeter.
     *
     * @param first  the first figure to analyze.
     * @param second the second figure to analyze.
     * @return the figure with a maximum perimeter.
     */
    @Override
    public Figure getWithMaxPerimeter(final Figure first, final Figure second) {
        return perimeterAnalyzer(first, second) ? first : second;
    }

    /**
     * Returns a figure with a minimum perimeter.
     *
     * @param figures the figure list to analyze.
     * @return the figure with a maximum perimeter.
     * @throws IllegalArgumentException if the incoming figures is null or empty.
     */
    public Figure getWithMinPerimeter(final List<Figure> figures) throws IllegalArgumentException {
        if (figures == null || figures.isEmpty()) {
            throw new IllegalArgumentException("Incoming figures list is null or empty!");
        }
        Figure result = figures.get(0);
        for (Figure figure : figures) {
            result = getWithMinPerimeter(result, figure);
        }
        return result;
    }

    /**
     * Returns a figure with a minimum perimeter.
     *
     * @param first  the first figure to analyze.
     * @param second the second figure to analyze.
     * @return the figure with a minimum perimeter.
     */
    @Override
    public Figure getWithMinPerimeter(final Figure first, final Figure second) {
        return perimeterAnalyzer(first, second) ? second : first;
    }

    /**
     * Analyzes a incoming geometric figures by area.
     *
     * @param more the geometric figure with more area.
     * @param less the geometric figure with less area.
     * @return true if area of a "more" figure is more
     * of area of a "less" figure, false otherwise.
     * @throws IllegalArgumentException if one of the incoming figures is null.
     */
    private static boolean areaAnalyzer(final Figure more, final Figure less)
            throws IllegalArgumentException {
        if (more == null || less == null) {
            throw new IllegalArgumentException("One of the incoming figures is null!");
        }
        return (more.getArea() > less.getArea());
    }

    /**
     * Analyzes a incoming geometric figures by perimeter.
     *
     * @param more the geometric figure with more perimeter.
     * @param less the geometric figure with less perimeter.
     * @return true if perimeter of a "more" figure is more
     * of perimeter of a "less" figure, false otherwise.
     * @throws IllegalArgumentException if one of the incoming figures is null.
     */
    private static boolean perimeterAnalyzer(final Figure more, final Figure less)
            throws IllegalArgumentException {
        if (more == null || less == null) {
            throw new IllegalArgumentException("One of the incoming figures is null!");
        }
        return (more.getPerimeter() > less.getPerimeter());
    }
}
