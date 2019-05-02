package com.yurii.salimov.lesson03.task06;

/**
 * 3.6 Написать метод разбора списка параметров в формате URL:
 * para1=value1&param2=value2&param3=value3.
 * В случае ошибки в формате бросать исключение.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        new Url("para1=value1&param2=value2&param3=value3").parse();
        new Url("q=ee4gv&dqw=qqw&para=val66&pard=rftf&parq=va72&pd=value3").parse();
        new Url("p&ara1=value1&param2=value").parse(); // incorrect URL
    }
}
