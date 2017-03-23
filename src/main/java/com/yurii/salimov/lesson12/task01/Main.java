package com.yurii.salimov.lesson12.task01;

/**
 * 12.1 В файле хранится список веб-серверов. Надо
 * проверить какие из серверов доступны в данный
 * момент и создать отчет в формате сервер=статус.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        try {
            Server server = new Server("c:/server.txt", "c:/report.txt");
            server.getStatusConnectionReport();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
