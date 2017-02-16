package com.yurii.salimov.lesson04.task01;

import java.util.Comparator;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class HumanComparator implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        final Human human1 = (Human) obj1;
        final Human human2 = (Human) obj2;
        return human1.getAge() - human2.getAge();

        /*if (human1.getAge() < human2.getAge()) {
         return -1;
         } else if (human1.getAge() > human2.getAge()) {
         return 1;
         } else {
         return 0;
         }*/
    }
}
