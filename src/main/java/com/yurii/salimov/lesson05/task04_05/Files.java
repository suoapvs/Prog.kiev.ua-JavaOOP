package com.yurii.salimov.lesson05.task04_05;

import java.io.*;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Files {

    public static void copy(String outDirPath, String inDirPath) throws IOException {
        File outDir = new File(outDirPath);
        File inDir = new File(inDirPath);
        if (!outDir.exists()) {
            System.out.println("The specified directory is not available!");
            return;
        }
        if (!inDir.exists()) {
            inDir.mkdirs();
        }
        for (File file : outDir.listFiles()) {
            if (file.isFile()) {
                copyFile(file.getPath(), inDirPath + "\\" + file.getName());
            }
        }
    }

    public static void copyFile(String file, String file2) throws IOException {
        try (final BufferedReader br = new BufferedReader(new FileReader(file));
             final BufferedWriter bw = new BufferedWriter(new FileWriter(file2))) {
            int buf;
            while ((buf = br.read()) != -1) {
                bw.write(buf);
            }
        }
    }

    public static void aboutFiles(String dirPath) throws IOException {
        File dir = new File(dirPath);
        if (!dir.exists()) {
            System.out.println("The specified directory is not available!");
            return;
        }
        final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy  hh:mm:ss");
        try (final BufferedWriter bw = new BufferedWriter(new FileWriter(dirPath + "\\" + "info.txt"))) {
            for (File file : dir.listFiles()) {
                if (file.isFile()) {
                    bw.write(file.getName() + ", date: " + dateFormat.format(new Date(file.lastModified())) + "\r\n");
                }
            }
        }
    }
}
