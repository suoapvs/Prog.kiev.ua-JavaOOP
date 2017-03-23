package com.yurii.salimov.lesson05.task04_05;

import java.io.IOException;

/**
 * 5.4 Написать программу для копирования всех файлов
 * из одного каталога в другой.
 *
 * 5.5 Написать программу, которая создаст текстовый файл и запишет в него
 * список файлов (путь, имя, дата создания) из заданного каталога.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        String outDir = "c:\\dir1";
        String inDir = "c:\\dir2";

        try {
            Files.copy(outDir, inDir);
            Files.aboutFiles(inDir);
        } catch (IOException ex) {
            ex.getMessage();
        }

        System.out.println("Done!");
    }
}
