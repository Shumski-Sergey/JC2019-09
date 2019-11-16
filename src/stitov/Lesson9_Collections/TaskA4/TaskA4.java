package stitov.Lesson9_Collections.TaskA4;


import stitov.utilsST.Generator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TaskA4 {
    private static final int MILLION = 1000000;
    private static final int TENTHOUSAND = 10000;
    private static final int MAX_VALUE = 100;
    public static void main(String[] args){
        ArrayList<Integer> arrayList = Generator.generateIntegerArray(MILLION, MAX_VALUE);
        LinkedList<Integer> linkedList = Generator.generateIntegerLinkedList(MILLION, MAX_VALUE);
        int[] indexarray = Generator.generateIntArray(TENTHOUSAND,MILLION);
        long time1 = System.currentTimeMillis();
        request(arrayList,indexarray);
        long time2 = System.currentTimeMillis();
        long time3 = System.currentTimeMillis();
        request(linkedList,indexarray);
        long time4 = System.currentTimeMillis();
        System.out.println("Time ArrayList = "+ (time2-time1));
        System.out.println("Time LinkedList = "+ (time4-time3));
    }
    private static void request(List<Integer> array, int[] indexaray){
    int value;
        for (int item : indexaray) {
            value = array.get(item);
        }
    }
}
