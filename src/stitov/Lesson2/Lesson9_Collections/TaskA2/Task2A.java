package stitov.Lesson2.Lesson9_Collections.TaskA2;
import stitov.Lesson2.utilsST.Generator;
import stitov.Lesson2.utilsST.PrintArray;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.ArrayList;

public class Task2A {
    private static final int RNDLENGTH = 100;
    private static final int MAX_RANDOM = 100;
    public static void main(String[] args){
        Random rnd = new Random();
        ArrayList<Integer> rndArray = Generator.generateIntegerArray(rnd.nextInt(RNDLENGTH)+1,MAX_RANDOM);
        Collections.sort(rndArray);
        System.out.println("Первоначальный массив: ");
        PrintArray.printArray(rndArray);
        HashSet<Integer> hashSet = new HashSet<>(rndArray);
        rndArray.clear();
        rndArray.addAll(hashSet);
        System.out.println();
        System.out.println("Уникальный массив: ");
        PrintArray.printArray(rndArray);
    }

}
