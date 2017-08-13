package com.yurii.salimov.lesson11.task02;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Parser {

    private final URL url;
    private String html;
    private List<URL> urls;

    public Parser(final URL url) {
        this.url = url;
    }

    public Parser(final String url) throws MalformedURLException {
        this(new URL(url));
    }

    public String getHtml() {
        if (this.html == null) {
            this.html = loadPage(this.url);
        }
        return this.html;
    }

    public List<URL> getUrls() {
        if (this.urls == null || this.urls.isEmpty()) {
            this.urls = parseHtml(getHtml());
        }
        return this.urls;
    }

    private static String loadPage(final URL url) {
        final StringBuilder page = new StringBuilder();
        try {
            final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            try (InputStream stream = connection.getInputStream()) {
                byte[] buffer = new byte[5000];
                int size;
                while ((size = stream.read(buffer)) >= 0) {
                    page.append(new String(buffer, 0, size));
                }
            } finally {
                connection.disconnect();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return page.toString();
    }

    private List<URL> parseHtml(final String html) {
        final List<URL> list = new ArrayList<>();
        int positionStart;
        int positionEnd = 0;
        do {
            positionStart = html.indexOf("href=\"", positionEnd);
            if (positionStart >= 0) {
                positionStart += "href=\"".length();
                positionEnd = html.indexOf("\"", positionStart);
                final String urlStr = html.substring(positionStart, positionEnd);
                try {
                    list.add(new URL(this.url + urlStr));
                } catch (MalformedURLException ex) {
                    ex.printStackTrace();
                }
            }
        } while (positionStart >= 0);
        return list;
    }
}
