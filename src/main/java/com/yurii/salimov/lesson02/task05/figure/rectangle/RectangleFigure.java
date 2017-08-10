package com.yurii.salimov.lesson02.task05.figure.rectangle;

import com.yurii.salimov.lesson02.task05.figure.AbstractFigure;
import com.yurii.salimov.lesson02.task05.figure.point.Point;
import com.yurii.salimov.lesson02.task05.figure.point.PointBuilder;

/**
 * The class implements a set of methods
 * for working with a Rectangle geometric figure.
 * <pre>
 *               w i d t h
 *       A |←----------------→| B
 *      -- * * * * * * * * * * *
 *   h  ↑  * * * * * * * * * * *
 *   e  |  * * * * * * * * * * *
 *   i  |  * * * * * * * * * * *
 *   g  |  * * * * * * * * * * *
 *   h  |  * * * * * * * * * * *
 *   t  ↓  * * * * * * * * * * *
 *      -- * * * * * * * * * * *
 *       C                       D
 * </pre>
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
final class RectangleFigure extends AbstractFigure implements Rectangle {

    /**
     * Rectangle name.
     */
    private final static String NAME = "Rectangle";

    /**
     * Rectangle width.
     */
    private final double width;

    /**
     * Rectangle height.
     */
    private final double height;

    /**
     * Constructor.
     *
     * @param width  the width for a new rectangle.
     * @param height the height for a new rectangle.
     */
    RectangleFigure(final double width, final double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates and returns the rectangle area.
     * rectangle area = width * height
     *
     * @return the rectangle area.
     */
    @Override
    public double getArea() {
        return this.width * this.height;
    }

    /**
     * Calculates and returns the rectangle perimeter.
     * rectangle perimeter = 2 * (width + height)
     *
     * @return the rectangle perimeter.
     */
    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    /**
     * Returns a string representation of the object.
     *
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        return super.toString() +
                ", width = " + this.width +
                ", height = " + this.height;
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
            final RectangleFigure other = (RectangleFigure) object;
            result = (this.width == other.width) &&
                    (this.height == other.height);
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
        long temp = Double.doubleToLongBits(this.width);
        int result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(this.height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /**
     * Creates and returns a copy of this object.
     *
     * @return A clone of this instance (newer null).
     */
    @Override
    public RectangleFigure clone() {
        return (RectangleFigure) super.clone();
    }

    /**
     * Returns the rectangle width.
     *
     * @return the rectangle width.
     */
    @Override
    public double getWidth() {
        return this.width;
    }

    /**
     * Returns the rectangle height.
     *
     * @return the rectangle height.
     */
    @Override
    public double getHeight() {
        return this.height;
    }

    /**
     * Calculates and returns a point A of the rectangle.
     * The coordinates of the point A is (0, 0).
     *
     * @return the point A of the rectangle.
     */
    @Override
    public Point getPointA() {
        final double abscissa = 0;
        final double ordinate = 0;
        return createPoint(abscissa, ordinate);
    }

    /**
     * Calculates and returns a point B of the rectangle.
     * The coordinates of the point B is (0, rectangle width).
     *
     * @return the point B of the rectangle.
     */
    @Override
    public Point getPointB() {
        final double abscissa = 0;
        final double ordinate = this.width;
        return createPoint(abscissa, ordinate);
    }

    /**
     * Calculates and returns a point C of the rectangle.
     * The coordinates of the point C is (rectangle height, rectangle width).
     *
     * @return the point C of the rectangle.
     */
    @Override
    public Point getPointC() {
        final double abscissa = this.height;
        final double ordinate = this.width;
        return createPoint(abscissa, ordinate);
    }

    /**
     * Calculates and returns a point D of the rectangle.
     * The coordinates of the point D is (rectangle height, 0).
     *
     * @return the point D of the rectangle.
     */
    @Override
    public Point getPointD() {
        final double abscissa = this.height;
        final double ordinate = 0;
        return createPoint(abscissa, ordinate);
    }

    /**
     * Draws the rectangle in the console.
     */
    @Override
    public void draw() {
        final PointBuilder builder = Point.getBuilder();
        Point point;
        for (int abscissa = 0; abscissa <= this.width; abscissa++) {
            builder.addAbscissa(abscissa);
            for (int ordinate = 0; ordinate <= this.height; ordinate++) {
                builder.addOrdinate(ordinate);
                point = builder.build();
                point.draw();
            }
            System.out.println();
        }
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
