package akhrapskaya.Lesson9;

import balexej.lesson7.Array.Array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task4 {
    private final static int MAX_EL = 1000000;
    private final static int MAX = 500;
    private final static int MIN = 0;
    private final static int N = 10000;
    private static void setList(List<Integer> list){
        Random rand = new Random();
        for (int i = 0; i < MAX_EL; i++){
            list.add(rand.nextInt(MAX-MIN) + MIN);
        }
    }
    private static void getEl(List<Integer> list){
        Random rand = new Random();
        long start = System.nanoTime();
        for (int i = 0; i < N; i++){
           list.get(rand.nextInt((MAX-MIN) + MIN));
        }
        long time = System.nanoTime() - start;
        System.out.println(time);
    }
    public static void main(String[] args){
        ArrayList<Integer> listA = new ArrayList<>();
        setList(listA);
        LinkedList<Integer> listL = new LinkedList<>();
        setList(listL);
        System.out.println("ArrayList:");
        getEl(listA);
        System.out.println("LinkedList:" );
        getEl(listL);
    }
}
