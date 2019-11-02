package dmikulionak.lesson_8.collection;

import java.util.ArrayList;

//Создать список оценок учеников с помощью ArryList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.
public class task3 {
    public static void main(String[] args) {
        collection list = new collection();
        ArrayList<Integer> listArr = new ArrayList<>();
        list.randomList(listArr, 11, 100);
        System.out.println(listArr);
        System.out.println(list.iteratorMax(listArr));
    }
}
