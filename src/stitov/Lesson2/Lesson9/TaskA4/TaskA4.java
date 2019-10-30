package stitov.Lesson2.Lesson9.TaskA4;


import stitov.Lesson2.utilsST.Generator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TaskA4 {
    private static final int MILLION = 1000000;
    private static final int TENTHOUSAND = 10000;
    public static void main(String[] args){
        Generator gen = new Generator();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList = gen.generateIntegerArray(MILLION);
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList = gen.generateIntegerLinkedList(MILLION);
        int[] indexarray = new int[TENTHOUSAND];
        indexarray = gen.generateIntArray(TENTHOUSAND,MILLION);
        long time1 = System.currentTimeMillis();
        request(arrayList,indexarray);
        long time2 = System.currentTimeMillis();
        long time3 = System.currentTimeMillis();
        request(linkedList,indexarray);
        long time4 = System.currentTimeMillis();
        System.out.println("Time ArrayList = "+ (time2-time1));
        System.out.println("Time LinkedList = "+ (time4-time3));
    }
    static void request (List<Integer> array, int[] indexaray){
    int value;
        for (int item : indexaray) {
            value = array.get(item);
        }
    }
}
