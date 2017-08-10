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

    public Account(int money) {
        this.money = money;
        this.lock = new ReentrantLock();
    }

    public int get() {
        return this.money;
    }

    public void withdraw(final int amount) {
        this.lock.lock();
        try {
            if (this.money >= amount) {
                this.money -= amount;
            }
        } finally {
            this.lock.unlock();
        }
    }
}
