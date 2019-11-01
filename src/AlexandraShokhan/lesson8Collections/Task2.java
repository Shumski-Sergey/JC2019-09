package AlexandraShokhan.lesson8Collections;

// 2.Создать коллекцию, наполнить ее случайными числами. Удалить
//повторяющиеся числа.

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import static AlexandraShokhan.Utils.createRandomArrayList;

public class Task2 {
    public static void main(String[] args) {
        int arrayListLength = 100;
        final int MIN_GRADE = 0;
        final int MAX_GRADE = 10;
        ArrayList<Integer> randomNumbers;
        randomNumbers = createRandomArrayList(arrayListLength, MIN_GRADE, MAX_GRADE);
        System.out.println("The list of all numbers is" + randomNumbers);
        Set<Integer> distinctNumbers = new LinkedHashSet<>(randomNumbers);
        System.out.println("The list of distinct numbers is " + distinctNumbers);
    }
}
