package zyahya.Collections;
//Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
//Найти самую высокую оценку с использованием итератора.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Number3 {
    private static final int element = 5;
    private static final int negative = 5;

    public static void main(String[] args) {
        ArrayList<Integer> grade = new ArrayList<>();
        for (int i = 0; i < element; i++) {
            Integer b = (int) (Math.random() * 10 + 1);
            grade.add(i, b);
        }
        System.out.println(grade);

        for (Iterator<Integer> iterator = grade.iterator(); iterator.hasNext(); )
            if (iterator.next() <= negative)
                iterator.remove();
        System.out.println(grade);

        Integer maxValue = Collections.max(grade);
        System.out.println("Max Value is : " +maxValue);

    }
}

