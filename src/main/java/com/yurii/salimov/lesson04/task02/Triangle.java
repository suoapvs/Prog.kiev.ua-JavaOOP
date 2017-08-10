package com.yurii.salimov.lesson04.task02;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Triangle extends Figure {

    private static final String NAME = "Triangle";

    private final double sideA;
    private final double sideB;
    private final double sideC;

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

    public double getSideB() {
        return this.sideB;
    }

    public double getSideC() {
        return this.sideC;
    }

    public static Triangle combine(final Triangle first, final Triangle second) {
        final double sideA = first.getSideA() + second.getSideA();
        final double sideB = first.getSideB() + second.getSideB();
        final double sideC = first.getSideC() + second.getSideC();
        return new Triangle(sideA, sideB, sideC);
    }
}
