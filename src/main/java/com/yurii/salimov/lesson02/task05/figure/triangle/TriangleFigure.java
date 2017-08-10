package com.yurii.salimov.lesson02.task05.figure.triangle;

import com.yurii.salimov.lesson02.task05.figure.AbstractFigure;
import com.yurii.salimov.lesson02.task05.figure.point.Point;
import com.yurii.salimov.lesson02.task05.figure.point.PointAnalyzer;
import com.yurii.salimov.lesson02.task05.figure.point.PointBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * The class implements a set of methods
 * for working with a Triangle geometric figure.
 * <pre>
 *                    a
 *    A |←---------------------------→|  B
 *    -- * * * * * * * * * * * * * * * *
 *    ↑  * > alpha * * * * beta < *    \
 *    |  * * * * * * * * * * * *     ↗
 *    |  * * * * * * * * * *      /
 *  b |  * * * * * * * *      /
 *    |  * gamma* * *     /
 *    |  * ^ *  *     /    c
 *    ↓  * *     /
 *    -- *\   ↙
 *      C  \
 * </pre>
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
final class TriangleFigure extends AbstractFigure implements Triangle {

    /**
     * Triangle name.
     */
    private final static String NAME = "Triangle";

    /**
     * The length of a first side (A) of a triangle.
     * The side between the B and C points.
     */
    private final double sideA;

    /**
     * The length of a second side (B) of a triangle.
     * The side between the A and C points .
     */
    private final double sideB;

    /**
     * The length of a third side (C) of a triangle.
     * The side between the A and B points.
     */
    private final double sideC;

    /**
     * Constructor.
     *
     * @param sideA the length of a first side for a new rectangle.
     * @param sideB the length of a second side for a new rectangle.
     * @param sideC the length of a third side for a new rectangle.
     */
    TriangleFigure(final double sideA, final double sideB, final double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     * Calculates and returns the triangle area.
     * triangle area = sqrt[SP * (SP - sideA) * (SP - sideB)* (SP - sideC)],
     * where SP is semiperimeter.
     *
     * @return the triangle area.
     */
    @Override
    public double getArea() {
        final double semiperimeter = getPerimeter() / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - this.sideA) *
                (semiperimeter - this.sideB) * (semiperimeter - this.sideC));
    }

    /**
     * Calculates and returns the triangle perimeter.
     * triangle perimeter = sideA + sideB + sideC
     *
     * @return the triangle perimeter.
     */
    @Override
    public double getPerimeter() {
        return (this.sideA + this.sideB + this.sideC);
    }

    /**
     * Returns a string representation of the object.
     *
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        return super.toString() +
                ", sideA = " + this.sideA +
                ", sideB = " + this.sideB +
                ", sideC = " + this.sideC +
                ", angleAlpha = " + getAngleAlpha() +
                ", angleBeta = " + getAngleBeta() +
                ", angleGamma = " + getAngleGamma();
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
            final TriangleFigure other = (TriangleFigure) object;
            result = (this.sideA == other.sideA) &&
                    (this.sideB == other.sideB) &&
                    (this.sideC == other.sideC);
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
        long temp = Double.doubleToLongBits(this.sideA);
        int result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(this.sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(this.sideC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /**
     * Creates and returns a copy of this object.
     *
     * @return A clone of this instance (newer null).
     */
    @Override
    public TriangleFigure clone() {
        return (TriangleFigure) super.clone();
    }

    /**
     * Returns a length of the first triangle side (A).
     *
     * @return the first side length.
     */
    @Override
    public double getSideA() {
        return this.sideA;
    }

    /**
     * Returns a length of the second triangle side (B).
     *
     * @return the second side length.
     */
    @Override
    public double getSideB() {
        return this.sideB;
    }

    /**
     * Returns the length of the third triangle side (C).
     *
     * @return the third side length.
     */
    @Override
    public double getSideC() {
        return this.sideC;
    }

    /**
     * Calculates and returns the triangle Alpha angle.
     * The angle between the B and C sides.
     *
     * @return the triangle Alpha angle.
     */
    @Override
    public double getAngleAlpha() {
        return getAngle(this.sideA, this.sideB, this.sideC);
    }

    /**
     * Calculates and returns the triangle Beta angle.
     * This is the angle between the A and C sides.
     *
     * @return the triangle Beta angle.
     */
    @Override
    public double getAngleBeta() {
        return getAngle(this.sideB, this.sideA, this.sideC);
    }

    /**
     * Calculates and returns the triangle Gamma angle.
     * This is the angle between the A and B sides.
     *
     * @return the triangle Gamma angle.
     */
    @Override
    public double getAngleGamma() {
        return getAngle(this.sideC, this.sideB, this.sideA);
    }

    /**
     * Calculates and returns the A point of a triangle.
     * This is the point of intersection of sides B and C.
     *
     * @return the A point.
     */
    @Override
    public Point getPointA() {
        final double abscissa = 0;
        final double ordinate = 0;
        return createPoint(abscissa, ordinate);
    }

    /**
     * Calculates and returns the B point of a triangle.
     * This is the point of intersection of A and C sides.
     *
     * @return the B point.
     */
    @Override
    public Point getPointB() {
        final double abscissa = 0;
        final double ordinate = this.sideA;
        return createPoint(abscissa, ordinate);
    }

    /**
     * Calculates and returns the C point of a triangle.
     * This is the point of intersection of A and B sides.
     *
     * @return the C point.
     */
    @Override
    public Point getPointC() {
        final double abscissa = Math.abs(this.sideC * Math.cos(getAngleAlpha()));
        final double ordinate = Math.abs(this.sideC * Math.cos(getAngleBeta()));
        return createPoint(abscissa, ordinate);
    }

    /**
     * Returns the triangle name.
     *
     * @return the triangle name
     */
    @Override
    public String getName() {
        return NAME;
    }

    /**
     * Draws the triangle in the console.
     * Draws a point if this point is in the triangle,
     * otherwise draws empty symbols "  ".
     */
    @Override
    public void draw() {
        final List<Point> points = getPoints();
        final PointAnalyzer pointAnalyzer = new PointAnalyzer();
        final double maxAbscissa = pointAnalyzer.getMaxAbscissa(points);
        final double maxOrdinate = pointAnalyzer.getMaxOrdinate(points);
        final PointBuilder builder = Point.getBuilder();
        Point point;
        for (int abscissa = 0; abscissa < maxAbscissa; abscissa++) {
            builder.addAbscissa(abscissa);
            for (int ordinate = 0; ordinate < maxOrdinate; ordinate++) {
                builder.addOrdinate(ordinate);
                point = builder.build();
                if (isPointInTriangle(point)) {
                    point.draw();
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Checks whether this geometric figure is a triangle.
     * The sum of the two side must be more than the third side.
     *
     * @return true if this geometric figure is a triangle,
     * false otherwise.
     */
    @Override
    public boolean isTriangle() {
        return isSideOk(this.sideA, this.sideB, this.sideC) &&
                isSideOk(this.sideB, this.sideC, this.sideA) &&
                isSideOk(this.sideC, this.sideA, this.sideB);
    }

    /**
     * Calculates and returns a points of the triangle.
     *
     * @return thr points of the triangle.
     */
    private List<Point> getPoints() {
        final List<Point> points = new ArrayList<>();
        points.add(getPointA());
        points.add(getPointB());
        points.add(getPointC());
        return points;
    }

    /**
     * Checks if a point is in the triangle.
     *
     * @param point the point to check.
     * @return true if incoming point is in a triangle,
     * false otherwise.
     */
    private boolean isPointInTriangle(Point point) {
        final boolean result;
        if (point != null) {
            final Point pointA = getPointA();
            final Point pointB = getPointB();
            final Point pointC = getPointC();
            final double normalA = getNormal(pointB, pointC, point);
            final double normalB = getNormal(getPointC(), pointA, point);
            final double normalC = getNormal(pointA, pointB, point);
            result = checkNormal(normalA, normalB, normalC);
        } else {
            result = false;
        }
        return result;
    }

    /**
     * Calculates and returns normal value.
     *
     * @param pointA       the point A of a side.
     * @param pointB       the point B of a side.
     * @param pointToCheck the point to check.
     * @return the normal value.
     */
    private double getNormal(final Point pointA, final Point pointB, final Point pointToCheck) {
        return (pointA.getAbscissa() - pointToCheck.getAbscissa()) * (pointB.getOrdinate() - pointA.getOrdinate()) -
                (pointB.getAbscissa() - pointA.getAbscissa()) * (pointA.getOrdinate() - pointToCheck.getOrdinate());
    }

    /**
     * Checks a normals of a triangle.
     * Returns true if incoming normals are in similar diapason.
     * <pre>
     *     checkNormal(10, 2, 5) = true
     *     checkNormal(-10, -2, -5) = true
     *     checkNormal(-10, 2, -5) = false
     *     checkNormal(10, -2, 5) = false
     * </pre>
     *
     * @param normalA the normal A of the triangle.
     * @param normalB the normal B of the triangle.
     * @param normalC thea normal C of the triangle.
     * @return true if incoming normals are in similar diapason,
     * false otherwise.
     */
    private boolean checkNormal(final double normalA, final double normalB, final double normalC) {
        return (normalA >= 0 && normalB >= 0 && normalC >= 0) ||
                (normalA <= 0 && normalB <= 0 && normalC <= 0);
    }

    /**
     * Calculates and returns a triangle angle.
     * angle = arccos[(B^2 + C^2 - A^2) / (2 * B * C)]
     *
     * @param sideA the side A of the triangle.
     * @param sideB the side B of the triangle.
     * @param sideC the side C of the triangle.
     * @return a angle.
     */
    private double getAngle(final double sideA, final double sideB, final double sideC) {
        return Math.acos((sideB * sideB + sideC * sideC - sideA * sideA) / (2 * sideB * sideC));
    }

    /**
     * Checks a incoming sides.
     * <pre>
     *     isSideOk(1, 3, 2) = true
     *     isSideOk(3, 1, 2) = true
     *     isSideOk(1, 2, 3) = false
     *     isSideOk(2, 1, 3) = false
     * </pre>
     *
     * @param sideA the side A to check.
     * @param sideB the side B to check.
     * @param sideC the side C to check.
     * @return true if side A + side B is more than side C,
     * false otherwise.
     */
    private boolean isSideOk(final double sideA, final double sideB, final double sideC) {
        return (sideA + sideB > sideC);
    }
}
