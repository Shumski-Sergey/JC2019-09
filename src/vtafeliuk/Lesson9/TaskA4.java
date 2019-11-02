package vtafeliuk.Lesson9;
//Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. Напишите еще один метод, который
// выбирает из заполненного списка элемент наугад 10000 раз. Замерьте время, которое потрачено на это.
// Сравните результаты и предположите, почему они именно такие.

import java.util.*;

public class TaskA4 {
    private static final Integer arraySize = 10000000;
    private static final Integer randomElementsNumber = 10000;
    private static final Random random = new Random();

    public static void main(String[] args) {
        List<Integer> marks = fillCollection(new ArrayList<>());

        List<Integer> linkedMarks = fillCollection(new LinkedList<>());

        long linkedListStartTime = System.currentTimeMillis();

        getElementsFromList(linkedMarks);

        long linkedListFinishTime = System.currentTimeMillis();
        long linkedListResultTime = linkedListFinishTime - linkedListStartTime;


        long arrayListStartTime = System.currentTimeMillis();

        getElementsFromList(marks);
        long arrayListFinishTime = System.currentTimeMillis();
        long arrayListResultTime = arrayListFinishTime - arrayListStartTime;

        System.out.println("Время ArrayList: " + arrayListResultTime + " ms");
        System.out.println("Время LinkedList: " + linkedListResultTime + " ms");
    }

    private static List<Integer> fillCollection(List<Integer> list) {
        for (int i = 0; i < arraySize; i++) {
            list.add(random.nextInt(Integer.MAX_VALUE));
        }
        return list;
    }

    private static void getElementsFromList(List<Integer> list) {
        for (int i = 0; i < randomElementsNumber; i++) {
            list.get(random.nextInt(list.size() - 1));
        }
    }
}
//Структурно работает в несколько раз быстрей?