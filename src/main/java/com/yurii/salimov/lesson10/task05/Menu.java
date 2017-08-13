package com.yurii.salimov.lesson10.task05;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Menu {

    private Database<String, Human> database;
    private String databaseName;
    private final Scanner scanner = new Scanner(System.in);

    public Menu(final Database<String, Human> base) {
        this.database = base;
        this.databaseName = "dateBase.txt";
    }

    public Menu(final String databaseName) {
        try {
            this.databaseName = databaseName;
            File dataFile = new File(databaseName);
            final Serialization serialization = new Serialization();
            this.database = (Database<String, Human>) serialization.deserialize(dataFile);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Database is absent!");
            this.database = new Database();
        }
    }

    public void show() {
        int menuValue;
        while (true) {
            System.out.println("------------");
            System.out.println("     Menu");
            System.out.println("1. Add information about a person.");
            System.out.println("2. Delete data about a person by phone number");
            System.out.println("3. Search data about a person by phone number.");
            System.out.println("4. Show database.");
            System.out.println("5. Exit.");
            System.out.println("------------");
            try {
                String value = this.scanner.next();
                menuValue = Integer.parseInt(value);
            } catch (Exception ex) {
                menuValue = -1;
            }
            option(menuValue);
        }
    }

    private void option(int index) {
        switch (index) {
            case 1:
                add();
                break;
            case 2:
                delete();
                break;
            case 3:
                find();
                break;
            case 4:
                System.out.println(this.database);
                break;
            case 5:
                saveAndExit();
                break;
            default:
                System.out.println("Incorrect data input!");
                break;
        }
    }

    private void add() {
        final Human human = Human.create(this.scanner);
        this.database.add(human.getPhone(), human);
    }

    private void delete() {
        final String phone = inPhoneNumber();
        if (phone == null || phone.equals("")) {
            System.out.println("Incorrect data input!");
        } else {
            this.database.delete(phone);
        }
    }

    private void find() {
        final String phone = inPhoneNumber();
        if (phone == null || phone.equals("")) {
            System.out.println("Incorrect data input!");
        } else {
            final Human human = this.database.get(phone);
            System.out.println(human);
        }
    }

    private void saveAndExit() {
        try {
            final Serialization serialization = new Serialization();
            serialization.serialize(this.database, this.databaseName);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            System.exit(0);
        }
    }

    private String inPhoneNumber() {
        System.out.println("Enter phone: ");
        return this.scanner.next();
    }

    public void setDatabase(final Database<String, Human> database) {
        this.database = database;
    }

    public Database<String, Human> getDatabase() {
        return this.database;
    }

    public void setDatabaseName(final String databaseName) {
        this.databaseName = databaseName;
    }

    public String getDatabaseName() {
        return this.databaseName;
    }
}
