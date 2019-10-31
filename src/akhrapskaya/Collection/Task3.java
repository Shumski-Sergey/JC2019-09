package akhrapskaya.Collection;

/*3.Создать список оценок учеников с помощью ArrayList, заполнить случайными
оценками. Найти самую высокую оценку с использованием итератора.*/

import akhrapskaya.Utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {
    private static final int MAX_MARKS_NUMBERS = 100;
    private static final int UPPER_BOUND = 11;
    private static final int LOWER_BOUND = 0;

    public static void  main(String[] args){
        int itemNumbers = Utils.putInInt("Введите количество оценок.",  MAX_MARKS_NUMBERS);
        ArrayList<Integer> marks = Utils.setListRand(LOWER_BOUND, UPPER_BOUND, itemNumbers);
        System.out.println(marks);
        System.out.println("Лучшая оценка:" + getMax(marks));
    }
    private static int getMax(ArrayList<Integer> marks) {
        Iterator<Integer> iterator = marks.iterator();
        int max = 0;
        while (iterator.hasNext()) {
            int t = iterator.next();
            if (t > max)
                max = t;
        }
        return max;
    }
}
