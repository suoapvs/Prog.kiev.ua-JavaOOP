package com.yurii.salimov.lesson07.task02;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Transaction extends Thread {

    private final Account account;
    private final int amount;

    public Transaction(final Account account, final int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        sleep();
        this.account.withdraw(this.amount);
    }

    private void sleep() {
        try {
            Thread.sleep(System.currentTimeMillis() % 50);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
