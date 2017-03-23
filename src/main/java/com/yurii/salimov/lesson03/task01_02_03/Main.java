package com.yurii.salimov.lesson03.task01_02_03;

/**
 * 3.1 Написать своего наследника Developer. Добавить его в существующий проект.
 *
 * 3.2 Создать список разработчиков и заполнить его случайным образом.
 * Вывести на экран только Senior developer-ов с зарплатой больше 1500 у.е.
 *
 * 3.3 Написать код, который разделит список объектов Developer на 3 отдельных списка для
 * Juniors, Seniors и Team Leads. Вывести списки на экран.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final DeveloperList developerList = createList();
        developerList.showAllList();
        developerList.showList("Senior developer", 1500);
        developerList.showList("Junior developer", 0);
    }

    private static DeveloperList createList() {
        final double basicSalary = 500;
        final DeveloperList developerList = new DeveloperList();
        developerList.add(new SeniorDeveloper("Otto", basicSalary, 15));
        developerList.add(new JuniorDeveloper("Marti", basicSalary, 3));
        developerList.add(new JuniorDeveloper("Dima", basicSalary, 1));
        developerList.add(new JuniorDeveloper("Artur", basicSalary, 4));
        developerList.add(new JuniorDeveloper("Alex", basicSalary, 0));
        developerList.add(new JuniorDeveloper("Vova", basicSalary, 8));
        developerList.add(new JuniorDeveloper("Jack", basicSalary, 0));
        developerList.add(new JuniorDeveloper("Mike", basicSalary, 4));
        developerList.add(new SeniorDeveloper("Robby", basicSalary, 1));
        developerList.add(new SeniorDeveloper("Mark", basicSalary, 6));
        developerList.add(new SeniorDeveloper("Tomas", basicSalary, 23));
        developerList.add(new SeniorDeveloper("Hanry", basicSalary, 7));
        developerList.add(new SeniorDeveloper("Leva", basicSalary, 5));
        return developerList;
    }
}
