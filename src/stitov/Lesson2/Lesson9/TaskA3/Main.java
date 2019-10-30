package stitov.Lesson2.Lesson9.TaskA3;

import stitov.Lesson2.utilsST.Generator;
import stitov.Lesson2.utilsST.PrintArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {
    private static final int RNDLENGTH = 100;
    public static void main(String[] args){
        Generator gen = new Generator();
        ArrayList<Integer> arrayOfMarks = new ArrayList<Integer>();
        Random rnd = new Random();
        PrintArray prt = new PrintArray();
        arrayOfMarks = gen.generateIntegerArray(rnd.nextInt(100)+1);
        prt.printArray(arrayOfMarks);
        int maxValue = getMax(arrayOfMarks);
        System.out.println("Max value = "+maxValue);
        }
        public static Integer getMax(ArrayList<Integer> arrayList){
        Iterator<Integer> iterator = arrayList.iterator();
        int maxValue = arrayList.get(0);
        while (iterator.hasNext()){
            if (iterator.next()>maxValue){
                maxValue = iterator.next();
            }
        }
        return maxValue;
        }
    }


