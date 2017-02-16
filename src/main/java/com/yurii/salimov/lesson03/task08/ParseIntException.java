package com.yurii.salimov.lesson03.task08;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class ParseIntException extends Exception {

    public ParseIntException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "ParseIntException: " + super.getMessage();
    }
}
