package com.yurii.salimov.lesson10.task05;

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
public final class Serialization {

    public void serialize(final Object obj, final File file) throws IOException {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file))) {
            output.writeObject(obj);
        }
    }

    public void serialize(final Object obj, final String path) throws IOException {
        final File file = new File(path);
        serialize(obj, file);
    }

    public Object deserialize(final File file) throws IOException, ClassNotFoundException {
        try (final ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            return input.readObject();
        }
    }

    public Object deserialize(final String path) throws IOException, ClassNotFoundException {
        final File file = new File(path);
        return deserialize(file);
    }
}
