package com.yurii.salimov.lesson02.task02;

import java.util.Date;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class StudentList {

    private final static int DEFAULT_CAPACITY = 10;

    private Student[] list;
    private int counter;

    public StudentList() {
        this.list = new Student[DEFAULT_CAPACITY];
    }

    public StudentList(final int capacity) {
        this.list = new Student[capacity];
    }

    public void add(final Student student) {
        checkLength();
        this.list[counter++] = student;
    }

    public void delete(final int index) {
        if ((index >= 0) && (index < this.list.length)) {
            System.arraycopy(
                    this.list, index + 1,
                    this.list, index,
                    this.list.length - 1 - index
            );
            this.list[this.list.length - 1] = null;
            this.counter--;
        }
    }

    public Student get(final int index) {
        return this.list[index];
    }

    public String getNameAndSurname(final int index) {
        final Student student = get(index);
        return student.getName() + " " + student.getSurname();
    }

    public Student findByName(final String name) {
        Student student = null;
        for (int i = 0; i < this.counter; i++) {
            if (this.list[i].getName().equalsIgnoreCase(name)) {
                student = this.list[i];
                break;
            }
        }
        return student;
    }

    public Student findBySurname(final String surname) {
        Student student = null;
        for (int i = 0; i < this.counter; i++) {
            if (this.list[i].getSurname().equalsIgnoreCase(surname)) {
                student = this.list[i];
                break;
            }
        }
        return student;
    }

    public Student findByDate(final Date birth) {
        Student student = null;
        for (int i = 0; i < this.counter; i++) {
            if (list[i].getBirth().equals(birth)) {
                student = this.list[i];
                break;
            }
        }
        return student;
    }

    public void showAllList() {
        for (int i = 0; i < this.counter; i++) {
            System.out.println(this.list[i]);
        }
    }

    private void checkLength() {
        if (this.counter == this.list.length) {
            resizeList(this.list.length * 3 / 2 + 1);
        }
    }

    private void resizeList(final int length) {
        final Student[] newList = new Student[length];
        System.arraycopy(this.list, 0, newList, 0, this.list.length);
        this.list = newList;
    }
}
