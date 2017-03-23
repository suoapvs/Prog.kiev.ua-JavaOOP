package com.yurii.salimov.lesson02.task03_04_06;

/**
 * 2.3  Написать класс наследник SamsungS4 с диагональю
 * экрана 5 дюймов, поддержкой Wifi и методом отправки
 * SMS, который будет дописывать к сообщению слово
 * “Hello”.
 *
 * 2.4  Модифицировать класс Phone так, чтобы он считал
 * количество звонков и сообщений отдельно для
 * каждого объекта.
 *
 * 2.6  Написать код для связи телефонов между собой. У
 * каждого телефона будет свой номер. При вызове
 * call(x) телефон должен найти собеседника по
 * номеру x из всех доступных в данный момент
 * телефонов (из всех созданных объектов типа
 * Phone) и вызвать его метод answer().
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final Nokia3310 nokia = new Nokia3310();
        nokia.setPhoneNumber("0634588952");

        final IPhone iphone = new IPhone();
        iphone.setPhoneNumber("0674522318");

        final IPhone5 iphone5 = new IPhone5();
        iphone5.setPhoneNumber("0664513782");

        final SumsungS4 samsungS4 = new SumsungS4();
        samsungS4.setPhoneNumber("0978522314");

        //--------------------------------------
        nokia.call("0664513782");
        nokia.sendSMS("0664513782", "Hello!");

        iphone.sendSMS("0978522314", "Hi!");
        iphone.sendSMS("0634588952", "Hi! What`s up?");

        iphone5.call("0354211582");
        iphone5.call("0664513782");
        iphone5.sendSMS("0634588952", "Hi! What`s up?");

        samsungS4.call("0664513782");
        samsungS4.sendSMS("0664513782", "Hello, bro!");
        samsungS4.sendSMS("0634588952", "Ha-ha-ha...");

        Phone.showList();
    }
}
