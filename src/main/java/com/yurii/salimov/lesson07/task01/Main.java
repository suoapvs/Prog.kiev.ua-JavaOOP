package com.yurii.salimov.lesson07.task01;

/**
 * 7.1 Написать класс, который позволит записывать
 * текстовые данные в один файл из разных потоков.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        try {
            final InFile file = new InFile("c:\\file.txt");
            String[] someText = {"1Q ", "2W ", "3E ", "4R ", "5T ", "6Y ", "7U ", "8I ", "9O ", "0P "};
            for (String text : someText) {
                new Thread(new Task(file, text)).start();
            }
            System.out.println("Done!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
