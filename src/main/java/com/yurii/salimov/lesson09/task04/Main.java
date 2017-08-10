package com.yurii.salimov.lesson09.task04;

import java.io.File;

/**
 * 9.4 * Написать проект «Виртуальная файловая система». Каждый
 * каталог и файл представлен одним объектом (Directory/File);
 * должны поддерживатся связи между объектами; вся файловая
 * структура хранится в одном файле. Обеспечить базовые ф-и
 * для работы с ФС: добавление и удаление файлов и каталогов.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final Serialization serialization = new Serialization();
        final Files fileSystem = new Files("c:");
        final File file = new File("List.txt");

        if (!file.exists() || !file.isFile() || file.length() == 0) {
            final Files file1 = new Files("file1", true);
            final Files file2 = new Files("file2", true);

            final Files dir1 = new Files("dir1", false);
            final Files dir2 = new Files("dir2", false);

            dir1.add(file1);
            dir2.add(file1);
            dir2.add(dir1);
            dir2.add(file2);

            dir1.add(file1);
            dir2.add(dir1);
            dir1.add(file1);
            file1.add(dir1);

            fileSystem.add(dir2);
            fileSystem.print();

            serialization.serialize(fileSystem, file);
        } else {
            final Files files = (Files) serialization.deserialize(file);
            files.print();
        }
    }
}
