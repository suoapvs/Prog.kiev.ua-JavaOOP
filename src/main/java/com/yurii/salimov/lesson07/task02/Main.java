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
        Account acc = new Account(1000);
        Transaction[] transactions = {
                new Transaction(acc, 200),
                new Transaction(acc, 100),
                new Transaction(acc, 150),
                new Transaction(acc, 50),
                new Transaction(acc, 100),
                new Transaction(acc, 400)
        };

        for (Transaction t : transactions) {
            t.start();
        }

        for (Transaction t : transactions) {
            try {
                t.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        System.out.println("Total:" + acc.get());
    }
}
