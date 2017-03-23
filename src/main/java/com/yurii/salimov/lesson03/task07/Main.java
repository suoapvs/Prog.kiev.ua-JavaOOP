package com.yurii.salimov.lesson03.task07;

/**
 * 3.7 Найти в стандартной библиотеке 5 классов, методы которых
 * кидают исключения и написать пример кода для их обработки
 * (пример: Integer.parseInt).
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(5 / 0); // ArithmeticException
            int[] mas = new int[-5]; // NegativeArraySizeException
            System.out.println(((String) null).charAt(4)); // NullPointerException
            System.out.println(Integer.parseInt("12de2")); // NumberFormatException
            System.out.println(("12de2").charAt(88)); // IndexOutOfBoundsException
        } catch (ArithmeticException ex) { // Арифметична помилка (типу ділення на нуль)
            System.out.println("ArithmeticException: " + ex.getMessage());
        } catch (NegativeArraySizeException ex) { // Створення масиву з від’ємним розміром
            System.out.println("NegativeArraySizeException: Array size can't be negative.");
        } catch (NullPointerException ex) { // Неприпустиме використання нульового посилання
            System.out.println("NullPointerException: " + ex.getMessage());
        } catch (NumberFormatException ex) { // Неприпустиме перетворення рядка в числовий формат
            System.out.println("NumberFormatException: " + ex.getMessage());
        } catch (IndexOutOfBoundsException ex) { // Індекс масиву за межами припустимої границі
            System.out.println("IndexOutOfBoundsException: " + ex.getMessage());
        }
    }
}
