package balexej.Lesson9Colletion.LinkedListArrayList;


import java.util.ArrayList;
import java.util.LinkedList;


//4.Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
// Напишите еще один метод, который выбирает из заполненного списка элемент наугад 10000 раз.
// Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.

public class Array {
    public static void main(String[] args) {
ArrayList<Integer> list1 = new <Integer>ArrayList<Integer>();
LinkedList<Integer> list2 = new <Integer>LinkedList<Integer>();
for (int i = 0; i<1_000_000; i++){
    list1.add(i);
    list2.add(i);
   
}
        // Начала отсчета
        long startArray = System.currentTimeMillis();

            for(int i = 1;i < 10000;i++) {

            list1.get ((int)(Math.random() * list1.size()));
            }
        long stopArray = System.currentTimeMillis();
           Long startLinked =System.currentTimeMillis();
            for (int i = 0; i < 10000; i++ ){
               list2.get((int)(Math.random() * list2.size()));
            }
            Long stopLinked = System.currentTimeMillis();



            System.out.println("Скорость выполнения программы ArrayList: " + (stopArray - startArray) +  " миллисекунд");
            System.out.println("Скорость выполнения программы LinkedList: " + (stopLinked - startLinked) +  " миллисекунд");

        }
    }


