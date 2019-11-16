package aflyer.les9_Collections;
//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.

import aflyer.Methods.ArrayRandomizer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class TaskA3 {
    public static void main ( String[] args ) {
        Random r = new Random();
        int size = r.nextInt(Byte.MAX_VALUE);
        int range = r.nextInt(Byte.MAX_VALUE);
        ArrayList Journal = ArrayRandomizer.newArrayList(size, range);
        int max = (int) Journal.get(0);
        Iterator <Integer> iterator = Journal.iterator();
        while (iterator.hasNext()) {
            int i = (int) iterator.next();
            if (i > max) max = i;
        }
        ArrayRandomizer.OutputArray(Journal);
        System.out.println(max);
        Journal.sort(null);
        ArrayRandomizer.OutputArray(Journal);
        System.out.println(Journal.get(Journal.size() - 1));
    }
}
