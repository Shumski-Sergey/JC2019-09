package vtafeliuk.Lesson9Collections;
//Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. Напишите еще один метод, который
// выбирает из заполненного списка элемент наугад 10000 раз. Замерьте время, которое потрачено на это.
// Сравните результаты и предположите, почему они именно такие.

//Херня какая-то. Результата ждать почти три минуты на моём ПК. Структурно та же задача показывает решение за 20 сек.

import java.util.*;

public class TaskA4 {
    private static final Integer arraySize = 10000000;
    private static final Integer randomElementsNumber = 10000;
    private static final Random random = new Random();

    public static void main(String[] args) {
        List<Integer> marks = fillCollection(new ArrayList<>());
        List<Integer> linkedMarks = fillCollection(new LinkedList<>());

        long arrayListResultTime = getListResultTime(marks);
        long linkedListResultTime = getListResultTime(linkedMarks);

        System.out.println("Время ArrayList: " + arrayListResultTime + " ms");
        System.out.println("Время LinkedList: " + linkedListResultTime + " ms");
    }

    private static long getListResultTime(List<Integer> list) {
        long ListStartTime = System.currentTimeMillis();
        getElementsFromList(list);
        long ListFinishTime = System.currentTimeMillis();
        return ListFinishTime - ListStartTime;
    }

    private static List<Integer> fillCollection(List<Integer> list) {
        for (int i = 0; i < arraySize; i++) {
            list.add(random.nextInt());
        }
        return list;
    }

    private static void getElementsFromList(List<Integer> list) {
        for (int i = 0; i < randomElementsNumber; i++) {
            list.get(random.nextInt(list.size() - 1));
        }
    }
}
