package com.yurii.salimov.lesson04.task02;

import java.util.Comparator;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class FigureComparator<T extends Figure> implements Comparator<T> {

    @Override
    public int compare(final T first, final T second) {
        if ((first != null) && (second != null)) {
            return Double.compare(first.getArea(), second.getArea());
        }
        return 0;
    }
}
