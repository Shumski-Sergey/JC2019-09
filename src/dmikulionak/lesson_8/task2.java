package dmikulionak.lesson_8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//Создать коллекцию, наполнить ее случайными числами. Удалить
//повторяющиеся числа.
public class task2  {
    public static void main (String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<10000; i++) {
            int a = (int)(Math.random()*100);
            list.add(i,a);
        }
        System.out.println(list);
        Set<Integer> nr = new HashSet<>(list);
        System.out.println(nr);
    }
}
