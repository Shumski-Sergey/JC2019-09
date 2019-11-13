package asenyuk.Lesson8_Collection.Task3;

/*
Создать список оценок учеников с помощью ArryList, заполнить случайными
оценками. Найти самую высокую оценку с использованием итератора.

 */

import java.util.ArrayList;
import java.util.ListIterator;

public class Task3Main {

    public static void main(String[] args) {
         Integer max=0;
        Task3 controlTest2 = new Task3();
        ArrayList<Integer> currentGrades2 = new ArrayList<>();
        currentGrades2 = controlTest2.doContralTest2();
        ListIterator<Integer> listIter = currentGrades2.listIterator();
        while (listIter.hasNext() ) {
            System.out.println("---- " );
            Integer n= listIter.next();
            System.out.println("n =" +n );
if (n >max) max=n;
else max=max;
        }
System.out.println("MAX = " +max);

    }
}
