package akhrapskaya.Collection;

/*4.Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
Напишите еще один метод, который выбирает из заполненного списка элемент наугад 10000 раз.
Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие. */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task4 {
    private final static int ITEM_NUMBER = 1000000;
    private final static int MAX_VALUE = 500;
    private final static int MIN_VALUE = -500;
    private final static int N = 10000;
    private final static int NANO_MC = 1000000;

    public static void main(String[] args){
        ArrayList<Integer> listA = new ArrayList<>();
        setList(listA);
        LinkedList<Integer> listL = new LinkedList<>();
        setList(listL);
        System.out.println("ArrayList:");
        getEl(listA);
        System.out.println("LinkedList:" );
        getEl(listL);
    }
    private static void setList(List<Integer> list){
        Random rand = new Random();
        for (int i = 0; i < ITEM_NUMBER; i++){
            list.add(rand.nextInt(MAX_VALUE-MIN_VALUE) + MIN_VALUE);
        }
    }
    private static void getEl(List<Integer> list){
        Random rand = new Random();
        long start = System.nanoTime();
        for (int i = 0; i < N; i++){
           Integer k = list.get(rand.nextInt(ITEM_NUMBER));
        }
        long time = System.nanoTime() - start;
        System.out.println(time/NANO_MC + " мс");
    }
}
