package com.yurii.salimov.lesson09.task01_02_03;

import java.io.Serializable;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Human implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private String surname;
    private String birth;
    private String sex;
    private transient String profession;
    private transient int height;
    private transient int weight;

    public Human() {
        this.height = 170;
        this.weight = 70;
    }

    public Human(String name, String surname, String birth, String sex) {
        this();
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.sex = sex;
    }

    @Override
    public Human clone() throws CloneNotSupportedException {
        return (Human) super.clone();
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birth='" + birth + '\'' +
                ", sex='" + sex + '\'' +
                ", profession='" + profession + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        final Human other = (Human) object;
        if (this.height != other.height) return false;
        if (this.weight != other.weight) return false;
        if (this.name != null ? !this.name.equals(other.name) : other.name != null) return false;
        if (this.surname != null ? !this.surname.equals(other.surname) : other.surname != null) return false;
        if (this.birth != null ? !this.birth.equals(other.birth) : other.birth != null) return false;
        if (this.sex != null ? !this.sex.equals(other.sex) : other.sex != null) return false;
        return this.profession != null ? this.profession.equals(other.profession) : other.profession == null;

    }

    @Override
    public int hashCode() {
        int result = this.name != null ? this.name.hashCode() : 0;
        result = 31 * result + (this.surname != null ? this.surname.hashCode() : 0);
        result = 31 * result + (this.birth != null ? this.birth.hashCode() : 0);
        result = 31 * result + (this.sex != null ? this.sex.hashCode() : 0);
        result = 31 * result + (this.profession != null ? this.profession.hashCode() : 0);
        result = 31 * result + this.height;
        result = 31 * result + this.weight;
        return result;
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

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getProfession() {
        return this.profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
