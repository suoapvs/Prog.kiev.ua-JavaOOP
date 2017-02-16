package com.yurii.salimov.lesson08.task04;
/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface IFileEvents {

    void onFileAdded(String path);

    void onFileDeleted(String path);
}
