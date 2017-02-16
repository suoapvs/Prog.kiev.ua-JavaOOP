package com.yurii.salimov.lesson03.task10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Student {

    private static StudentList list = new StudentList();
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
    private static Scanner scan = new Scanner(System.in);

    private String name;
    private String surname;
    private String birth;

    public static void add() {
        Student st = new Student();
        System.out.print("Name = ");
        st.setName(scan.nextLine());
        System.out.print("Surname = ");
        st.setSurname(scan.nextLine());
        System.out.print("Birth (dd.MM.yyyy) = ");
        st.setBirth(scan.nextLine());
        list.add(st);
    }

    public static void delete() {
        try {
            System.out.print("Enter the serial number of the student to remove n = ");
            int n = scan.nextInt() - 1;
            list.delete(n);
        } catch (InputMismatchException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void showList() {
        list.showAllList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            this.name = name;
        } catch (NullPointerException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        try {
            this.surname = surname;
        } catch (NullPointerException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        try {
            Date date = sdf.parse(birth);
            this.birth = sdf.format(date);
        } catch (ParseException ex) {
            System.out.println("Date error: " + ex.getMessage());
        }
    }
}
