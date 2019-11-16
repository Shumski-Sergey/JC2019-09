package stitov.Lesson9_Collections.TaskA3;

import stitov.utilsST.Generator;
import stitov.utilsST.Printer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {
    private static final int RND_LENGTH = 5;
    private static final int MAX_MARK = 100;
    public static void main(String[] args){
        Random rnd = new Random();
        ArrayList<Integer> arrayOfMarks = Generator.generateIntegerArray(rnd.nextInt(RND_LENGTH)+1, MAX_MARK);
        Printer.printArray(arrayOfMarks);
        int maxValue = getMax(arrayOfMarks);
        System.out.println("Max value = "+maxValue);
        }

        private static Integer getMax(ArrayList<Integer> arrayList){
        Iterator<Integer> iterator = arrayList.iterator();
        int maxValue = arrayList.get(0);
        int iteratorValue;
        while (iterator.hasNext()){
            iteratorValue = iterator.next();
            if (iteratorValue>maxValue){
                maxValue = iteratorValue;
            }
        }
        return maxValue;
        }
    }


