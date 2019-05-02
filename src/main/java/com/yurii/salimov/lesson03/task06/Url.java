package com.yurii.salimov.lesson03.task06;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Url {

    private final String url;

    public Url(final String url) {
        this.url = url;
    }

    public void parse() throws IllegalArgumentException {
        final String[] parameters = this.url.split("&");
        for (String parameter : parameters) {
            final String[] pair = parameter.split("=");
            if (pair.length != 2) {
                throw new IllegalArgumentException("Incorrect URL: " + this.url);
            }
            System.out.print(pair[0] + " = " + pair[1] + "; ");
        }
        System.out.println();
    }
}
