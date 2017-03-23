package com.yurii.salimov.lesson04.task02;

/**
 * 4.2 Создать список фигур. Реализовать сортировку списка по возрастанию площади фигуры.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final FigureList list = createFigureList();
        list.sort();
        list.showAllList();
    }

    private static FigureList createFigureList() {
        final FigureList figureList = new FigureList();
        figureList.add(new Rectangle(8, 12));
        figureList.add(new Triangle(5, 8, 5));
        figureList.add(new Circle(10));
        figureList.add(new Rectangle(4, 3));
        figureList.add(new Triangle(10, 16, 10));
        figureList.add(new Circle(12));
        return figureList;
    }
}
