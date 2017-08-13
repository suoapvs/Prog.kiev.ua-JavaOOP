package com.yurii.salimov.lesson10.task01_02;

import java.util.Scanner;

/**
 * 10.1 Написать программу переводчик, которая будет переводить текст,
 * написанный на одном языке, на другой язык согласно заранее
 * составленному словарю.
 *
 * 10.2 * Сделать ф-ю ручного наполнения словаря и возможность его
 * сохранения на диск.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final Translator translator = new Translator();
        translator.addWords();
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text for translation:");
        final String text = scanner.nextLine();
        System.out.println(translator.translate(text));
    }
}
