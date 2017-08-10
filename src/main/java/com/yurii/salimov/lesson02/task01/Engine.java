package com.yurii.salimov.lesson02.task01;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Engine {

    private double mileage;
    private boolean started;
    private double volume;

    public Engine(final double mileage, final double volume) {
        this.mileage = mileage;
        this.volume = volume;
    }

    public double getFuelRate() {
        int rate = 0;
        if ((this.volume >= 1.0) && (this.volume <= 2.0)) {
            rate = 10;
        } else if ((this.volume > 2.0) && (this.volume <= 3.0)) {
            rate = 15;
        } else if ((this.volume > 3.0) && (this.volume <= 4.0)) {
            rate = 20;
        } else if ((this.volume > 4.0) && (this.volume <= 5.0)) {
            rate = 25;
        }
        return rate;
    }

    public double getMileage() {
        return this.mileage;
    }

    public void addMileage(final double mileage) {
        if (mileage > 0 && isStarted()) {
            this.mileage += mileage;
        }
    }

    public boolean isStarted() {
        return this.started;
    }

    public void turnOn() {
        this.started = true;
    }

    public void turnOff() {
        this.started = false;
    }

    public double getVolume() {
        return this.volume;
    }
}
