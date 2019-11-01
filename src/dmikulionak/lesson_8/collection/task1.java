package dmikulionak.lesson_8.collection;
//Создать список оценок учеников с помощью ArrayList, заполнить
//случайными оценками. Удалить неудовлетворительные оценки из списка.

import java.util.ArrayList;

public class task1 {
    public static void main (String[] args) {
        collection list = new collection();
        ArrayList<Integer> listArr = new ArrayList<>();
        list.randomList(listArr,10,100);
        System.out.println(listArr);
        list.iterator(listArr,5);
        System.out.println(listArr);
    }
    }
