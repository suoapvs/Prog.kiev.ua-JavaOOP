package com.yurii.salimov.lesson02.task03_04_06;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class IPhone extends Phone {

    public IPhone() {
        this.touch = true;
        this.hasWifi = true;
        this.screenSize = 3;
        this.model = "IPhone";
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println(this.model + " is sending sms: \"" + message + "\" to " + number);
        this.smsCounter++;
    }
}
