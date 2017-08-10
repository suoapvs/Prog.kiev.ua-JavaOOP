package com.yurii.salimov.lesson05.task01;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 5.1 Модифицировать проект FindFiles так, чтобы программа искала в каталоге.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final List<String> list = new ArrayList<>();
        final String[] ends = {"txt", "docx", "rar", "xlsx"};
        findFiles("c:\\", ends, list);
        println(list);
    }

    private static void findFiles(
            final String srcPath,
            final String[] ends,
            final List<String> list
    ) {
        final File dir = new File(srcPath);
        final File[] files = dir.listFiles(new FileFilter(ends));
        for (File f : files) {
            list.add(srcPath + f.getName());
        }
    }

    private static void println(final Collection<String> collection) {
        for (String value : collection) {
            System.out.println(value);
        }
    }
}
