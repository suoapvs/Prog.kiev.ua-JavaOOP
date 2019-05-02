package com.yurii.salimov.lesson02.task05.figure.triangle;

import com.yurii.salimov.lesson02.task05.figure.Builder;

/**
 * The class implements a set of methods
 * for building an objects of the {@link Triangle} class.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @see Triangle
 */
public final class TriangleBuilder implements Builder<Triangle> {

    private final static int MIN_LENGTH = 0;

    /**
     * The length of a first side (A) of a triangle.
     * The side between the B and C points.
     */
    private double sideA;

    /**
     * The length of a second side (B) of a triangle.
     * The side between the A and C points .
     */
    private double sideB;

    /**
     * The length of a third side (C) of a triangle.
     * The side between the A and B points.
     */
    private double sideC;

    /**
     * Builds and returns a new triangle.
     *
     * @return The new triangle.
     * @see Triangle
     */
    @Override
    public Triangle build() {
        return new TriangleFigure(
                getSideA(),
                getSideB(),
                getSideC()
        );
    }

    /**
     * Adds a new first triangle side (A) to a new triangle.
     *
     * @param sideA the new first triangle side (A) to a new triangle.
     * @return the triangle builder.
     */
    public TriangleBuilder addSideA(double sideA) {
        this.sideA = sideA;
        return this;
    }

    /**
     * Adds a new first triangle side (B) to a new triangle.
     *
     * @param sideB the new first triangle side (B) to a new rectangle.
     * @return the triangle builder.
     */
    public TriangleBuilder addSideB(double sideB) {
        this.sideB = sideB;
        return this;
    }

    /**
     * Adds a new first triangle side (C) to a new triangle.
     *
     * @param sideC the new first triangle side (C) to a new rectangle.
     * @return the triangle builder.
     */
    public TriangleBuilder addSideC(double sideC) {
        this.sideC = sideC;
        return this;
    }

    /**
     * Returns a first triangle side (A) of a new triangle.
     * Returns 0 if the first triangle side (A) is negative.
     *
     * @return The first triangle side (A) (newer negative).
     */
    private double getSideA() {
        return validate(this.sideA);
    }

    /**
     * Returns a first triangle side (B) of a new triangle.
     * Returns 0 if the first triangle side (B) is negative.
     *
     * @return The first triangle side (B) (newer negative).
     */
    private double getSideB() {
        return validate(this.sideB);
    }

    /**
     * Returns a first triangle side (C) of a new triangle.
     * Returns 0 if the first triangle side (C) is negative.
     *
     * @return The first triangle side (C) (newer negative).
     */
    private double getSideC() {
        return validate(this.sideC);
    }

    private double validate(final double side) {
        return Math.max(side, MIN_LENGTH);
    }
}
