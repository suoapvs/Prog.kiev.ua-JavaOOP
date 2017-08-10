package com.yurii.salimov.lesson09.task04;

import java.io.*;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Serialization {

    public void serialize(final Object obj, final File file) {
        try (FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream output = new ObjectOutputStream(fos)) {
            output.writeObject(obj);
        } catch (IOException ex) {
            System.out.println("ERROR save object!");
        }
    }

    public void serialize(final Object obj, final String path) {
        serialize(obj, new File(path));
    }

    public Object deserialize(final File file) {
        Object obj = null;
        try (FileInputStream fis = new FileInputStream(file);
                ObjectInputStream input = new ObjectInputStream(fis)) {
            obj = input.readObject();
        } catch (IOException | ClassNotFoundException | ExceptionInInitializerError ex) {
            System.out.println("ERROR load object!");
            file.delete();
        }
        return obj;
    }

    public Object deserialize(final String path) {
        return deserialize(new File(path));
    }
}
