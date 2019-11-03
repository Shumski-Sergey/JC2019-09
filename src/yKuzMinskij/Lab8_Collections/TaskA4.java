package yKuzMinskij.Lab8_Collections;

import java.util.*;

/**
 * Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
 * Напишите еще один метод, который выбирает из заполненного списка элемент наугад 10000 раз.
 * Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.
 */

public class TaskA4 {
    public static void main (String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.addAll(generator(list1));
        list2.addAll(generator(list2));
        long start = System.currentTimeMillis();
        getter(list1);
        long finish  = System.currentTimeMillis();
        System.out.println("Start time : " + start + "\n Finish time : " + finish +
                "\nTime : " + (finish-start) + " msc");
        start = System.currentTimeMillis();
        getter(list2);
        finish = System.currentTimeMillis();
        System.out.println("Start time : " + start + "\n Finish time : " + finish +
                "\nTime : " + (finish-start) + " msc");
    }

    public static List<Integer> generator (List<Integer> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add((int) (Math.random() * 100));
        }
        return list;
    }
    private static void getter (List<Integer> list){
        Random random = new Random();
        for (int i = 0; i<10000; i++){
        list.get(random.nextInt(list.size()));
        }
    }
}