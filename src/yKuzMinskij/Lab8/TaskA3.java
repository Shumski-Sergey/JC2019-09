package yKuzMinskij.Lab8;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Создать список оценок учеников с помощью ArryList, заполнить случайными
 * оценками. Найти самую высокую оценку с использованием итератора.
 */

public class TaskA3<maxMark> {
    public static void main (String[] args) {
        outA(selector(generator()));
    }
    private static ArrayList generator (){
        ArrayList <Integer>list = new ArrayList();
        for (int i=0; i<50; i++) {
            list.add((int)(Math.random() * 100));
        }
        return list;
    }
    private static int selector (ArrayList<Integer> list){
        Iterator iterator = list.iterator();
        int maxMark = 0;
        while (iterator.hasNext()){
            if ((int)iterator.next()>maxMark){maxMark= (int) iterator.next();}
        }
        return maxMark;
    }
    private static void outA (int maxMark){
        System.out.println("Максимальная оценка : " + maxMark);
        }
    }
