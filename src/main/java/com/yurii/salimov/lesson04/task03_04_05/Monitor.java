package com.yurii.salimov.lesson04.task03_04_05;

import java.io.File;
import java.util.Arrays;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Monitor {

    private final String[] name;
    private final IFileEvent event;

    public Monitor(final String name, final IFileEvent event) {
        this(new String[]{name}, event);
    }

    public Monitor(final String[] name, final IFileEvent event) {
        this.name = Arrays.copyOf(name, name.length);
        this.event = event;
    }

    public void start() {
        final File[] file = new File[this.name.length];
        while (true) {
            int counter = 0;
            for (int i = 0; i < file.length; i++) {
                if (name[i] != null) {
                    file[i] = new File(name[i]);
                    if (file[i].exists() && file[i].isFile()) {
                        if (event != null) {
                            event.onFileAdded(file[i]);
                        }
                        name[i] = null;
                        counter++;
                    }
                }
            }
            if (counter == file.length) {
                break;
            }
            sleep();
        }
    }


    public void monitoring(final String nameDir, final String type, int time) {
        System.out.println("Monitoring of \"" + nameDir + "\" directory:");
        final File dir = new File(nameDir);
        File[] oldList = dir.listFiles();
        File[] newList;

        while (true) {
            newList = dir.listFiles();
            if (!Arrays.equals(oldList, newList)) {
                String operation;
                File[] list1;
                File[] list2;
                if (newList.length > oldList.length) {
                    operation = "New file: ";
                    list1 = newList;
                    list2 = oldList;
                } else if (oldList.length > newList.length) {
                    operation = "Delete file: ";
                    list1 = oldList;
                    list2 = newList;
                } else {
                    operation = "Rename file: ";
                    list1 = newList;
                    list2 = oldList;
                }

                boolean check;
                for (File f2 : list1) {
                    check = true;
                    for (File f1 : list2) {
                        if (f2.equals(f1)) {
                            check = false;
                            break;
                        }
                    }
                    if (check && infoFile(f2, type)) {
                        System.out.println(operation + f2.getName());
                    }
                }
                oldList = dir.listFiles();
            }
            sleep();
            time--;
            if (time == 0) {
                System.out.println("Monitoring is stopped.");
                break;
            }
        }
    }

    private boolean infoFile(File file, String type) {
        String typeFile = file.getName().substring(
                file.getName().lastIndexOf('.') + 1,
                file.getName().length()
        );
        return typeFile.equals(type) || type == null;
    }

    public String[] getName() {
        return name;
    }

    private static void sleep() {
        System.out.println("Waiting...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
