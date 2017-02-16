package com.yurii.salimov.lesson12.task04.server;

/**
 * Чат-сервер.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) throws Exception {
        new Server(5000).start();
    }
}
