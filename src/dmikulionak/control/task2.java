package dmikulionak.control;

import dmikulionak.lesson_8.collection.collection;

import java.util.Scanner;

/**
 * Created by user on 20.11.2019.
 */
public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 1 до 12 ");
        int month = in.nextInt();
        collection cl = new collection();
        cl.month(month);
    }
}

