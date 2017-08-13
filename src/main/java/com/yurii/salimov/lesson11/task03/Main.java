package com.yurii.salimov.lesson11.task03;

/**
 * 11.3 Написать сервер, который будет отправлять пользователю
 * информацию о системе и номер запроса.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) throws Exception {
        final int serverPort = 80;
        final Server server = new Server(serverPort);
        server.start();
    }
}
