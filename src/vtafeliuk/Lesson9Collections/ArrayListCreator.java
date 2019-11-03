package vtafeliuk.Lesson9Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class ArrayListCreator {
    static List<Integer> getRandomList(Integer valuesLimit) {
        List<Integer> marks = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество значений: ");
        int arraySize = sc.nextInt();
        Random rd = new Random();

        for (int i = 0; i < arraySize; i++) {
            marks.add(rd.nextInt(valuesLimit) + 1);
        }
        return marks;
    }
}
