package com.yurii.salimov.lesson02.task05.service;

import com.yurii.salimov.lesson02.task05.figure.Figure;

import java.util.List;

/**
 * The interface describes a set of methods
 * for analyzing a geometric figures.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface Analyzer {

    /**
     * Returns a figure with a maximum area.
     *
     * @param figures the figure list to analyze.
     * @return the figure with a maximum area.
     */
    Figure getWithMaxArea(List<Figure> figures);

    /**
     * Returns a figure with a maximum area.
     *
     * @param first the first figure to analyze.
     * @param second the second figure to analyze.
     * @return the figure with a maximum area.
     */
    Figure getWithMaxArea(Figure first, Figure second);

    /**
     * Returns a figure with a minimum area.
     *
     * @param figures the figure list to analyze.
     * @return the figure with a minimum area.
     */
    Figure getWithMinArea(List<Figure> figures);

    /**
     * Returns a figure with a minimum area.
     *
     * @param first the first figure to analyze.
     * @param second the second figure to analyze.
     * @return the figure with a minimum area.
     */
    Figure getWithMinArea(Figure first, Figure second);

    /**
     * Returns a figure with a maximum perimeter.
     *
     * @param figures the figure list to analyze.
     * @return the figure with a maximum perimeter.
     */
    Figure getWithMaxPerimeter(List<Figure> figures);

    /**
     * Returns a figure with a maximum perimeter.
     *
     * @param first the first figure to analyze.
     * @param second the second figure to analyze.
     * @return the figure with a maximum perimeter.
     */
    Figure getWithMaxPerimeter(Figure first, Figure second);

    /**
     * Returns a figure with a minimum perimeter.
     *
     * @param figures the figure list to analyze.
     * @return the figure with a maximum perimeter.
     */
    Figure getWithMinPerimeter(List<Figure> figures);

    /**
     * Returns a figure with a minimum perimeter.
     *
     * @param first the first figure to analyze.
     * @param second the second figure to analyze.
     * @return the figure with a minimum perimeter.
     */
    Figure getWithMinPerimeter(Figure first, Figure second);
}
