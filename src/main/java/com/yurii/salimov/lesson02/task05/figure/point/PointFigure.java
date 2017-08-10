package com.yurii.salimov.lesson02.task05.figure.point;

import com.yurii.salimov.lesson02.task05.figure.AbstractFigure;

/**
 * The class implements a set of methods
 * for working with a Point geometric figure.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
final class PointFigure extends AbstractFigure implements Point {

    /**
     * The point name.
     */
    private final static String NAME = "Point";

    /**
     * The Point symbol to print.
     */
    private final static String POINT_SYMBOL = "* ";

    /**
     * The abscissa coordinate.
     */
    private final double abscissa;

    /**
     * The ordinate coordinate.
     */
    private final double ordinate;


    /**
     * Constructor.
     *
     * @param abscissa the abscissa of a new point.
     * @param ordinate the ordinate of a new point.
     */
    PointFigure(final double abscissa, final double ordinate) {
        this.abscissa = abscissa;
        this.ordinate = ordinate;
    }

    /**
     * Returns a string representation of the object.
     *
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        return super.toString() +
                ", abscissa = " + this.abscissa +
                ", ordinate = " + this.ordinate;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param object The reference object with which to compare.
     * @return true if this object is the same as the object
     * argument, false otherwise otherwise.
     */
    @Override
    public boolean equals(final Object object) {
        boolean result = super.equals(object);
        if (result) {
            final PointFigure other = (PointFigure) object;
            result = (this.abscissa == other.abscissa) &&
                    (this.ordinate == other.ordinate);
        }
        return result;
    }

    /**
     * Returns a hash code value for the object.
     * This method is supported for the benefit
     * of hash tables such as those provided by HashMap.
     *
     * @return A hash code value for this object.
     */
    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(this.abscissa);
        int result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(this.ordinate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /**
     * Creates and returns a copy of this object.
     *
     * @return A clone of this instance (newer null).
     */
    @Override
    public PointFigure clone() {
        return (PointFigure) super.clone();
    }

    /**
     * Calculates and returns a point area.
     * Material point is a geometric figure,
     * the dimensions that can be neglected.
     * And a point area is 0.
     *
     * @return the point area.
     */
    @Override
    public double getArea() {
        return 0;
    }

    /**
     * Calculates and returns the point perimeter.
     * Material point is a geometric figure,
     * the dimensions that can be neglected.
     * And a point perimeter is 0.
     *
     * @return the point perimeter.
     */
    @Override
    public double getPerimeter() {
        return 0;
    }

    /**
     * Returns an abscissa coordinate of the point.
     *
     * @return the abscissa coordinate of the point.
     */
    @Override
    public double getAbscissa() {
        return this.abscissa;
    }

    /**
     * Returns a point ordinate.
     *
     * @return the point ordinate.
     */
    @Override
    public double getOrdinate() {
        return this.ordinate;
    }

    /**
     * Draws the point in the console.
     */
    @Override
    public void draw() {
        System.out.print(POINT_SYMBOL);
    }

    /**
     * Returns the figure name.
     *
     * @return the figure name
     */
    @Override
    public String getName() {
        return NAME;
    }
}
