package yKuzMinskij.Thread;

import java.util.ArrayList;

/**
 * Написать клиент для работы библиотеки. В библиотеке доступны к чтению несколько книг.
 * Некоторые из них можна выдавать на руки некоторые только в читальный зал.
 * Посетители могут брать одновременно по несколько книг на руки и в читальный зал.
 */
public class TaskA1 {
    public static void main (String[] args) {
        ArrayList<String> polka = new ArrayList<>();
        polka.add("Преступление и наказание");
        polka.add("Идиот");
        polka.add("Обломов");
        polka.add("Анна Каренина");
        polka.add("Собачье сердце");

        Client p = new Client("Петя", polka);
        Client v = new Client("Вася", polka);
        p.start();
        v.start();

    }
}

class Client extends Thread {
    private String name;
    private ArrayList<String> polka;
    private ArrayList<String> pocket = new ArrayList<>();
    private Monetka monetka = new Monetka();

    Client (String name, ArrayList<String> polka) {
        this.name = name;
        this.polka = polka;
    }

    synchronized public void run () {
        while (this.polka.size() != 0) {
            setBook(this.polka);
            try {
                sleep(1000);
                notify();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            getBook(this.polka);
            try {
                sleep(1000);
                notify();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized private ArrayList setBook (ArrayList<String> polka) {
        for (int i = 0; i < polka.size(); i++) {
            if (monetka.Random()) {
                this.pocket.add(this.polka.get(i));
                System.out.println(name + " Беру " + polka.get(i));
                polka.remove(i);
                System.out.println(name + " polka = " + polka);
                System.out.println(name + " pocket = " + pocket);
            }
            return polka;
        }
        return polka;
    }

    synchronized private ArrayList<String> getBook (ArrayList<String> polka) {
        for (int i = 0; i < pocket.size(); i++) {
            if (monetka.Random()) {
                this.polka.add(this.pocket.get(i));
                System.out.println(name + " Возвращаю " + pocket.get(i));
                pocket.remove(i);
                System.out.println(name + " polka = " + polka);
                System.out.println(name + " pocket = " + pocket);
            }
        }
        return polka;
    }
}

class Monetka {
    public boolean Random () {
        return Math.random() < 0.5;
    }
}
