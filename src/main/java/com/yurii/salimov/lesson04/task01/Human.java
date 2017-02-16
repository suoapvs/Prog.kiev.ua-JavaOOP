package com.yurii.salimov.lesson04.task01;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Human implements Comparable {

    private int age;

    public Human(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object obj) {
        final Human other = (Human) obj;
        if (this.age < other.age) {
            return -1;
        } else if (this.age > other.age) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getAge() {
        return this.age;
    }
}
