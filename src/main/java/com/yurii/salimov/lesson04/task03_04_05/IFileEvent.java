package com.yurii.salimov.lesson04.task03_04_05;

import java.io.File;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public interface IFileEvent {

    void onFileAdded(File file);
}
