package com.yurii.salimov.lesson03.task05;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Triangle implements Figure {

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
    public String toString() {
        return "Triangle{" +
                "sideA=" + this.sideA +
                ", sideB=" + this.sideB +
                ", sideC=" + this.sideC +
                ", area=" + getArea() +
                '}';
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if ((object == null) || (getClass() != object.getClass())) {
            return false;
        }
        final Triangle that = (Triangle) object;
        return (this.sideA == that.sideA) &&
                (this.sideB == that.sideB) &&
                (this.sideC == that.sideC);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Double.hashCode(this.sideA);
        result = 31 * result + Double.hashCode(this.sideB);
        result = 31 * result + Double.hashCode(this.sideC);
        return result;
    }
}
