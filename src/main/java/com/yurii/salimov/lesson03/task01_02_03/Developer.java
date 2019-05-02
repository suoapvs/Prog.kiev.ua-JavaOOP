package com.yurii.salimov.lesson03.task01_02_03;

import java.util.Objects;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public abstract class Developer {

    protected final String name;
    protected final double basicSalary;
    protected final int experience;

    protected Developer(
            final String name,
            final double basicSalary,
            final int experience
    ) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.basicSalary + " * " + this.experience + " = " + getSalary();
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if ((object == null) || (getClass() != object.getClass())) {
            return false;
        }
        final Developer that = (Developer) object;
        return Objects.equals(name, that.name) &&
                (this.basicSalary == that.basicSalary) &&
                (this.experience == that.experience);
    }

    @Override
    public int hashCode() {
        int result = 18;
        result = 31 * result + Objects.hashCode(this.name);
        result = 31 * result + Double.hashCode(this.basicSalary);
        result = 31 * result + this.experience;
        return result;
    }

    public abstract double getSalary();
}
