package com.yurii.salimov.lesson09.task04;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Files implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private boolean isFile;
    private List<Files> list = new ArrayList<>();
    private Files fileSystem;

    public Files(final String name) {
        this.name = name;
    }

    public Files(final String name, final boolean isFile) {
        this(name);
        this.isFile = isFile;
    }

    public void add(final Files file) {
        if (!this.isFile) {
            if (!find(file)) {
                file.fileSystem = this;
                this.list.add(file);
                System.out.println("\"" + file + "\" has been added to \"" + this + "\"");
            } else {
                System.out.println("\"" + file + "\" is already added to \"" + file.fileSystem + "\"");
            }
        } else {
            System.out.println("Can't add \"" + file + "\" into \"" + this + "\"!");
        }
    }

    public void remove() {
        if (this.fileSystem != null) {
            this.fileSystem.list.remove(this);
            System.out.println("Deleting completed.");
            this.fileSystem = null;
        } else {
            System.out.println(this + " can't be removed.");
        }
    }

    public String getPath() {
        String path = "\\" + this;
        if (this.fileSystem != null) {
            path = this.fileSystem.getPath() + path;
        }
        return path;
    }

    public boolean find(Files file) {
        if (this.list.contains(file)) {
            return true;
        } else {
            for (Files files : this.list) {
                if (files.find(file)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Files other = (Files) obj;
        return (this.getPath().equals(other.getPath()));
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getPath()) + (this.isFile ? 1 : 0);
    }

    public void print() {
        for (Files file : this.list) {
            System.out.println(file.getPath());
            file.print();
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
