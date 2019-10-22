package yKuzMinskij.Lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
 * Реализовать метод, который возвращает любой элемент массива по индексу.
 */

public class TaskA1 {
    public static void main (String[] args) {
        String[] arr1 = {"fghj", "cvbnm", "xcvbnm"};
        Integer [] arr2 = {1, 2, 3, 3, 4, 5};
        Long [] arr3 = new Long[]{156156123L, 14523694L,78895916L,25684512L};
        universalArray<String> a1 = new universalArray<>(arr1);
        universalArray<Integer> a2 = new universalArray<>(arr2);
        universalArray<Long> a3 = new universalArray<>(arr3);
        a1.out();
        a2.out();
        a3.out();
    }
}
class universalArray<T> {
    T [] arr;
    ArrayList<T> arrayList = new ArrayList<>();


    public universalArray (T []arr) {
        this.arr = arr;
        this.arrayList.addAll(Arrays.asList(this.arr));
    }
    public void out (){
        System.out.println("Введите индекс возвращаемого значения начиная с \"0\"\nИндекс не должен превышать " + arrayList.size());
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("Индекс " + i+ " содержит значение " + arrayList.get(i) + "\n\n");
    }
}