package dmikulionak.control;


import dmikulionak.lesson_8.collection.collection;
import java.util.ArrayList;



/**
 * Created by user on 20.11.2019.
 */
public class task1 {
    public static void main(String[] args) {
        int sizeList = 10;
        int randRange = 10;
        ArrayList<Integer> list = new ArrayList<>();
        collection collect = new collection();
        collect.randomList(list,randRange,sizeList);
        int max = collect.iteratorMax(list);
        int min = collect.iteratorMin(list);
        int summ = 0;

        System.out.println(list);


        System.out.println("мах значение = " + max + ";" + "min значение = " + min );


    }
}
