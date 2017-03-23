package com.yurii.salimov.lesson06.task02;

import java.util.Scanner;

/**
 * 6.2 Создать поток, который будет каждые 10 секунд выводить текущее
 * время на экран. Сделать возможность прерывания потока с помощью
 * команды с консоли.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        try (final Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter \"STOP\" to stop.");
            final Time time = new Time();
            time.start();
            while (!time.isInterrupted()) {
                if (scanner.nextLine().equalsIgnoreCase("stop")) {
                    time.interrupt();
                } else {
                    System.out.println("Enter \"STOP\" to stop.");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
