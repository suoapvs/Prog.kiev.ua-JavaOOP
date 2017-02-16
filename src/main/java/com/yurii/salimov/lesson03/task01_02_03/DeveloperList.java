package com.yurii.salimov.lesson03.task01_02_03;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class DeveloperList {

    private Developer[] internList = new Developer[5];
    private Developer[] juniorList = new Developer[5];
    private Developer[] seniorList = new Developer[5];
    private Developer[] teamLeadList = new Developer[5];
    private int internCount;
    private int juniorCount;
    private int seniorCount;
    private int teamLeadlCount;

    public void add(Developer d) {
        if (d instanceof InternDeveloper) {
            internList = check(internList, internCount);
            internList[internCount++] = d;
        } else if (d instanceof JuniorDeveloper) {
            juniorList = check(juniorList, juniorCount);
            juniorList[juniorCount++] = d;
        } else if (d instanceof SeniorDeveloper) {
            seniorList = check(seniorList, seniorCount);
            seniorList[seniorCount++] = d;
        } else if (d instanceof TeamLeadDeveloper) {
            teamLeadList = check(teamLeadList, teamLeadlCount);
            teamLeadList[teamLeadlCount++] = d;
        }
    }

    public void showAllList() {
        System.out.println("------------------------\nAll developers:");
        showList(internList, internCount, 0);
        showList(juniorList, juniorCount, 0);
        showList(seniorList, seniorCount, 0);
        showList(teamLeadList, teamLeadlCount, 0);
    }

    public void showList(String name, int minSalary) {
        if (minSalary != 0) {
            System.out.println("------------------------\n" + name + "s with a salary of more than " + minSalary);
        } else {
            System.out.println("------------------------\n" + name + "s:");
        }
        if (name.equalsIgnoreCase("intern developer")) {
            showList(internList, internCount, minSalary);
        } else if (name.equalsIgnoreCase("junior developer")) {
            showList(juniorList, juniorCount, minSalary);
        } else if (name.equalsIgnoreCase("senior developer")) {
            showList(seniorList, seniorCount, minSalary);
        } else if (name.equalsIgnoreCase("team lead developer")) {
            showList(teamLeadList, teamLeadlCount, minSalary);
        }
    }

    private static Developer[] check(Developer[] list, int counter) {
        if (counter >= list.length) {
            return resizeList(list, list.length * 3 / 2 + 1);
        } else {
            return list;
        }
    }

    private static Developer[] resizeList(Developer[] list, int newLangth) {
        final Developer[] newList = new Developer[newLangth];
        System.arraycopy(list, 0, newList, 0, list.length);
        return newList;
    }

    private static void showList(Developer[] list, int counter, int minSalary) {
        for (int i = 0; i < counter; i++) {
            if (list[i].getSalary() >= minSalary) {
                System.out.println(list[i]);
            }
        }
    }
}
