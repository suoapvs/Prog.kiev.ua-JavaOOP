package com.yurii.salimov.lesson12.task03;

/**
 * 12.3 Написать стресс-тест для чата.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final String[] logins = {"Otto", "Vahha", "CTygeHT", "Geri",
                "Serega", "MadaM", "Edik", "Vasya_tolstoy", "Mr_Alex", ""};

        final String[] messages = {"Hello", "Hi!", "How are you?", "Prodam garaj, ne dorogo!",
                "Hello World", "Kuplu garaj!", "Go v CS", "Ya sozdam...",
                "Mojno ya poidu spat`?", "Eto SPARTA!", "=)",};

        for (int i = 0; i < 5; i++) {
            final StressClient stressClient = new StressClient("192.168.0.100", 5000, logins, messages);
            final Thread thread = new Thread(stressClient);
            thread.start();
        }
    }
}
