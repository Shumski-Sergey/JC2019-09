package zyahya.Collections;
//Создать список оценок учеников с помощью ArrayList, заполнить
//случайными оценками. Удалить неудовлетворительные оценки из списка.

import java.util.ArrayList;

public class Number1 {
    private static final int element = 5;
    private static final int negative = 3;

    public static void main(String[] args) {
        ArrayList<Integer> mark = new ArrayList<>(element);

        for (int i = 0; i < element; i++) {
            int a = (int) (Math.random() * 10 + 1);
            mark.add(a);
        }

        System.out.println(mark);

        ArrayList<Integer> negativeList = new ArrayList<>();
        for (int i = 0; i < element; i++) {
            int k = mark.get(i);
            if (k <= negative) {
                negativeList.add(k);
            }
        }

        mark.removeAll(negativeList);
        System.out.println(mark);
    }
}

