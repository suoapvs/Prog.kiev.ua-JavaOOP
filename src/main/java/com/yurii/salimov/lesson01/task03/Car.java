package com.yurii.salimov.lesson01.task03;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Car {

    private final String model;
    private boolean started;
    private double speed;

    public Car(final String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void start() {
        this.started = true;
        System.out.println("Engine is started!");
    }

    public void stop() {
        this.started = false;
        System.out.println("Engine is stopped!");
    }

    public boolean isStarted() {
        return this.started;
    }

    public void speed(final int speed, final int acceleration) {
        if (this.speed != speed) {
            if (this.speed < speed) {
                speedUp(speed, acceleration);
            } else {
                speedDown(speed, acceleration);
            }
            if (this.speed == 0) {
                System.out.println("Car is stopped!");
            }
        } else {
            System.out.println("Speed car is " + this.speed + " km/h now.");
        }
    }

    private void speedUp(final double speed, final double acceleration) {
        if (!isStarted()) {
            System.out.println("Start the engine!");
        } else {
            System.out.println("The car accelerates to " + speed + " km/h " +
                    "with an acceleration of " + acceleration + " km/s:");
            while (this.speed != speed) {
                if (this.speed + acceleration > speed) {
                    this.speed = speed;
                }
                System.out.println(this.speed + " km/h");
                sleep();
            }
        }
    }

    private void speedDown(final int speed, final int acceleration) {
        if (!isStarted()) {
            System.out.println("Start the engine!");
        } else {
            System.out.println("The car slows to " + speed + " km/h " +
                    "with an acceleration of -" + acceleration + " km/s:");
            while (this.speed != speed) {
                if (this.speed - acceleration < speed) {
                    this.speed = speed;
                }
                System.out.println(this.speed + " km/h");
                sleep();
            }
        }
    }

    private void sleep() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
