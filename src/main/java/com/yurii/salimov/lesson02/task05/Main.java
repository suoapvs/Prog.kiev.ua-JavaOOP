package com.yurii.salimov.lesson02.task05;

import com.yurii.salimov.lesson02.task05.figure.Figure;
import com.yurii.salimov.lesson02.task05.service.*;

import java.util.List;

/**
 * 2.5 Написать иерархию классов «Фигуры». Фигура -> Треугольник -> Прямоугольник -> Круг.
 * Реализовать ф-ю подсчета площади для каждого типа фигуры.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    /**
     * The figures number.
     */
    private final static int FIGURES_NUMBER = 10;

    /**
     * The maximum coordinate of a geometric figures.
     */
    private final static int MAX_COORDINATE = 25;

    public static void main(String[] args) {
        final Generator generator = getGenerator();
        final List<Figure> figures = generator.generateFigures(FIGURES_NUMBER);

        final Printer printer = getPrinter();
        printer.printlnAll(figures);
        printer.printlnWithMaxArea(figures);
        printer.printlnWithMinArea(figures);
        printer.printlnWithMaxPerimeter(figures);
        printer.printlnWithMinPerimeter(figures);
        printer.printAndDrawAll(figures);
    }

    /**
     * Creates and returns a new Generator instance
     * for creating a geometric figures.
     *
     * @return the new Generator.
     */
    private static Generator getGenerator() {
        return new FigureGenerator(MAX_COORDINATE);
    }

    /**
     * Creates and returns a new Printer instance
     * for printing a geometric figures in the console.
     *
     * @return the new Printer.
     */
    private static Printer getPrinter() {
        final Analyzer analyzer = getAnalyzer();
        return new FigurePrinter(analyzer);
    }

    /**
     * Creates and returns a new Printer instance
     * for analyzing an incoming figures.
     *
     * @return the new Analyzer.
     */
    private static Analyzer getAnalyzer() {
        return new FigureAnalyzer();
    }
}
