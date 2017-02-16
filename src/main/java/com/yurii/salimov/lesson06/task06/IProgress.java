package com.yurii.salimov.lesson06.task06;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface IProgress {

    void update(double percent);

    int getProgress();
}
