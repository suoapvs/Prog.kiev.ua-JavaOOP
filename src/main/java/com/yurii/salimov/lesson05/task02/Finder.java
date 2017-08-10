package com.yurii.salimov.lesson05.task02;

import java.io.File;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Finder {

    private final String dirName;
    private final Criterion criterion;

    public Finder(final String dirName, final Criterion criterion) {
        this.dirName = dirName;
        this.criterion = criterion;
    }

    public void findAndPrint() {
        recursionFindAndPrint(this.dirName);
    }

    private void recursionFindAndPrint(final String dirName) {
        final File[] fileList = new File(dirName).listFiles();
        if (fileList != null) {
            for (File file : fileList) {
                if (file != null) {
                    if (this.criterion.check(file)) {
                        println(file);
                    }
                    if (file.isDirectory()) {
                        recursionFindAndPrint(file.getPath());
                    }
                }
            }
        }
    }

    private static void println(final File file) {
        System.out.println((file.isFile() ? "File: " : "Directory: ") + file.getPath());
    }
}
