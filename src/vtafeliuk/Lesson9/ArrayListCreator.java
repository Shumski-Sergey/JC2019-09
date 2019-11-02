package vtafeliuk.Lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayListCreator {
    public static List<Integer> getRandomList(Integer valuesLimit) {
        List<Integer> marks = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите лимит: ");
        int arraySize = sc.nextInt();
        Random rd = new Random();

        for (int i = 0; i < arraySize; i++) {
            marks.add(rd.nextInt(valuesLimit) + 1);
        }
        return marks;
    }
}
