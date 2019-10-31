package AlexandraShokhan.lesson8Collections;

// 4.Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. Напишите еще один метод,
// который выбирает из заполненного списка элемент наугад 10000 раз. Замерьте время, которое потрачено на это.
// Сравните результаты и предположите, почему они именно такие.

import java.util.ArrayList;
import java.util.LinkedList;

import static AlexandraShokhan.Utils.*;

public class Task4 {
    public static void main(String[] args) {
        final int LIST_LENGTH = 1000000;
        final int MIN_VALUE = 0;
        final int MAX_VALUE = 1000000;
        final int SELECT_NUM_OF_ELEMENTS = 10000;
        ArrayList<Integer> randomArrayList = createRandomArrayList(LIST_LENGTH, MIN_VALUE, MAX_VALUE);
        LinkedList<Integer> randomLinkedList = createRandomLinkedList(LIST_LENGTH, MIN_VALUE, MAX_VALUE);

        // Measuring the time for selecting values from ArrayList:
        long timeArray = calculateOperationTime(randomArrayList, SELECT_NUM_OF_ELEMENTS);
        System.out.println("It took " + timeArray + " milliseconds to select " + SELECT_NUM_OF_ELEMENTS + " elements " +
                "from ArrayList.");

        // Measuring the time for selecting values from ArrayList:
        long timeLinked = calculateOperationTime(randomLinkedList, SELECT_NUM_OF_ELEMENTS);
        System.out.println("It took " + timeLinked + " milliseconds to select " + SELECT_NUM_OF_ELEMENTS + " elements " +
                "from LinledList.");

        if (timeArray < timeLinked) {
            System.out.println("ArrayList works " + (timeLinked / timeArray) + " times quicker than LinkedList.");
        } else if (timeArray > timeLinked) {
            System.out.println("LinkedList works " + (timeArray / timeLinked) + " times quicker than ArrayList.");
        } else {
            System.out.println("LinkedList and ArrayList work at the same speed.");
        }
    }
}
