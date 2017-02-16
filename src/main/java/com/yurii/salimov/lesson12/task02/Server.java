package com.yurii.salimov.lesson12.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public abstract class Server {

    public static int getStatus(String link) throws IOException, InterruptedException {
        link = link.replace("https://", "").replace("http://", "");
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("ping " + link);
        int status = process.waitFor();
        return status;
    }

    public static void /*String*/ getPage(String link) throws IOException {
        //StringBuilder page = new StringBuilder();
        URL url = new URL(link);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        try (InputStreamReader is = new InputStreamReader(connection.getInputStream());
             BufferedReader br = new BufferedReader(is)) {
            char[] buffer = new char[1024];
            //int size;
            while ((/*size = */br.read(buffer)) >= 0) {
                //page.append(new String(buffer, 0, size));
            }
        } finally {
            connection.disconnect();
        }
        //return page.toString();
    }
}
