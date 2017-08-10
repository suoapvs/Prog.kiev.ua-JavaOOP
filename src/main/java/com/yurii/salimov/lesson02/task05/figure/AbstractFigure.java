package com.yurii.salimov.lesson02.task05.figure;

import com.yurii.salimov.lesson02.task05.figure.point.Point;
import com.yurii.salimov.lesson02.task05.figure.point.PointBuilder;

/**
 * The abstract superclass implements a set of standard methods
 * for working with a geometric figures.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public abstract class AbstractFigure implements Figure, Cloneable {

    /**
     * Constructor.
     */
    protected AbstractFigure() {
    }

    /**
     * Returns a string representation of the object.
     *
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        return getName() +
                ": perimeter = " + getPerimeter() +
                ", area = " + getArea();
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
        return (this == object) || (object != null) &&
                (getClass() == object.getClass());
    }

    /**
     * Creates and returns a copy of this object.
     *
     * @return A clone of this instance (newer null).
     */
    @Override
    public AbstractFigure clone() {
        AbstractFigure clone = null;
        try {
            clone = (AbstractFigure) super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return clone;
    }

    /**
     * Returns a hash code value for the object.
     * This method is supported for the benefit
     * of hash tables such as those provided by HashMap.
     *
     * @return A hash code value for this object.
     */
    @Override
    public abstract int hashCode();

    /**
     * Creates and returns a new point with the incoming parameters.
     *
     * @param abscissa the abscissa for a new point.
     * @param ordinate the ordinate for a new point.
     * @return the new point.
     */
    protected Point createPoint(final double abscissa, final double ordinate) {
        final PointBuilder builder = Point.getBuilder();
        builder.addAbscissa(abscissa).addOrdinate(ordinate);
        return builder.build();
    }
}
