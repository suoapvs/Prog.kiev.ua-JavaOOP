package com.yurii.salimov.lesson11.task02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class LoaderHTML {

    private final URL url;
    private final String dirPath;

    public LoaderHTML(final URL url, final String dirPath) {
        this.url = url;
        this.dirPath = dirPath;
    }

    public LoaderHTML(final String url, final String dirPath) throws MalformedURLException {
        this(new URL(url), dirPath);
    }

    public void savePage() {
        final String path = createDirectory(this.url, this.dirPath) + "/" + namePage(this.url) + ".html";
        try (FileWriter writer = new FileWriter(path)) {
            final String page = new Parser(this.url).getHtml();
            writer.write(page);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveAllPage() throws IOException {
        saveAll(this.url, new ArrayList<>(), this.dirPath);
    }

    private String createDirectory() {
        final String path = this.dirPath + "/" + getName();
        final File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return path;
    }

    private String getName() {
        String name = this.url.toString();
        int start = name.indexOf("//");
        start = (start == -1) ? 0 : name.indexOf("//") + 2;
        int end = name.indexOf("/", start);
        end = (end == -1) ? name.length() : end;
        return name.substring(start, end);
    }

    private static void saveAll(URL url, List<URL> listUrl, String mainDir) throws IOException {
        final List<URL> newListUrl = new Parser(url).getUrls();
        for (URL newUrl : newListUrl) {
            if (!listUrl.contains(newUrl) && getName(newUrl).equals(getName(url))) {
                synchronized (listUrl) {
                    listUrl.add(newUrl);
                }
                final Thread thread = new Thread() {
                    @Override
                    public void run() {
                        try {
                            savePage(newUrl, mainDir);
                            saveAll(newUrl, listUrl, mainDir);
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                };
                thread.start();
            }
        }
    }

    private static void savePage(URL url, String mainDir) {
        final String path = createDirectory(url, mainDir) + "/" + namePage(url) + ".html";
        try (final FileWriter writer = new FileWriter(path)) {
            writer.write(new Parser(url).getHtml());
            writer.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static String createDirectory(URL url, String mainDir) {
        final String path = mainDir + "/" + getName(url);
        final File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return path;
    }

    private static String getName(URL url) {
        final String name = url.toString();
        int start = name.indexOf("//");
        start = (start == -1) ? 0 : start + 2;
        int end = name.indexOf("/", start);
        end = (end == -1) ? name.length() : end;
        return name.substring(start, end);
    }

    private static String namePage(URL url) {
        final String name = url.toString();
        final int start = name.indexOf("//") + 2;
        return name.substring(start).replace("?", "_").replace("/", "_");
    }
}
