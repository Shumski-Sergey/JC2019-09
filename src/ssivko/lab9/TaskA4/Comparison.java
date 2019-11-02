package ssivko.lab9.TaskA4;

import java.util.ArrayList;
import java.util.LinkedList;

import static ssivko.Ulils.listRandom;
import static ssivko.Ulils.randomSelection;

public class Comparison {
 private static final int GRADUATION = 1000000;

    public static void main(String[] args) {
        long timeFirstOne, timeFirstTwo, timeFinalOne, timeFinalTwo, stopwatchOne, stopwatchTwo;
        ArrayList<Integer> arrayList = new ArrayList<>();
        listRandom(arrayList, GRADUATION);
        timeFirstOne = System.currentTimeMillis();
        randomSelection(arrayList);
        timeFinalOne = System.currentTimeMillis();
        stopwatchOne = timeFinalOne - timeFirstOne;
        System.out.println("Время выполнения ArrayList: " + stopwatchOne + " мс.");

        LinkedList<Integer> linkedList = new LinkedList<>();
        listRandom(linkedList, GRADUATION);
        timeFirstTwo = System.currentTimeMillis();
        randomSelection(linkedList);
        timeFinalTwo = System.currentTimeMillis();
        stopwatchTwo = timeFinalTwo - timeFirstTwo;
        System.out.println("Время выполнения LinkedList: " + stopwatchTwo + " мс.");
    }
}
