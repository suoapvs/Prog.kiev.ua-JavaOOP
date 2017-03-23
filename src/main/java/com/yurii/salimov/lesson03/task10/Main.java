package com.yurii.salimov.lesson03.task10;

/**
 * 3.10. Модифицировать проект «Список студентов» так, чтобы:
 * 1) список вводился с клавиатуры;
 * 2) была возможность удалять студента по номеру;
 * 3) при введении неправильных данных (пустое имя, неправильная дата)
 * программа кидала исключение и обрабатывала его с выводом соотв. сообщений на экран.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final int number = 3; // Количество студентов
        System.out.println("Enter data about " + number + " students:");
        for (int i = 0; i < number; i++) {
            System.out.println((i + 1) + ")");
            Student.add();
        }
        Student.showList();

        Student.delete();
        Student.showList();
    }
}
