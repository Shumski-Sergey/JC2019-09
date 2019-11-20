package nbogdan.Exam;

import nbogdan.Lesson9.Generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    static int sumWithoutMinMax(ArrayList<Integer> list) {
        list.remove(list.get(0));
        list.remove(list.get(list.size() - 1));
        int sum = 0;
        for(int s : list) {
            sum += s;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Введите размер массива");
        int size = sc.nextInt();
        System.out.println("Введите максимальное число в массиве");
        int max = sc.nextInt();
        ArrayList<Integer> list = Generator.generateIntArrayList(size, max);
        Collections.sort(list);
        System.out.println("Минимальное значение: " + list.get(0) + ".\nМаксимальное значение: " + list.get(list.size() -1) + ".");
        System.out.println("Сумма остальных элементов: " + sumWithoutMinMax(list) + ".");
    }
}
