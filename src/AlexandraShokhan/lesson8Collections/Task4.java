package AlexandraShokhan.lesson8Collections;

// 4.Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. Напишите еще один метод,
// который выбирает из заполненного списка элемент наугад 10000 раз. Замерьте время, которое потрачено на это.
// Сравните результаты и предположите, почему они именно такие.

import java.util.ArrayList;
import java.util.LinkedList;

import static AlexandraShokhan.Utils.*;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> randomArrayList = createRandomArrayList(1000000, 0, 1000000);
        LinkedList<Integer> randomLinkedList = createRandomLinkedList(1000000, 0, 1000000);

        // Measuring the time for selecting values from ArrayList:
        long startArraySelection = System.currentTimeMillis();
        getRandomNTimes(randomArrayList, 10000);
        long endArrayselection = System.currentTimeMillis();
        long timeArray = endArrayselection - startArraySelection;
        System.out.println(timeArray);

        // Measuring the time for selecting values from ArrayList:
        long startLinkedSelection = System.currentTimeMillis();
        getRandomNTimes(randomLinkedList, 10000);
        long endLinkedSelection = System.currentTimeMillis();
        long timeLinked = endLinkedSelection - startLinkedSelection;
        System.out.println(timeLinked);

        if (timeArray < timeLinked) {
            System.out.println("ArrayList works " + (timeLinked / timeArray) + " times quicker than LinkedList.");
        } else if (timeArray > timeLinked) {
            System.out.println("LinkedList works " + (timeArray / timeLinked) + " times quicker than ArrayList.");
        } else {
            System.out.println("LinkedList and ArrayList work at the same speed.");
        }
    }
}
