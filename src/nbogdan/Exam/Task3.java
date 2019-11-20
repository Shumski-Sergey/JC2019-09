package nbogdan.Exam;

import nbogdan.Lesson9.Generator;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = sc.nextInt();
        System.out.println("Введите максимальное значение в массиве");
        int max = sc.nextInt();
        ArrayList<Integer> list = Generator.generateIntArrayList(size, max);
        ArrayList<Integer> repeats = new ArrayList<>();
        int maxRepeats = 0;
        for (int n : list) {
            if (maxRepeats < Collections.frequency(list, n)) maxRepeats = Collections.frequency(list, n);
        }
        for (int n : list) {
            if (maxRepeats == Collections.frequency(list, n)) {
                System.out.println("Число " + n + " повторяется в массиве " + Collections.frequency(list, n) + " раз.");
            }
        }
    }
}