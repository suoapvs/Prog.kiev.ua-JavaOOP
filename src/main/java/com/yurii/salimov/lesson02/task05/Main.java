package com.yurii.salimov.lesson02.task05;

/**
 * 2.5 Написать иерархию классов «Фигуры». Фигура -> Треугольник -> Прямоугольник -> Круг.
 * Реализовать ф-ю подсчета площади для каждого типа фигуры.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final Figure[] figures = createFigures();
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }

    private static Figure[] createFigures() {
        return new Figure[]{new Rectangle(8, 12), new Triangle(5, 8, 5), new Circle(10)};
    }
}
