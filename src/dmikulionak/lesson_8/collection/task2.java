package dmikulionak.lesson_8.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//Создать коллекцию, наполнить ее случайными числами. Удалить
//повторяющиеся числа.
public class task2 {
    public static void main(String[] args) {
        collection list = new collection();
        ArrayList<Integer> listArr = new ArrayList<>();
        list.randomList(listArr, 10, 100);
        System.out.println(listArr);
        Set<Integer> nr = new HashSet<>(listArr);
        System.out.println(nr);
    }
}
