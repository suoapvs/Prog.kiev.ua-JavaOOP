package com.yurii.salimov.lesson02.task03_04_06;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class SumsungS4 extends Phone {

    public SumsungS4() {
        this.touch = true;
        this.hasWifi = true;
        this.screenSize = 5;
        this.model = "Sumsung S4";
    }

    @Override
    public void sendSMS(final String number, final String message) {
        System.out.println(this.model + " is sending sms: \"" + message + "Hello!\" to " + number);
        smsCounter++;
    }
}
