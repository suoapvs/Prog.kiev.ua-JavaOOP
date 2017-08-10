package com.yurii.salimov.lesson05.task04_05;

import java.io.*;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public final class Copywriter {

    public void copy(final String fromDirPath, final String toDirPath) throws IOException {
        final File fromDir = new File(fromDirPath);
        final File toDir = new File(toDirPath);
        if (!fromDir.exists()) {
            System.out.println("The specified directory is not available!");
        } else {
            if (!toDir.exists()) {
                toDir.mkdirs();
            }
            for (File file : fromDir.listFiles()) {
                if (file.isFile()) {
                    copyFile(file.getPath(), toDirPath + "\\" + file.getName());
                }
            }
        }
    }

    public void copyFile(final String from, final String to) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(from));
                BufferedWriter bw = new BufferedWriter(new FileWriter(to))) {
            int buf;
            while ((buf = br.read()) != -1) {
                bw.write(buf);
            }
        }
    }

    public void aboutFiles(final String dirPath) throws IOException {
        final File dir = new File(dirPath);
        if (!dir.exists()) {
            System.out.println("The specified directory is not available!");
        } else {
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
}
