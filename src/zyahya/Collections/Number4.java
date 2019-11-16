package zyahya.Collections;

//Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. Напишите еще один метод, который выбирает из заполненного списка элемент наугад 10000 раз.
// Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.

import java.util.ArrayList;
import java.util.LinkedList;

public class Number4 {
    private static final int Add = 1000000;
    private static final int Pick = 10000;

    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();


        for (int i = 0; i < Add; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < Pick; i++) {
            arrayList.get((int) (Math.random() * (Add - 1)));
        }

        System.out.println(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < Pick; i++) {
            linkedList.get((int) (Math.random() * (Add - 1)));
        }

        System.out.println(System.currentTimeMillis() - startTime);
    }
}
