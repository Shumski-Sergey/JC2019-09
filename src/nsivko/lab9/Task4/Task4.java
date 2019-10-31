package nsivko.lab9.Task4;

import java.util.ArrayList;
import java.util.LinkedList;

import static nsivko.utils.CreateArrayListRandom.createNumberRandom;
import static nsivko.utils.CreateArrayListRandom.createRandomList;

public class Task4 {
    private static final int NUMBER = 1000000;

    public static void main(String[] args) {
        long timerStart1, timerStart2, timerEnd1, timerEnd2, timer1, timer2;

        ArrayList<Integer> arrayList = new ArrayList<>();
        createNumberRandom(arrayList, NUMBER);

        LinkedList<Integer> linkedList = new LinkedList<>();
        createNumberRandom(linkedList, NUMBER);

        timerStart1 = System.currentTimeMillis();
        createRandomList(arrayList);
        timerEnd1 = System.currentTimeMillis();
        timer1 = timerEnd1 - timerStart1;

        timerStart2 = System.currentTimeMillis();
        createRandomList(linkedList);
        timerEnd2 = System.currentTimeMillis();
        timer2 = timerEnd2 - timerStart2;

        System.out.print("ArrayList выполняет за " + timer1 + " милисекунд.");
        System.out.print("\nLinkedList выполняет за " + timer2 + " милисекунд.");
        System.out.print("\nArrayList быстрее LinkedList в " + ((double) timer2/timer1) + " раз(-а).");
    }
}

