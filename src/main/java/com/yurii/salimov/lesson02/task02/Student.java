package com.yurii.salimov.lesson02.task02;

import java.util.Date;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Student {

    private final String name;
    private final String surname;
    private final Date birth;

    public Student(String name, String surname, Date birth) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname + ": " + this.birth;
    }

    public String getName() {
        return this.name;
    }


    public String getSurname() {
        return this.surname;
    }

    public Date getBirth() {
        return this.birth;
    }
}
