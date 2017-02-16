package com.yurii.salimov.lesson03.task09;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Arithmetic {

    public static double sqrt(double number) throws SqrtException {
        if (number < 0) {
            throw new SqrtException(number + " - negative number.");
        }
        return Math.sqrt(number);
    }

    public static double division(double num1, double num2) throws ZeroException {
        if (num2 == 0) {
            throw new ZeroException(num1 + " / " + num2 + " - division by zero.");
        }
        return num1 / num2;
    }
}
