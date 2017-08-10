package com.yurii.salimov.lesson08.task04;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Monitor {

    private final String path;
    private final int timeout;
    private final IFileEvents events;
    private final List<String> prev = new ArrayList<>();
    private final List<String> curr = new ArrayList<>();
    private final List<String> dateList = new ArrayList<>();

    public Monitor(final String path, final int timeout, final IFileEvents events) {
        this.path = path;
        this.timeout = timeout;
        this.events = events;
    }

    public void start() {
        checkDirectory(this.path);
        while (true) {
            createArray(this.prev);
            createArray(this.curr);
            compareArrays(this.prev, this.curr);
            this.prev.clear();
            this.prev.addAll(curr);
            System.out.println("Waiting...");
            try {
                Thread.sleep(this.timeout);
            } catch (InterruptedException ex) {
                return;
            }
        }
    }

    public int getTimeout() {
        return this.timeout;
    }

    public IFileEvents getEvents() {
        return this.events;
    }

    public List getDateList() {
        return this.dateList;
    }

    private void compareArrays(final List<String> list1, final List<String> list2) {
        list1.stream()
                .filter(path -> !list2.contains(path))
                .forEach(this::doFileDeleted);
        list2.stream()
                .filter(path -> !list1.contains(path))
                .forEach(this::doFileAdded);
    }

    private void doFileAdded(final String path) {
        if (this.events != null) {
            this.events.onFileAdded(path);
        }
    }

    private void doFileDeleted(final String path) {
        if (this.events != null) {
            this.events.onFileDeleted(path);
        }
    }

    private void createArray(final List<String> output) {
        try {
            output.clear();
            File[] list = new File(this.path).listFiles();
            String info;
            for (File file : list) {
                info = file.getCanonicalPath() + ", date: " + new Date(file.lastModified());
                output.add(info);
                this.dateList.add(info);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void checkDirectory(final String path) {
        File directory = new File(path);
        if (!directory.exists() || !directory.isDirectory()) {
            directory.mkdirs();
        }
    }
}
