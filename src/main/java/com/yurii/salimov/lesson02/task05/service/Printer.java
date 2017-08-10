package com.yurii.salimov.lesson02.task05.service;

import com.yurii.salimov.lesson02.task05.figure.Drawable;
import com.yurii.salimov.lesson02.task05.figure.Figure;

import java.util.List;

/**
 * The interface describes a set of methods
 * for printing a geometric figures in the console.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface Printer {

    /**
     * Prints the incoming geometric figures in the console.
     *
     * @param figures the figure list to print.
     */
    void printlnAll(List<Figure> figures);

    /**
     * Prints the incoming geometric figure in the console.
     *
     * @param figure the figure to print.
     */
    void println(Figure figure);

    /**
     * Prints the incoming geometric figures with a maximum area.
     *
     * @param figures the figure list to analyze.
     */
    void printlnWithMaxArea(List<Figure> figures);

    /**
     * Prints the incoming geometric figures with a minimum area.
     *
     * @param figures the figure list to analyze.
     */
    void printlnWithMinArea(List<Figure> figures);

    /**
     * Prints a geometric figures with a maximum perimeter.
     *
     * @param figures the figure list to analyze.
     */
    void printlnWithMaxPerimeter(List<Figure> figures);

    /**
     * Prints the incoming geometric figures with a minimum perimeter.
     *
     * @param figures the figure list to analyze.
     */
    void printlnWithMinPerimeter(List<Figure> figures);

    /**
     * Draws the incoming incoming geometric figures in the console.
     *
     * @param figures the figure list to draw.
     */
    void drawAll(List<Drawable> figures);

    /**
     * Draws the incoming geometric figure in the console.
     *
     * @param figure the figure to draw.
     */
    void draw(Drawable figure);

    /**
     * Prints and draws the incoming geometric figures in the console.
     *
     * @param figures the figure list to print and draw.
     */
    void printAndDrawAll(List<Figure> figures);

    /**
     * Prints and draws the incoming geometric figure in the console.
     *
     * @param figure the figure to print and draw.
     */
    void printAndDraw(Figure figure);
}
