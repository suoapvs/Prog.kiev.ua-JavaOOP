package com.yurii.salimov.lesson11.task02;

import java.net.URL;

/**
 * 11.2 Скачать все HTML файлы, доступные по ссылкам в отдельный каталог.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String args[]){
        try {
            final URL url = new URL("http://www.ecoteh.com.ua");
            final String dirPath = "c:/eco";
            new LoaderHTML(url, dirPath).saveAllPage();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
