package com.yurii.salimov.lesson04.task02;

import java.util.Comparator;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class FigureComparator<T extends Figure> implements Comparator<T> {

    @Override
    public int compare(final T figure1, final T figure2) {
        if (figure1 != null && figure2 != null) {
            if (figure1.getArea() < figure2.getArea()) {
                return -1;
            }
            if (figure1.getArea() > figure2.getArea()) {
                return 1;
            }
        }
        return 0;
    }
}
