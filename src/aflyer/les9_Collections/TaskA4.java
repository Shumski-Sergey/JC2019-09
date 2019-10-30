package aflyer.les9_Collections;

import aflyer.Methods.ArrayRandomizer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

//Задание А4, лучше бы Ауди той же модели=)
//Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
// Напишите еще один метод, который выбирает из заполненного списка элемент наугад 10000 раз.
// Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.
public class TaskA4 {
    public static final int SIZE_BIG = 1000000;
    public static final int SIZE_SMALL = 10000;

    public static void main(String[] args) {
        ArrayList arlist = new ArrayList();
        LinkedList lklist = new LinkedList();
        Random r = new Random();
        int range = Math.abs(r.nextInt());
        long timearbegin, timearend, timelkbegin, timelkend;
        timearbegin = System.currentTimeMillis();
        arlist = ArrayRandomizer.fillArray(arlist, SIZE_BIG, range);
        arlist = pickElements(arlist, SIZE_BIG);
        timearend = System.currentTimeMillis();
        System.out.println("ArrayList: " + timearbegin + " " + timearend + " или " + (timearend - timearbegin) + " милисекунд");
        timelkbegin = System.currentTimeMillis();
        lklist = ArrayRandomizer.fillLinkArray(lklist, SIZE_BIG, range);
        lklist = pickElements(lklist, SIZE_BIG);
        timelkend = System.currentTimeMillis();
        System.out.println("LinkedList: " + timelkbegin + " " + timelkend + " или " + (timelkend - timelkbegin) + " милисекунд");
    }


    public static ArrayList pickElements(ArrayList arlist, int range) {
        ArrayList newArList = new ArrayList();
        Random r = new Random();
        for (int i = 0; i < SIZE_SMALL; i++) {
            int pickUp = r.nextInt(range);
            newArList.add(i, arlist.get(pickUp));
        }
        return newArList;
    }

    public static LinkedList pickElements(LinkedList lklist, int range) {
        LinkedList newLkList = new LinkedList();
        Random r = new Random();
        for (int i = 0; i < SIZE_SMALL; i++) {
            int pickUp = r.nextInt(range);
            newLkList.add(i, lklist.get(pickUp));
        }
        return newLkList;
    }

}
