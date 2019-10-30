package yKuzMinskij.Lab8;

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
    private static ArrayList generator (){
        ArrayList list = new ArrayList();
        for (int i=0; i<100; i++) {
            list.add((int)(Math.random() * 20));
        }
        return list;
    }
    private static HashSet selector (ArrayList<Integer> list){
        HashSet list2 = new HashSet();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            if (list2.contains(iterator.next())){
                continue;
            }else {list2.add(iterator.next());}
        }

        return list2;
    }
    private static void outA (HashSet list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+ " ");
        }
    }
}
