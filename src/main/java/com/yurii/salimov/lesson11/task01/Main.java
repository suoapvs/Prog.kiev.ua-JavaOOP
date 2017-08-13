package com.yurii.salimov.lesson11.task01;

import java.io.IOException;
import java.net.URL;
import java.util.List;

/**
 * 11.1 Вывести на экран все ссылки, которые содержатся в скачанном HTML документе.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String args[]) throws IOException {
        final URL url = new URL("http://alexcoffee.com.ua");
        final Parser parser = new Parser(url);
        final String page = parser.getHtml();
        System.out.println(page);
        System.out.println();

        final List<URL> listURL = parser.getUrls();
        listURL.forEach(System.out::println);
    }
}
