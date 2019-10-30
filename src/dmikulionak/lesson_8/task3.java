package dmikulionak.lesson_8;

import java.util.ArrayList;
import java.util.Iterator;

//Создать список оценок учеников с помощью ArryList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.
public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * 11);
            list.add(i, a);
        }
        System.out.println(list);
        int max = 0;
        Iterator<Integer> maxN = list.iterator();
        while (maxN.hasNext()) {
            int m = maxN.next();
            if (m > max)
                max = m;
        }
            System.out.println(max);
        }
    }
