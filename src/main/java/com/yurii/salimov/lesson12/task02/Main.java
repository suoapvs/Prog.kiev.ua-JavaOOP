package com.yurii.salimov.lesson12.task02;

/**
 * 12.2 Написать программу для стресс-тестирования веб-серверов.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        try {
            final Parameters parameters = Parameters.getInstance();
            System.out.println("Stress: START");
            final Stress stress = new Stress(parameters);
            stress.start();
            Thread.sleep(parameters.getTimer());
            System.out.println("Stress: INTERRUPT");
            stress.interrupt();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Stress: EXIT");
    }
}
