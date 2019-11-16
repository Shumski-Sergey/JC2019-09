package dmikulionak.lesson_8.collection;


import java.util.ArrayList;
import java.util.LinkedList;

//Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. Напишите еще один метод, который выбирает из
// заполненного списка элемент наугад 10000 раз. Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.
public class task4 {
    public static void main(String[] args) {
        collection list = new collection();

        LinkedList<Integer> listLink = new LinkedList<>();
        ArrayList<Integer> listArr = new ArrayList<>();
        list.randomList(listArr, 100000, 1000000);
        list.randomList(listLink, 100000, 1000000);

        long startTime = System.currentTimeMillis();
        list.choiceList(listArr, 10000);
        long stopTime = System.currentTimeMillis();

        long startTime1 = System.currentTimeMillis();
        list.choiceList(listLink, 10000);
        long stopTime1 = System.currentTimeMillis();

        System.out.println("LinkedList " + (stopTime1 - startTime1) + " miliseconds.");
        System.out.println("ArrayList " + (stopTime - startTime) + " miliseconds.");
    }
}
