package nbogdan.Lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class TaskA2 {
    private static void removeEquals(ArrayList<Integer> list) {
        Collections.sort(list);
        for (int i = 0; i < (list.size() - 1); ) {
            if(list.get(i).equals(list.get(i + 1))) {
                list.remove(i);
            } else {i++;}
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Размер массива:");
        int size = sc.nextInt();
        System.out.println("Максимальное число в массиве: ");
        int max = sc.nextInt();
        ArrayList<Integer> list = Generator.generateIntArrayList(size, max);
        System.out.print("Первоначальный массив: ");
        for (int a : list) {System.out.print(a + ", ");}
        System.out.print("\b\b.\nМассив без повторений элементов: ");
        removeEquals(list);
        for (int a : list) {System.out.print(a + ", ");}
        System.out.print("\b\b.");
    }
}
