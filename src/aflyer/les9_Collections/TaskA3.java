package aflyer.les9_Collections;
//Создать список оценок учеников с помощью ArryList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.

import aflyer.Methods.ArrayRandomizer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class TaskA3 {
    public static void main(String[] args) {
        ArrayList Journal = new ArrayList();
        Random r = new Random();
        int size = r.nextInt(Byte.MAX_VALUE);
        int range = r.nextInt(Byte.MAX_VALUE);
        int max = 0;
        Journal = ArrayRandomizer.fillArray(Journal, size, range);
        Iterator<Integer> iterator = Journal.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > max) max = iterator.next();
        }
        ArrayRandomizer.OutputArray(Journal);
        System.out.println(max);
    }
}
