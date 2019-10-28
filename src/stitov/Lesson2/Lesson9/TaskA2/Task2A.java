package stitov.Lesson2.Lesson9.TaskA2;
import stitov.Lesson2.utilsST.Generator;
import stitov.Lesson2.utilsST.PrintArray;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

import java.util.ArrayList;

public class Task2A {
    private static final int RNDLENGTH = 100;
    public static void main(String[] args){
        ArrayList<Integer> rndArray = new ArrayList<Integer>();
        Generator gen = new Generator();
        Random rnd = new Random();
        PrintArray prt = new PrintArray();
        rndArray = gen.generateIntegerArray(rnd.nextInt(RNDLENGTH)+1);
        Collections.sort(rndArray);
        System.out.println("Первоначальный массив: ");
        prt.printArray(rndArray);
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.addAll(rndArray);
        rndArray.clear();
        rndArray.addAll(hashSet);
        System.out.println();
        System.out.println("Уникальный массив: ");
        prt.printArray(rndArray);
    }

}
