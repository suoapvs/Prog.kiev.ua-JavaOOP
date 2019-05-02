package com.yurii.salimov.lesson03.task09;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Arithmetic {

    private Arithmetic() {
    }

    public static double sqrt(final double number) throws SqrtException {
        if (number < 0) {
            throw new SqrtException(number + " - negative number.");
        }
        return Math.sqrt(number);
    }

    public static double division(final double first, final double second) throws ZeroException {
        if (second == 0) {
            throw new ZeroException(first + " / " + second + " - division by zero.");
        }
        return (first / second);
    }
}
