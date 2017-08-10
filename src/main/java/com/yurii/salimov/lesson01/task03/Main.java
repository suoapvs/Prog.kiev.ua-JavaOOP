
package com.yurii.salimov.lesson01.task03;

/**
 * 1.3 Написать класс «автомобиль», который должен
 * уметь заводится, глушить мотор, ехать и держать
 * необходимую скорость.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final Car car = new Car("Lada 2101");
        System.out.println("Model: " + car.getModel());
        car.start();
        car.speed(250, 40);
        car.speed(0, 35);
        car.stop();
    }
}
