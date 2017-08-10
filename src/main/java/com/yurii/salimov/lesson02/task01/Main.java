
package com.yurii.salimov.lesson02.task01;

/**
 * 2.1 Проект "Cars": добавить свойство «объем двигателя» в класс Engine.
 * Написать код для вывода потраченного топлива на экран.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final int[] speeds = new int[]{20, 60, 100};
        final Car bmw = new Car("BMW");
        final Car ferrari = new Car("Ferrari", 20000, 5.0);
        move(bmw, speeds, 1);
        move(ferrari, speeds, 1);
        System.out.println(bmw);
        System.out.println(ferrari);
    }

    private static void move(final Car car, final int[] speeds, final int hours) {
        car.turnOn();
        for (int speed : speeds) {
            car.start(speed, hours);
        }
        car.turnOff();
    }
}
