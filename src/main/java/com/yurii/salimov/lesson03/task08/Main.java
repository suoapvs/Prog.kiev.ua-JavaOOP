package com.yurii.salimov.lesson03.task08;

/**
 * 3.8 Написать аналог Integer.parseInt. Использовать исключения.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        String[] text = {"+25016", "-2470", "-q44e5"};

        try {
            System.out.println("String -> int");
            for (int i = 0; i < text.length; i++) {
                System.out.println("\"" + text[i] + "\" -> " + MyInteger.parseInt(text[i]));
            }
        } catch (ParseIntException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
