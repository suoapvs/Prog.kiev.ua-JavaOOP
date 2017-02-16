package com.yurii.salimov.lesson02.task02;

import java.util.Date;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Student {

    private String name;
    private String surname;
    private Date birth;

    public Student() {
        this.birth = new Date();
    }

    public Student(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public Student(String name, String surname, Date birth) {
        this(name, surname);
        this.birth = birth;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname + ": " + this.birth;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirth() {
        return this.birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
