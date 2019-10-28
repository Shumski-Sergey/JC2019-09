package AlexandraShokhan.lesson8;

// 1. Создать список оценок учеников с помощью ArrayList, заполнить
//случайными оценками. Удалить неудовлетворительные оценки из списка.

import java.util.ArrayList;
import java.util.Iterator;

import static AlexandraShokhan.Utils.createRandomArrayList;

public class Task1 {
    public static void main(String[] args) {

        int minBadGrade = 4;
        int arrayListLength = 10;
        ArrayList<Integer> grades = new ArrayList<>();
        grades = createRandomArrayList(arrayListLength, 0, 10);
        ArrayList<Integer> badGrades = new ArrayList<>();

        System.out.println("Initial grades are:" + grades);

        for (Iterator<Integer> iterator = grades.iterator(); iterator.hasNext(); )
            if (iterator.next() <= minBadGrade) {
                iterator.remove();
            }
        System.out.println("Good grades are: " + grades);
    }
}
