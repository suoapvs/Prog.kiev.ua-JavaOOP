package com.yurii.salimov.lesson02.task05.service;

import com.yurii.salimov.lesson02.task05.figure.Drawable;
import com.yurii.salimov.lesson02.task05.figure.Figure;

import java.util.List;

/**
 * The class implements a set of methods
 * for analyzing a geometric figures.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class FigurePrinter implements Printer {

    /**
     * Analyzer instance for analyzing a geometric figures.
     */
    private final Analyzer analyzer;

    /**
     * Constructor.
     *
     * @param analyzer the Analyzer instance for analyzing a geometric figures.
     * @throws IllegalArgumentException if the incoming analyzer is null.
     */
    public FigurePrinter(final Analyzer analyzer) throws IllegalArgumentException {
        if (analyzer == null) {
            throw new IllegalArgumentException("Incoming Analyzer is null!");
        }
        this.analyzer = analyzer;
    }

    /**
     * Prints a incoming geometric figures in the console.
     *
     * @param figures the figure list to print.
     * @throws IllegalArgumentException if the incoming figures is null or empty.
     */
    @Override
    public void printlnAll(final List<? extends Figure> figures) throws IllegalArgumentException {
        if (figures == null || figures.isEmpty()) {
            throw new IllegalArgumentException("Incoming figures list is null or empty!");
        }
        System.out.println("\nAll Figures:");
        figures.forEach(this::println);
    }

    /**
     * Prints a incoming geometric figure in the console.
     *
     * @param figure the figure to print.
     * @throws IllegalArgumentException if the incoming figure is null.
     */
    @Override
    public void println(final Figure figure) throws IllegalArgumentException {
        if (figure == null) {
            throw new IllegalArgumentException("Incoming figure is null!");
        }
        System.out.println(figure);
    }

    /**
     * Prints a geometric figures with a maximum area.
     *
     * @param figures the figure list to analyze.
     * @throws IllegalArgumentException if the incoming figures is null or empty.
     */
    @Override
    public void printlnWithMaxArea(final List<? extends Figure> figures) throws IllegalArgumentException {
        if (figures == null || figures.isEmpty()) {
            throw new IllegalArgumentException("Incoming figures list is null or empty!");
        }
        System.out.println("\nFigure with max area:");
        System.out.println(this.analyzer.getWithMaxArea(figures));
    }

    /**
     * Prints a geometric figures with a minimum area.
     *
     * @param figures the figure list to analyze.
     * @throws IllegalArgumentException if the incoming figures is null or empty.
     */
    @Override
    public void printlnWithMinArea(final List<? extends Figure> figures) throws IllegalArgumentException {
        if (figures == null || figures.isEmpty()) {
            throw new IllegalArgumentException("Incoming figures list is null or empty!");
        }
        System.out.println("\nFigure with min area:");
        System.out.println(this.analyzer.getWithMinArea(figures));
    }

    /**
     * Prints a geometric figures with a maximum perimeter.
     *
     * @param figures the figure list to analyze.
     * @throws IllegalArgumentException if the incoming figures is null or empty.
     */
    @Override
    public void printlnWithMaxPerimeter(final List<? extends Figure> figures) throws IllegalArgumentException {
        if (figures == null || figures.isEmpty()) {
            throw new IllegalArgumentException("Incoming figures list is null or empty!");
        }
        System.out.println("\nFigure with max perimeter:");
        System.out.println(this.analyzer.getWithMaxPerimeter(figures));
    }

    /**
     * Prints a geometric figures with a minimum perimeter.
     *
     * @param figures the figure list to analyze.
     * @throws IllegalArgumentException if the incoming figures is null or empty.
     */
    @Override
    public void printlnWithMinPerimeter(final List<? extends Figure> figures) throws IllegalArgumentException {
        if (figures == null || figures.isEmpty()) {
            throw new IllegalArgumentException("Incoming figures list is null or empty!");
        }
        System.out.println("\nFigure with min perimeter:");
        System.out.println(this.analyzer.getWithMinPerimeter(figures));
    }

    /**
     * Draws a incoming geometric figures in the console.
     *
     * @param figures a figure list to draw.
     * @throws IllegalArgumentException if the incoming figures is null or empty.
     */
    @Override
    public void drawAll(final List<Drawable> figures) throws IllegalArgumentException {
        if (figures == null || figures.isEmpty()) {
            throw new IllegalArgumentException("Incoming figures list is null or empty!");
        }
        System.out.println("\nAll Figures:");
        figures.forEach(this::draw);
    }

    /**
     * Draws a incoming geometric figure in the console.
     *
     * @param figure the figure to draw.
     * @throws IllegalArgumentException if the incoming figure is null.
     */
    @Override
    public void draw(final Drawable figure) throws IllegalArgumentException {
        if (figure == null) {
            throw new IllegalArgumentException("Incoming figure is null!");
        }
        figure.draw();
    }

    /**
     * Prints and draws a incoming geometric figures in the console.
     *
     * @param figures the figure list to print and draw.
     * @throws IllegalArgumentException if the incoming figures is null or empty.
     */
    @Override
    public void printAndDrawAll(final List<? extends Figure> figures) throws IllegalArgumentException {
        if (figures == null || figures.isEmpty()) {
            throw new IllegalArgumentException("Incoming figures list is null or empty!");
        }
        System.out.println("\nAll Figures:");
        figures.forEach(this::printAndDraw);
    }

    /**
     * Prints and draws a incoming geometric figure in the console.
     *
     * @param figure the figure to print and draw.
     * @throws IllegalArgumentException if the incoming figure is null.
     */
    @Override
    public void printAndDraw(final Figure figure) throws IllegalArgumentException {
        if (figure == null) {
            throw new IllegalArgumentException("Incoming figure is null!");
        }
        println(figure);
        draw(figure);
        System.out.println();
    }
}
