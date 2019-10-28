package nsivko.lab9.Task4;

import nsivko.utils.CreateArrayListRandom;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task4 {

    private static final int SEARCH_NUMBER = 10000;
    private static final int NUMBER = 1000000;

    public static void main(String[] args) {

        long timerStart1, timerStart2, timerEnd1, timerEnd2, timer1, timer2;

        CreateArrayListRandom array = new CreateArrayListRandom(NUMBER);

        ArrayList<Integer> arrayList;
        arrayList = array.createArrayNumberRandom(NUMBER);

        LinkedList<Integer> linkedList;
        linkedList = array.createLinkedNumberRandom(NUMBER);

        timerStart1 = System.currentTimeMillis();
        createRandomArray(arrayList);
        timerEnd1 = System.currentTimeMillis();
        timer1 = timerEnd1 - timerStart1;

        timerStart2 = System.currentTimeMillis();
        createRandomLinked(linkedList);
        timerEnd2 = System.currentTimeMillis();
        timer2 = timerEnd2 - timerStart2;

        System.out.print("ArrayList выполняет за " + timer1 + " милисекунд.");
        System.out.print("\nLinkedList выполняет за " + timer2 + " милисекунд.");
        System.out.print("\nArrayList быстрее LinkedList в " + ((double) timer2/timer1) + " раз(-а).");



    }

    private static void createRandomLinked(LinkedList<Integer> linkedList) {
        for (int i = 0; i < SEARCH_NUMBER; i++) {
            int random = (int) (Math.random() * 10000);
            linkedList.get(random);
        }
    }

    private static void createRandomArray(ArrayList<Integer> arrayList) {
        for (int i = 0; i < SEARCH_NUMBER; i++) {
            int random = (int) (Math.random() * 10000);
            arrayList.get(random);
        }
    }

}

