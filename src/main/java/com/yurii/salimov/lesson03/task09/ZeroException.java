package com.yurii.salimov.lesson03.task09;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class ZeroException extends Exception {

    public ZeroException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "ZeroException: " + super.getMessage();
    }
}
