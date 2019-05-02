package com.yurii.salimov.lesson02.task01;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Car {

    private final String name;
    private final Engine engine;
    private final Climate climate;
    private double fuel;

    public Car(final String name) {
        this(name, 0, 1);
    }

    public Car(final String name, final double mileage, final double volume) {
        this.name = name;
        this.engine = new Engine(mileage, volume);
        this.climate = new Climate();
    }

    @Override
    public String toString() {
        return getName() + ": distance - " + getMileage() + " km, fuel rate - " + getFuel() + " liters.";
    }

    public void turnOn() {
        this.engine.turnOn();
        this.climate.turnOn();
        this.climate.updateTemperature(21);
    }

    public void turnOff() {
        this.engine.turnOff();
        this.climate.turnOff();
    }

    public void start(final int speed, final double hours) {
        if (this.engine.isStarted()) {
            final double distance = hours * speed;
            this.engine.addMileage(distance);
            this.fuel += distance * engine.getFuelRate() / 100;
        }
    }

    public String getName() {
        return this.name;
    }

    public double getMileage() {
        return this.engine.getMileage();
    }

    public double getFuel() {
        return this.fuel;
    }
}
