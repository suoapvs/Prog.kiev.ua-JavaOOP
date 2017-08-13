package com.yurii.salimov.lesson12.task01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Files {

    public static void write(final String fileName, final Object obj) {
        try (FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter output = new BufferedWriter(fileWriter)) {
            output.write(obj.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String read(final String fileName) throws FileNotFoundException {
        final StringBuilder sb = new StringBuilder();
        try (FileReader fileReader = new FileReader(fileName);
                BufferedReader input = new BufferedReader(fileReader)) {
            String str;
            while ((str = input.readLine()) != null) {
                sb.append(str).append("\r\n");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return sb.toString();
    }
}
