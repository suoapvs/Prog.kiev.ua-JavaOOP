package com.yurii.salimov.lesson03.task06;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Url {

    private String url;
    private String[] parametrs;
    private String[] value;

    public Url(String url) {
        this.url = url;
    }

    public void parsing() {
        try {
            String url = this.url + '&';
            int n = 0;
            for (char c : url.toCharArray()) {
                if (c == '&') {
                    n++;
                }
            }
            this.parametrs = new String[n];
            this.value = new String[n];
            for (int i = 0; i < n; i++) {
                this.parametrs[i] = url.substring(0, url.indexOf('='));
                this.value[i] = url.substring(url.indexOf('=') + 1, url.indexOf('&'));
                url = url.substring(url.indexOf('&') + 1, url.length());
                System.out.println(this.parametrs[i] + " : " + this.value[i]);
            }
        } catch (Exception ex) {
            System.out.println("Error in URL!");
        }
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParametrs(int i) {
        return this.parametrs[i];
    }

    public void setParametrs(String text, int i) {
        parametrs[i] = text;
    }

    public String getValue(int i) {
        return this.value[i];
    }

    public void setValue(String text, int i) {
        this.value[i] = text;
    }
}
