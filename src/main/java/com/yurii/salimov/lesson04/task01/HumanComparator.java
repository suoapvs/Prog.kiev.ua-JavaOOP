package com.yurii.salimov.lesson04.task01;

import java.util.Comparator;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class HumanComparator implements Comparator<Human> {

    @Override
    public int compare(final Human first, final Human second) {
        return first.getAge() - second.getAge();

        /*if (first.getAge() < second.getAge()) {
         return -1;
         } else if (first.getAge() > second.getAge()) {
         return 1;
         } else {
         return 0;
         }*/
    }
}
