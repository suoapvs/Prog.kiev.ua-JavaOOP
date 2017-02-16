package com.yurii.salimov.lesson09.task01_02_03;

import java.io.File;
import java.util.Scanner;

/**
 * 1. Написать класс «человек». Реализовать его методы clone,
 * equals, hashCode, toString.
 *
 * 2. Реализовать возможность сериализации для класса «человек».
 *
 * 3. Написать программу, которая запросит ввести с консоли
 * информацию о 10 людях, запишет ее на диск, а при следующем
 * старте прочитает записи и выведет сохраненные данные на
 * экран. Одинаковые записи должны игнорироваться (Set +
 * equals*).
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final File file = new File("List.txt");
        if (!file.exists() || !file.isFile() || file.length() == 0) {
            int number = 10;
            final MySet<Human> humanList = createHumanSet(number) ;
            humanList.print();
            Serialization.serialize(humanList, file);
        } else {
            ((MySet) Serialization.deserialize(file)).print();
        }
    }

    private static MySet<Human> createHumanSet(int number) {
        MySet<Human> humanMySet = new MySet<>();
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data about " + number + " persons:");
        for (int i = 0; i < number; i++) {
            Human human = new Human();
            System.out.print((i + 1) + ") Name - ");
            human.setName(scanner.nextLine());
            System.out.print("  Surname - ");
            human.setSurname(scanner.nextLine());
            System.out.print("  Birth (dd.MM.yyyy) - ");
            human.setBirth(scanner.nextLine());
            System.out.print("  Sex - ");
            human.setSex(scanner.nextLine());
            if (!humanMySet.add(human)) {
                System.out.println("Information about this person has already been added.\nEnter again:");
                i--;
            }
        }
        return humanMySet;
    }
}
