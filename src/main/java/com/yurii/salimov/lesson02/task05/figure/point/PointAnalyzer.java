package com.yurii.salimov.lesson02.task05.figure.point;

import java.util.List;

/**
 * The class implements a set of methods for analyzing points.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @see Point
 */
public final class PointAnalyzer {

    /**
     * Returns a minimum abscissa.
     *
     * @param points the point list to check.
     * @return the minimum abscissa.
     * @throws IllegalArgumentException if the incoming points is null or empty.
     */
    public double getMinAbscissa(final List<Point> points) throws IllegalArgumentException {
        if (points == null || points.isEmpty()) {
            throw new IllegalArgumentException("Incoming points list is null or empty!");
        }
        double result = points.get(0).getAbscissa();
        for (Point point : points) {
            result = getMin(point.getAbscissa(), result);
        }
        return result;
    }

    /**
     * Returns a maximum abscissa.
     *
     * @param points the point list to check.
     * @return the maximum abscissa.
     * @throws IllegalArgumentException if the incoming points is null or empty.
     */
    public double getMaxAbscissa(final List<Point> points) throws IllegalArgumentException {
        if (points == null || points.isEmpty()) {
            throw new IllegalArgumentException("Incoming points list is null or empty!");
        }
        double result = points.get(0).getAbscissa();
        for (Point point : points) {
            result = getMax(point.getAbscissa(), result);
        }
        return result;
    }

    /**
     * Returns a minimum ordinate.
     *
     * @param points the point list to check.
     * @return the minimum ordinate.
     * @throws IllegalArgumentException if the incoming points is null or empty.
     */
    public double getMinOrdinate(final List<Point> points) throws IllegalArgumentException {
        if (points == null || points.isEmpty()) {
            throw new IllegalArgumentException("Incoming points list is null or empty!");
        }
        double result = points.get(0).getOrdinate();
        for (Point point : points) {
            result = getMin(point.getOrdinate(), result);
        }
        return result;
    }

    /**
     * Returns a maximum ordinate.
     *
     * @param points the point list to check.
     * @return the maximum ordinate.
     * @throws IllegalArgumentException if the incoming points is null or empty.
     */
    public double getMaxOrdinate(final List<Point> points) throws IllegalArgumentException {
        if (points == null || points.isEmpty()) {
            throw new IllegalArgumentException("Incoming points list is null or empty!");
        }
        double result = points.get(0).getOrdinate();
        for (Point point : points) {
            result = getMax(point.getOrdinate(), result);
        }
        return result;
    }

    /**
     * Returns a minimum of two values.
     *
     * @param first  the first value to check.
     * @param second the second value to check.
     * @return the minimum value.
     */
    private double getMin(final double first, final double second) {
        return (first < second) ? first : second;
    }

    /**
     * Returns a maximum of two values.
     *
     * @param first  the first value to check.
     * @param second the second value to check.
     * @return the maximum value.
     */
    private double getMax(final double first, final double second) {
        return (first > second) ? first : second;
    }
}
