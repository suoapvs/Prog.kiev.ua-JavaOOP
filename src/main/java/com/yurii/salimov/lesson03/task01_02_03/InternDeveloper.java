package com.yurii.salimov.lesson03.task01_02_03;
/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class InternDeveloper extends Developer {

    public InternDeveloper(final String name, final double basicSalary, final int experience) {
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return this.basicSalary * 0.5 + (this.experience > 0 ? this.basicSalary * this.experience * 0.1 : 0);
    }
}
