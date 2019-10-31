package balexej.Lesson9Colletion;
//3.Создать список оценок учеников с помощью ArrayList, заполнить случайными
//        оценками. Найти самую высокую оценку с использованием итератора.

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> rating = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * 100);
            rating.add(rand);
        }
        System.out.println(rating);

        Iterator<Integer> iterator = rating.iterator();
        int max = 0;
        while (iterator.hasNext()) {
            int t = iterator.next();
            if (t > max)
                max = t;
        }
        System.out.println("Самая лучшая оценка:" + max);
    }
}


