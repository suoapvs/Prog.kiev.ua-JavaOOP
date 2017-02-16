package com.yurii.salimov.lesson04.task02;

import java.util.Comparator;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class FigureComparator<T extends Figure> implements Comparator<T> {

    @Override
    public int compare(T figure1, T figure2) {
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
