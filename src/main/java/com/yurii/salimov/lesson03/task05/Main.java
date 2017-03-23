package com.yurii.salimov.lesson03.task05;

/*
 * 3.5 Построить иерархию классов «Фигуры» с учетом знаний о полиморфизме.
 * У каждого класса фигуры должен быть метод подсчета площади.
 * Создать список фигур. Вывести площади всех фигур на экран.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final FigureList figureList = createFigureList();
        figureList.showAllList();
    }

    private static FigureList createFigureList() {
        final FigureList figureList = new FigureList();
        figureList.add(new Rectangle(8, 12));
        figureList.add(new Triangle(5, 8, 5));
        figureList.add(new Circle(10));
        return figureList;
    }
}
