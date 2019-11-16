package yKuzMinskij.Lab8_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Создать коллекцию, наполнить ее случайными числами. Удалить
 * повторяющиеся числа.
 */

public class TaskA2 {
    public static void main (String[] args) {
        outA(selector(generator()));
    }

    private static ArrayList<Integer> generator () {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random() * 20));
        }
        return list;
    }

    private static HashSet<Integer> selector (ArrayList<Integer> list) {
        HashSet<Integer> list2 = new HashSet<>();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (list2.contains(iterator.next())) {
            } else {
                list2.add(iterator.next());
            }
        }

        return list2;
    }

    private static void outA (HashSet<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {    // while вместо foreach длы реализации  iterator
            System.out.print(iterator.next() + " ");
        }
    }
}
