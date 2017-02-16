package com.yurii.salimov.lesson02.task01;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Climate {

    private boolean on;
    private int temperature;

    public Climate() {
        this.temperature = 20;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperture(final int temperature) {
        this.temperature = temperature;
    }
}
