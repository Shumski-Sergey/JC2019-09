package AlexandraShokhan.lesson8Collections;

// 1. Создать список оценок учеников с помощью ArrayList, заполнить
//случайными оценками. Удалить неудовлетворительные оценки из списка.

import java.util.ArrayList;
import java.util.Iterator;

import static AlexandraShokhan.Utils.createRandomArrayList;

public class Task1 {
    public static void main(String[] args) {

        int minBadGrade = 4;
        int arrayListLength = 10;
        final int MIN_GRADE = 0;
        final int MAX_GRADE = 10;
        ArrayList<Integer> grades = new ArrayList<>();
        grades = createRandomArrayList(arrayListLength, MIN_GRADE, MAX_GRADE);

        System.out.println("Initial grades are:" + grades);

        for (Iterator<Integer> iterator = grades.iterator(); iterator.hasNext(); )
            if (iterator.next() <= minBadGrade) {
                iterator.remove();
            }
        System.out.println("Good grades are: " + grades);
    }
}
