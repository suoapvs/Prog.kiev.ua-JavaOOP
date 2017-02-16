package com.yurii.salimov.lesson03.task01_02_03;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public abstract class Developer {

    protected String name;
    protected double basicSalary;
    protected int experience;

    public Developer(String name, double basicSalary, int experience) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.basicSalary + " * " + this.experience + " = " + getSalary();
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public abstract double getSalary();
}
