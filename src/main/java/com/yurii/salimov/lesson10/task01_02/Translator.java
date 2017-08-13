package com.yurii.salimov.lesson10.task01_02;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Translator {

    private final Scanner scanner = new Scanner(System.in);
    private String nameBase;
    private Map<String, String> base;

    public Translator() {
        this("base.txt", new HashMap<>());
    }

    public Translator(String fileName, HashMap<String, String> base) {
        this.nameBase = fileName;
        this.base = base;
    }

    public void loadBase() {
        loadBase(this.nameBase);
    }

    public void loadBase(String fileBase) {
        final File file = new File(fileBase);
        if (file.exists() && file.isFile() && file.length() > 0) {
            try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
                this.base = (Map<String, String>) input.readObject();
            } catch (ClassNotFoundException | IOException ex) {
                ex.printStackTrace();
            }
        } else {
            System.out.println("Base is absent!");
            this.base = new HashMap<>();
        }
    }

    public void addWords() {
        while (true) {
            addWord();
            System.out.println("Continue? Yes/No");
            if (!this.scanner.nextLine().equalsIgnoreCase("y")) {
                break;
            }
        }
    }

    public void addWord() {
        System.out.println("Enter the word and translation through the \"-\"!");
        final String[] words = this.scanner.nextLine().trim().split("-");
        if (words.length == 2) {
            this.base.put(words[0].replace(" ", ""), words[1].replace(" ", ""));
            save();
        } else {
            System.out.println("Invalid entry!");
        }
    }

    public String translate(String text) {
        if (this.base != null) {
            return transl(text);
        } else {
            System.out.println("Base is absent!");
            return null;
        }
    }

    private String transl(String text) {
        final String[] words = text.trim().split(" ");
        final StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (this.base.containsKey(word)) {
                sb.append(this.base.get(word)).append(" ");
            } else {
                sb.append("\"").append(word).append("\" - an unknown word.");
            }
        }
        return sb.toString();
    }

    public void save() {
        try (final FileOutputStream fileOutputStream = new FileOutputStream(this.nameBase);
             final ObjectOutputStream output = new ObjectOutputStream(fileOutputStream)) {
            output.writeObject(this.base);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getNameBase() {
        return this.nameBase;
    }

    public Map<String, String> getBase() {
        return this.base;
    }
}
