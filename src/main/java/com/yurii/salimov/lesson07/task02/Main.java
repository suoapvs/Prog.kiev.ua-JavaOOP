package com.yurii.salimov.lesson07.task02;

/**
 * 7.2 Решить задачу про банк с помощью чего-нибудь
 * из java.util.concurrent.* Не через Atomic. 
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final Account account = new Account(1000);
        final Transaction[] transactions = {
                new Transaction(account, 200),
                new Transaction(account, 100),
                new Transaction(account, 150),
                new Transaction(account, 50),
                new Transaction(account, 100),
                new Transaction(account, 400)
        };

        for (Transaction transaction : transactions) {
            transaction.start();
        }

        for (Transaction transaction : transactions) {
            try {
                transaction.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        System.out.println("Total:" + account.get());
    }
}
