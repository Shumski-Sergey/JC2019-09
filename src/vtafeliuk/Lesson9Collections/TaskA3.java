package vtafeliuk.Lesson9Collections;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.

import java.util.*;

public class TaskA3 {

    private static final int LIST_SIZE = 10;

    public static void main(String[] args) {
        List<Integer> marks = ArrayListCreator.getRandomList(LIST_SIZE);
        System.out.println(marks);

        int max = marks.get(0);
        Iterator<Integer> maxElement = marks.iterator();
        while (maxElement.hasNext()) {
            int temp = maxElement.next();
            if (max < temp) {
                max = temp;
            }
        }
        System.out.println("Максимальная оценка: " + max);
    }
}
