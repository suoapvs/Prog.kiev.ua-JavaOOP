package com.yurii.salimov.lesson03.task01_02_03;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class DeveloperList {

    private Developer[] internList = new Developer[5];
    private Developer[] juniorList = new Developer[5];
    private Developer[] seniorList = new Developer[5];
    private Developer[] teamLeadList = new Developer[5];
    private int internCount;
    private int juniorCount;
    private int seniorCount;
    private int teamLeadlCount;

    public void add(final Developer developer) {
        if (developer instanceof InternDeveloper) {
            this.internList = check(this.internList, this.internCount);
            this.internList[this.internCount++] = developer;
        } else if (developer instanceof JuniorDeveloper) {
            this.juniorList = check(this.juniorList, this.juniorCount);
            this.juniorList[this.juniorCount++] = developer;
        } else if (developer instanceof SeniorDeveloper) {
            this.seniorList = check(this.seniorList, this.seniorCount);
            this.seniorList[this.seniorCount++] = developer;
        } else if (developer instanceof TeamLeadDeveloper) {
            this.teamLeadList = check(this.teamLeadList, this.teamLeadlCount);
            this.teamLeadList[this.teamLeadlCount++] = developer;
        }
    }

    public void showAllList() {
        System.out.println("------------------------\nAll developers:");
        showList(this.internList, this.internCount, 0);
        showList(this.juniorList, this.juniorCount, 0);
        showList(this.seniorList, this.seniorCount, 0);
        showList(this.teamLeadList, this.teamLeadlCount, 0);
    }

    public void showList(final String name, final int minSalary) {
        if (minSalary != 0) {
            System.out.println("------------------------\n" + name + "s with a salary of more than " + minSalary);
        } else {
            System.out.println("------------------------\n" + name + "s:");
        }
        if (name.equalsIgnoreCase("intern developer")) {
            showList(this.internList, this.internCount, minSalary);
        } else if (name.equalsIgnoreCase("junior developer")) {
            showList(this.juniorList, this.juniorCount, minSalary);
        } else if (name.equalsIgnoreCase("senior developer")) {
            showList(this.seniorList, this.seniorCount, minSalary);
        } else if (name.equalsIgnoreCase("team lead developer")) {
            showList(this.teamLeadList, this.teamLeadlCount, minSalary);
        }
    }

    private static Developer[] check(final Developer[] list, final int counter) {
        if (counter >= list.length) {
            return resizeList(list, list.length * 3 / 2 + 1);
        } else {
            return list;
        }
    }

    private static Developer[] resizeList(final Developer[] list, final int newLangth) {
        final Developer[] newList = new Developer[newLangth];
        System.arraycopy(list, 0, newList, 0, list.length);
        return newList;
    }

    private static void showList(final Developer[] list, final int counter, final int minSalary) {
        for (int i = 0; i < counter; i++) {
            if (list[i].getSalary() >= minSalary) {
                System.out.println(list[i]);
            }
        }
    }
}
