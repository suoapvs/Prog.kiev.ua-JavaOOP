package com.yurii.salimov.lesson02.task03_04_06;
/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Nokia3310 extends Phone {

    public Nokia3310() {
        this.touch = false;
        this.hasWifi = false;
        this.screenSize = 2;
        this.model = "Nokia 3310";
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println(this.model + " is sending sms: \"" + message + "\" to " + number);
        this.smsCounter++;
    }
}
