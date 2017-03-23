package com.yurii.salimov.lesson04.task03_04_05;

/**
 * 4.3 Добавить в проект «монитор» функцию вывода даты создания файла на экран (см. java.io.File).
 * 4.4 Добавить в проект ф-ю мониторинга более одного файла.
 * 4.5 Написать код для мониторинга каталога. Выводить на экран предупреждение если в каталог
 * добавляется текстовый файл (*.txt).
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        String[] fileList = {"c:\\1.txt", "c:\\2.txt"};

        Monitor monitor = new Monitor(fileList, new FileEvent()); // Мониторинг файлов fileList
        //Monitor monitor = new Monitor(fileList, name -> System.out.println("File added: " + name)); // <- или так, лямбда-выражение
        monitor.start();

        /*monitor = new Monitor("c:\\3.txt", new FileEvent()); // // Мониторинг одного файлов 3.txt
        monitor.start();
        
        monitor.monitoring("c:\\", "txt", 300); // Мониторинг каталога "c:\" файлов "txt" на протяжении 300 с.
        
        monitor.monitoring("c:\\", null, 500); // Мониторинг каталога "c:\" всех файлов на протяжении 500 с.*/
    }
}
