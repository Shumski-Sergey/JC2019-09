package vtafeliuk.Lesson9Collections;
//Создать коллекцию, наполнить ее случайными числами. Удалить
//повторяющиеся числа.

import java.util.*;

public class TaskA2 {

    private static final int LIST_SIZE = 10;

    public static void main(String[] args) {
        List<Integer> marks = ArrayListCreator.getRandomList(LIST_SIZE);
        System.out.println("Вывод случайного листа размером" + marks);
        System.out.println("Результат через HashSet: " + new HashSet<>(marks));

        List<Integer> listWithUniqueNumbers = new ArrayList<>();
        for (Integer integer : marks) {
            if (listWithUniqueNumbers.indexOf(integer) == -1) {
                listWithUniqueNumbers.add(integer);
            }
        }
        System.out.println("Результат через добавление только уникальных элементов в новый лист: " + listWithUniqueNumbers);
    }
}