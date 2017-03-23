package com.yurii.salimov.lesson10.task06;

/**
 * 10.6 Реализовать методы HashMap: keySet, entrySet, containsValue etc.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        final MyMap<Integer, String> map = createMap();
        for (int i = 1; i <= 3; i++) {
            System.out.print(map.get(i) + " ");
        }
        System.out.println();
    }

    private static MyMap<Integer, String> createMap() {
        final MyMap<Integer, String> map = new MyHashMap<>();
        map.put(1, "q");
        map.put(2, "w");
        map.put(3, "e");
        return map;
    }
}
