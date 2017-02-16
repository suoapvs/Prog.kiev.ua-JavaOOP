package com.yurii.salimov.lesson03.task01_02_03;
/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class TeamLeadDeveloper extends Developer {

    public TeamLeadDeveloper(String name, double basicSalary, int experience) {
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return basicSalary * 4 + (experience > 0 ? basicSalary * experience * 0.1 : 0);
    }
}
