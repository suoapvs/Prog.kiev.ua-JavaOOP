package com.yurii.salimov.lesson02.task05;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Triangle extends Figure {

    private static final String NAME = "Triangle";

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(final double sideA, final double sideB, final double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    //  Heron's formula
    @Override
    public double getArea() {
        final double semiperimeter = (this.sideA + this.sideB + this.sideC) / 2;
        return Math.sqrt(
                semiperimeter *
                        (semiperimeter - this.sideA) *
                        (semiperimeter - this.sideB) *
                        (semiperimeter - this.sideC)
        );
    }

    @Override
    public String getName() {
        return NAME;
    }

    public double getSideA() {
        return this.sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return this.sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return this.sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}
