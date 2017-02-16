package com.yurii.salimov.lesson02.task03_04_06;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public abstract class Phone {

    private static PhoneList list = new PhoneList();

    protected String model;
    protected String phoneNumber;
    protected int callCounter;
    protected int smsCounter;
    protected int screenSize;
    protected boolean touch;
    protected boolean hasWifi;

    public Phone() {
        addPhone(this);
    }

    @Override
    public String toString() {
        return this.model + ":\t" + this.phoneNumber + " - " +
                this.callCounter + " phone cals, " +
                this.callCounter + " sms";
    }

    public static void addPhone(Phone phone) {
        list.add(phone);
    }

    public static void showList() {
        list.showAllList();
    }

    public void call(final String number) {
        System.out.println(this.model + " is calling to " + number);
        this.callCounter++;
        answer(number);
    }

    private void answer(final String number) {
        try {
            final Phone phone = list.findPhone(number);
            System.out.println(phone.getModel() + " is answer.");
        } catch (Exception e) {
            System.out.println(number + " is answer.");
        }
    }

    public boolean isTouch() {
        return this.touch;
    }

    public boolean isHasWifi() {
        return this.hasWifi;
    }

    public int getScreenSize() {
        return this.screenSize;
    }

    public int getCallCounter() {
        return this.callCounter;
    }

    public int getSmsCounter() {
        return this.smsCounter;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getModel() {
        return this.model;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public abstract void sendSMS(final String number, final String message);
}
