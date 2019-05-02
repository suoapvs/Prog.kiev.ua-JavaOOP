package com.yurii.salimov.lesson03.task10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Student {

    private static StudentList list = new StudentList();
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
    private static Scanner scanner = new Scanner(System.in);

    private String name;
    private String surname;
    private String birth;

    public static void add() {
        final Student st = new Student();
        System.out.print("Name = ");
        st.setName(scanner.nextLine());
        System.out.print("Surname = ");
        st.setSurname(scanner.nextLine());
        System.out.print("Birth (dd.MM.yyyy) = ");
        st.setBirth(scanner.nextLine());
        list.add(st);
    }

    public static void delete() {
        try {
            System.out.print("Enter the serial number of the student to remove n = ");
            list.delete(scanner.nextInt() - 1);
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        }
    }

    public static void showList() {
        list.showAllList();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(final String birth) {
        try {
            this.birth = dateFormat.format(dateFormat.parse(birth));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
}
