package dmikulionak.lesson_9_map;

import dmikulionak.lesson_8.collection.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Решить задачу подсчета повторяющихся элементов в массиве с помощью HashMap.
public class task2 {
    public static void main (String[] args) {
        collection list = new collection();
        ArrayList<Integer> listArr = new ArrayList<>();
        list.randomList(listArr,10,100);
        HashMap<Object, Integer> map = new HashMap<>();
        for (Object o : listArr) {
            map.merge(o, 1, Integer::sum);
        }
        Set<Map.Entry<Object, Integer>> reply = map.entrySet();
        for(Map.Entry<Object, Integer> element : reply) {
            System.out.println("element - "+element.getKey() + "; reply - " + element.getValue());
        }
    }
}

