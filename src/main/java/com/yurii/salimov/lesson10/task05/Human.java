package com.yurii.salimov.lesson10.task05;

import java.io.Serializable;
import java.util.Scanner;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Human implements Serializable {

    private static final long serialVersionUID = 1L;
    private final String name;
    private final String surname;
    private final String birth;
    private String phone;

    public Human(
            final String name, final String surname,
            final String birth, final String phone
    ) {
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

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getBirth() {
        return this.birth;
    }

    public String getPhone() {
        return this.phone;
    }

    public static Human create(final Scanner scanner) {
        System.out.print("Enter name: ");
        final String name = scanner.nextLine();
        System.out.print("Enter surname: ");
        final String surname = scanner.nextLine();
        System.out.print("Enter birth: ");
        final String birth = scanner.nextLine();
        System.out.print("Enter phone: ");
        final String phone = scanner.nextLine();
        return new Human(name, surname, birth, phone);
    }
}
