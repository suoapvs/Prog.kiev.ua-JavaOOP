package com.yurii.salimov.lesson01.task03;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Car {

    private final String model;
    private boolean started;
    private int speed;

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

    public void speed(int speed, int acceleration) {
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

    private void speedUp(double speed, double acceleration) {
        if (this.started) {
            System.out.println("The car accelerates to " + speed + " km/h with an acceleration of " + acceleration + " km/s:");

            while (this.speed != speed) {
                if (this.speed + acceleration > speed) {
                    acceleration = speed - this.speed;
                }
                this.speed += acceleration;
                System.out.println(this.speed + " km/h");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        } else {
            System.out.println("Start the engine!");
        }
    }

    private void speedDown(int speed, int acceleration) {
        System.out.println("The car slows to " + speed + " km/h with an acceleration of -" + acceleration + " km/s:");
        while (this.speed != speed) {
            if (this.speed - acceleration < speed) {
                acceleration = this.speed - speed;
            }
            this.speed -= acceleration;
            System.out.println(this.speed + " km/h");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
