package akhrapskaya.Collection;

/* 1. Создать список оценок учеников с помощью ArrayList, заполнить
случайными оценками. Удалить неудовлетворительные оценки из списка.*/

import akhrapskaya.Utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;

class Task1 {
    private static final int UPPER_BOUND = 11;
    private static final int LOWER_BOUND = 0;
    private static final int MIN_GOOD_MARK = 4;
    private static final int MAX_MARKS_NUMBERS = 100;

    public static void  main(String[] args){
        int itemNumbers = Utils.putInInt("Введите количество оценок.",  MAX_MARKS_NUMBERS);
        ArrayList<Integer> marks = Utils.setListRand(LOWER_BOUND, UPPER_BOUND, itemNumbers);
        System.out.println(marks);
        System.out.println("Неудовлетворительные оценки:");
        System.out.println(selectBadMarks(marks));
        System.out.println("Удовлетворительные оценки:");
        System.out.println(marks);
    }
    private static ArrayList<Integer> selectBadMarks(ArrayList<Integer> marks){
        ArrayList<Integer> badMarks = new ArrayList<>();
        Iterator<Integer> iterator = marks.iterator();
        while (iterator.hasNext()){
            int k = iterator.next();
            if (k < MIN_GOOD_MARK ) {
                badMarks.add(k);
                iterator.remove();
            }
        }
        return badMarks;
    }
}
