package vtafeliuk.Lesson9;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.

import java.util.*;

public class TaskA3 {
    public static void main(String[] args) {
        List<Integer> marks = ArrayListCreator.getRandomList(10);
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
