package nbogdan.Lesson9;

import java.util.*;

public class TaskA2v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = sc.nextInt();
        System.out.println("Максимальное число в массиве:");
        int max = sc.nextInt();
        ArrayList<Integer> list = Generator.generateIntArrayList(size, max);
        HashSet<Integer> listSet = new HashSet<>();
        System.out.print("Первоначальный массив:\n");
        for (int a : list) {
            System.out.print(a + ", ");
            listSet.add(a);
        }
        System.out.print("\b\b.\n");
        System.out.print("Измененный:\n");
        for (int a : listSet) {System.out.print(a + ", ");}
        System.out.print("\b\b.\n");
    }
}
