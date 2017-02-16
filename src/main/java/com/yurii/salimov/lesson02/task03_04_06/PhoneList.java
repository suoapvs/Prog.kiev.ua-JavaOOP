package com.yurii.salimov.lesson02.task03_04_06;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class PhoneList {

    private final static int DEFAULT_CAPACITY = 10;

    private Phone[] list;
    private int counter;

    public PhoneList() {
        this(DEFAULT_CAPACITY);
    }

    public PhoneList(final int capacity) {
        this.list = new Phone[capacity];
    }

    public void add(final Phone phone) {
        checkList();
        this.list[this.counter++] = phone;
    }

    public Phone get(final int index) {
        return this.list[index];
    }

    public int getCounter() {
        return this.counter;
    }

    public Phone findPhone(String number) {
        for (int i = 0; i < this.counter; i++) {
            if (this.list[i].getPhoneNumber().equals(number)) {
                return this.list[i];
            }
        }
        return null;
    }

    public void showAllList() {
        System.out.println("------------------------------------------------");
        System.out.println("Phone book:");
        for (int i = 0; i < this.counter; i++) {
            System.out.println((i + 1) + ") " + this.list[i]);
        }
        System.out.println("------------------------------------------------");
    }

    private void checkList() {
        if (this.counter >= this.list.length) {
            resizeList(this.list.length * 3 / 2 + 1);
        }
    }

    private void resizeList(final int newLength) {
        final Phone[] list = new Phone[newLength];
        System.arraycopy(this.list, 0, list, 0, this.list.length);
        this.list = list;
    }
}
