package vtafeliuk.Lesson4;
//найти сумму элементов находящихся между минимальным и максимальным значениями массива
import java.util.Random;
import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {

        Scanner size = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = size.nextInt();
        int[] array = new int[a];

        Random element = new Random();
        int max = Integer.MIN_VALUE; // должны быть меньше чем минимальное рандомное число
        int min = Integer.MAX_VALUE; // должно быть больше чем максимальное рандомное число.
        int maxIndex = 0;
        int minIndex = 0;
        int sum = 0;
        //Наполняем массив случайными числами и выводим числа в консоль
        for (int i = 0; i < array.length; i++) {
            array[i] = element.nextInt(11);
            System.out.print(array[i] + " ");
        }
        //Ищем индекс с макс значением и выводим
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("\nМаксимальный индекс: " + maxIndex);
        //Ищем индекс с мин значением и выводим
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("\nМинимальный индекс: " + minIndex);
        //Суммируем значения элементов массива находящимися между мин и макс значениями

        if(minIndex < maxIndex) {
            for (int i = minIndex + 1; i < maxIndex; i++) {
                sum += array[i];
            }
        }else {
                for (int i = maxIndex + 1; i < minIndex ; i++) {
                    sum += array[i];
                }
            }
        System.out.println("Сумма элементов между мин и макс индексами равна: " + sum);
    }
}
