package com.yurii.salimov.lesson02.task05.figure.circle;

import com.yurii.salimov.lesson02.task05.figure.AbstractFigure;
import com.yurii.salimov.lesson02.task05.figure.point.Point;
import com.yurii.salimov.lesson02.task05.figure.point.PointBuilder;

/**
 * The class implements a set of methods
 * for working with a Circle geometric figure.
 * <pre>
 *           *
 *     * * d ↑ * * *
 *   * * * i | * * * *
 *   * * * a | radius *
 * * * * * m *←------→ *
 *   * * * e | ↖ * * *
 *   * * * t | * \ * *
 *     * * r ↓ * * \
 *           *      centre
 * </pre>
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
final class CircleFigure extends AbstractFigure implements Circle {

    /**
     * The circle name.
     */
    private final static String NAME = "Circle";

    /**
     * The circle radius.
     */
    private final double radius;

    /**
     * Constructor.
     *
     * @param radius the radius of a new circle.
     */
    CircleFigure(final double radius) {
        this.radius = radius;
    }

    /**
     * Calculates and returns the circle area.
     * circle area = PI * radius ^ 2
     *
     * @return the circle area.
     */
    @Override
    public double getArea() {
        return (Math.PI * this.radius * this.radius);
    }

    /**
     * Calculates and returns a circle perimeter.
     * Circle perimeter = 2 * PI * radius = PI * diameter
     *
     * @return the circle perimeter.
     */
    @Override
    public double getPerimeter() {
        return Math.PI * getDiameter();
    }

    /**
     * Returns a string representation of the object.
     *
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        return super.toString() +
                ", radius = " + this.radius +
                ", diameter = " + getDiameter();
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if ((object == null) || (getClass() != object.getClass())) {
            return false;
        }
        final CircleFigure that = (CircleFigure) object;
        return (this.radius == that.radius);
    }

    @Override
    public int hashCode() {
        int result = 15;
        result = 31 * result + Double.hashCode(this.radius);
        return result;
    }

    /**
     * Creates and returns a copy of this object.
     *
     * @return A clone of this instance (newer null).
     */
    @Override
    public CircleFigure clone() {
        return (CircleFigure) super.clone();
    }

    /**
     * Returns a circle radius.
     *
     * @return the circle radius.
     */
    @Override
    public double getRadius() {
        return this.radius;
    }

    /**
     * Calculates and returns the circle diameter.
     *
     * @return the circle diameter.
     */
    @Override
    public double getDiameter() {
        return 2 * this.radius;
    }

    /**
     * Calculates and returns the circle center point.
     *
     * @return the circle center point.
     */
    @Override
    public Point getCentre() {
        return createPoint(
                this.radius,
                this.radius
        );
    }

    /**
     * Returns the circle name.
     *
     * @return the circle name
     */
    @Override
    public String getName() {
        return NAME;
    }

    /**
     * Draws the circle in the console.
     * Draws a point if this point is in the circle,
     * otherwise draws empty symbols "  ".
     */
    @Override
    public void draw() {
        final double diameter = getDiameter();
        final PointBuilder builder = Point.getBuilder();
        Point point;
        for (double abscissa = 0; abscissa <= diameter; abscissa++) {
            builder.addAbscissa(abscissa);
            for (double ordinate = 0; ordinate <= diameter; ordinate++) {
                point = builder.addOrdinate(ordinate).build();
                if (isPointInCircle(point)) {
                    point.draw();
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Checks if the incoming point is in the circle.
     *
     * @param point the point to check.
     * @return true if the incoming point is in this circle,
     * false otherwise.
     */
    private boolean isPointInCircle(final Point point) {
        return (calculateLengthToCentre(point) <= this.radius);
    }

    /**
     * Calculates and returns a length from incoming point to circle centre.
     * Length to circle centre is
     * L = sqrt[X^2 + Y^2],
     * where X - length of a projection on the x-axis,
     * Y - length of a projection on the y-axis.
     *
     * @param point the point to check.
     * @return a length from incoming point to circle centre.
     */
    private double calculateLengthToCentre(final Point point) {
        final Point centre = getCentre();
        final double lengthToAxisX = centre.getAbscissa() - point.getAbscissa();
        final double lengthToAxisY = centre.getOrdinate() - point.getOrdinate();
        return Math.sqrt(lengthToAxisX * lengthToAxisX + lengthToAxisY * lengthToAxisY);
    }
}
