package com.yurii.salimov.lesson09.task01_02_03;

import java.io.File;
import java.util.Scanner;

/**
 * 9.1 Написать класс «человек». Реализовать его методы clone,
 * equals, hashCode, toString.
 *
 * 9.2 Реализовать возможность сериализации для класса «человек».
 *
 * 9.3 Написать программу, которая запросит ввести с консоли
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
        final Serialization serialization = new Serialization();
        final File file = new File("List.txt");
        if (!file.exists() || !file.isFile() || file.length() == 0) {
            int number = 10;
            final MySet<Human> humans = createHumanSet(number) ;
            humans.print();
            serialization.serialize(humans, file);
        } else {
            final MySet humans = (MySet) serialization.deserialize(file);
            humans.print();
        }
    }

    private static MySet<Human> createHumanSet(final int number) {
        final MySet<Human> humanMySet = new MySet<>();
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
