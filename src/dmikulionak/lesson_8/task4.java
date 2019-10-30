package dmikulionak.lesson_8;

import java.util.ArrayList;
import java.util.LinkedList;
//Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. Напишите еще один метод, который выбирает из
// заполненного списка элемент наугад 10000 раз. Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.
public class task4 {
    public static void main (String[] args) {
        ArrayList<Integer> listArr = new ArrayList<Integer>();
        LinkedList<Integer> listLink = new LinkedList<Integer>();
        for (int i = 0; i < 1000000; i++) {
            int a = (int) (Math.random() * 11);
            listArr.add(i, a);
            listLink.add(i, a);
        }
        System.out.println(listArr);
        System.out.println(listLink);
        long startTime = System.currentTimeMillis();
        for (int i=0; i<10000; i++){
            listArr.get((int) (Math.random() * listArr.size()));
        }
        long stopTime = System.currentTimeMillis();

        long startTime1 = System.currentTimeMillis();
        for (int i=0; i<10000; i++){
            listLink.get((int) (Math.random() * listLink.size()));
        }
        long stopTime1 = System.currentTimeMillis();
        System.out.println("LinkedList " + (stopTime1 - startTime1) + " miliseconds.");
        System.out.println("ArrayList " + (stopTime - startTime) + " miliseconds.");
    }
}
