package dmikulionak.control;

import dmikulionak.lesson_8.collection.collection;

import java.util.ArrayList;
import java.util.Collections;


/**
 * Created by user on 20.11.2019.
 */
public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        collection collect = new collection();
        collect.randomList(list,10,10);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(0));
    }
}
