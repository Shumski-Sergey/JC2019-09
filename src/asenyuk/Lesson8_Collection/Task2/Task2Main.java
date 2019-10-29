package asenyuk.Lesson8_Collection.Task2;

/*
Создать коллекцию, наполнить ее случайными числами. Удалить
повторяющиеся числа.

 */

import java.util.ArrayList;
import java.util.HashSet;

public class Task2Main {

    public static void main(String[] args) {

        Task2 task2 = new Task2();

        ArrayList<Integer> currentNumbers = new ArrayList<>();

        currentNumbers = task2.ganericNumbers();

        for (Integer currentNumb : currentNumbers) {
            System.out.println(currentNumb);

        }
        System.out.println("--------------");
        HashSet<Integer> states = new HashSet<>(currentNumbers);

        for (Integer currentStates : states) {
            System.out.println(currentStates);

        }

    }
}