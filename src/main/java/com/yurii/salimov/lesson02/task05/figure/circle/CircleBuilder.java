package com.yurii.salimov.lesson02.task05.figure.circle;

import com.yurii.salimov.lesson02.task05.figure.Builder;

/**
 * The class implements a set of methods
 * for building an objects of the {@link Circle} class.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @see Circle
 */
public final class CircleBuilder implements Builder<Circle> {

    private final static int MIN_RADIUS = 0;

    /**
     * The circle radius.
     */
    private double radius;

    /**
     * Builds and returns a new circle.
     *
     * @return The new company.
     * @see Circle
     */
    @Override
    public Circle build() {
        return new CircleFigure(getRadius());
    }

    /**
     * Adds a new radius to a new circle.
     *
     * @param radius the new radius to a new circle.
     * @return the circle builder.
     */
    public CircleBuilder addRadius(final double radius) {
        this.radius = radius;
        return this;
    }

    /**
     * Returns a information of a new company.
     * Returns 0 if the radius is negative.
     *
     * @return The radius (newer negative).
     */
    private double getRadius() {
        return Math.max(this.radius, MIN_RADIUS);
    }
}
