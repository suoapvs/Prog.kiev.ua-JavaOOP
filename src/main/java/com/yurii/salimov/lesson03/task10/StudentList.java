package com.yurii.salimov.lesson03.task10;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class StudentList {

    private Student[] list = new Student[10];
    private int counter;

    public void add(final Student student) {
        if (this.counter == this.list.length) {
            final Student[] list = new Student[this.list.length * 3 / 2 + 1];
            System.arraycopy(this.list, 0, list, 0, this.list.length);
            this.list = list;
        }
        this.list[this.counter++] = student;
    }

    public void delete(final int index) {
        if (index >= 0 && index < this.list.length) {
            System.arraycopy(this.list, index + 1, this.list, index, this.list.length - 1 - index);
            this.list[this.list.length - 1] = null;
            this.counter--;
        }
    }

    public Student get(final int index) {
        return this.list[index];
    }

    public void showAllList() {
        System.out.println("----------------");
        for (int i = 0; i < this.counter; i++) {
            System.out.println((i + 1) + ") " + list[i].getName() + " " + list[i].getSurname() + ": " + list[i].getBirth());
        }
        System.out.println("----------------");
    }
}
