package zyahya.Collections;
//Создать коллекцию, наполнить ее случайными числами.
//Удалить повторяющиеся числа.

import java.util.ArrayList;
import java.util.Random;

public class Number2 {
    private static final int size = 20;

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(size);
        for (int i = 1; i <= size; i++) {
            list.add(i);
        }

        Random random = new Random();
        while (list.size() > 0) {
            int index = random.nextInt(list.size());
            System.out.println("Selected: " + list.remove(index));
        }
    }
}
