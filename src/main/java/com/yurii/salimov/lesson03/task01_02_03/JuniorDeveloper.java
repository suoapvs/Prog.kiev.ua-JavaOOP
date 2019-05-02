package com.yurii.salimov.lesson03.task01_02_03;
/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class JuniorDeveloper extends Developer {

    public JuniorDeveloper(final String name, final double basicSalary, final int experience) {
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return this.basicSalary + (this.experience > 0 ? this.basicSalary * this.experience * 0.1 : 0);
    }
}
