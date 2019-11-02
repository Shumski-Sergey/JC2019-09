package yKuzMinskij.Lab8_Collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Создать список оценок учеников с помощью ArryList, заполнить случайными
 * оценками. Найти самую высокую оценку с использованием итератора.
 */

public class TaskA3 {
    public static void main (String[] args) {
        outA(selector(generator()));
    }

    private static ArrayList<Integer> generator () {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add((int) (Math.random() * 100));
        }
        return list;
    }

    private static int selector (ArrayList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        int maxMark = 0;
        while (iterator.hasNext()) {
            if (iterator.next() > maxMark) {
                maxMark = iterator.next();
            }
        }
        return maxMark;
    }

    private static void outA (int maxMark) {
        System.out.println("Максимальная оценка : " + maxMark);
    }
}
