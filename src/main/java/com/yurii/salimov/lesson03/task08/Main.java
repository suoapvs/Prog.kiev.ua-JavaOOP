package com.yurii.salimov.lesson03.task08;

/**
 * 3.8 Написать аналог Integer.parseInt. Использовать исключения.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final String[] numbers = {"1234", "+25016", "-2470", "-q44e5"};
        try {
            System.out.println("String -> int:");
            for (String num : numbers) {
                System.out.println("\"" + num + "\" -> " + MyInteger.parseInt(num) + ";");
            }
        } catch (ParseIntException ex) {
            ex.printStackTrace();
        }
    }
}
