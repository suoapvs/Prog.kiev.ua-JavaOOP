package com.yurii.salimov.lesson03.task09;

/**
 * 3.9 Придумать свое исключение и написать соответствующий класс и использующий его код.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        try {
            double[] numbers = {Math.PI, -Math.E};
            for (double number : numbers) {
                System.out.println("Sqrt(" + number + ") = " + Arithmetic.sqrt(number));
            }
        } catch (SqrtException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                System.out.println(Arithmetic.division(10, 0));
            } catch (ZeroException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
