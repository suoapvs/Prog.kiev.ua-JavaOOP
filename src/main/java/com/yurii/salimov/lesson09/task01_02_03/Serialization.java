package com.yurii.salimov.lesson09.task01_02_03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Serialization {

    public static void serialize(Object obj, File file) {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file))) {
            output.writeObject(obj);
        } catch (IOException ex) {
            System.out.println("ERROR save object!");
        }
    }

    public static void serialize(Object obj, String path) {
        serialize(obj, new File(path));
    }

    public static Object deserialize(File file) {
        Object obj = null;
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            obj = input.readObject();
        } catch (IOException | ClassNotFoundException | ExceptionInInitializerError ex) {
            System.out.println("ERROR load object!");
            file.delete();
        }
        return obj;
    }

    public static Object deserialize(String path) {
        return deserialize(new File(path));
    }
}
