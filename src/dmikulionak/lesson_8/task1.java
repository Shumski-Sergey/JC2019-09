package dmikulionak.lesson_8;
//Создать список оценок учеников с помощью ArrayList, заполнить
//случайными оценками. Удалить неудовлетворительные оценки из списка.

import java.util.ArrayList;
import java.util.Iterator;


public class task1 {
    public static void main (String[] args) {
        int neg = 5;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++) {
            int a = (int)(Math.random() * 11);
            list.add(i,a);
        }
        System.out.println(list);
        for(Iterator<Integer> it = list.iterator(); it.hasNext();)
            if(it.next()<= neg)
                it.remove();
        System.out.println(list);
    }
    }
