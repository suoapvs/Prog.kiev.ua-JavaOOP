package com.yurii.salimov.lesson10.task05;

import java.io.Serializable;
import java.util.Scanner;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Human implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private String surname;
    private String birth;
    private long phone;

    public Human() {

    }

    public Human(String name, String surname, String birth, long phone) {
        this();
        this.name = name;
        this.birth = birth;
        this.surname = surname;
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.surname.hashCode() + this.birth.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final Human other = (Human) obj;
        return (this.name.equals(other.name)) &&
                (this.surname.equals(other.surname)) &&
                (this.birth.equals(other.birth));
    }

    @Override
    public Human clone() throws CloneNotSupportedException {
        return (Human) super.clone();
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + this.name + '\'' +
                ", surname='" + this.surname + '\'' +
                ", birth='" + this.birth + '\'' +
                ", phone=" + this.phone +
                '}';
    }

    public static Human create(final Scanner scanner) {
        final Human human = new Human();
        System.out.print("Enter name: ");
        human.name = scanner.nextLine();
        System.out.print("Enter surname: ");
        human.surname = scanner.nextLine();
        System.out.print("Enter birth: ");
        human.birth = scanner.nextLine();
        System.out.print("Enter phone: ");
        human.phone = scanner.nextLong();
        return human;
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

    public String getBirth() {
        return this.birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public long getPhone() {
        return this.phone;
    }
}
