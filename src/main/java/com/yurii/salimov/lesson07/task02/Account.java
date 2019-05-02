package com.yurii.salimov.lesson07.task02;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Account {

    private int money;
    private final Lock lock;

    public Account(final int money) {
        this.money = money;
        this.lock = new ReentrantLock();
    }

    public int get() {
        return this.money;
    }

    public void withdraw(final int amount) {
        this.lock.lock();
        if (this.money >= amount) {
            this.money -= amount;
        }
        this.lock.unlock();
    }
}
