package nbogdan.Lesson2.TaskA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> abc = new ArrayList<>();
        System.out.println("Введите 3 целых числа: ");
        for (int i = 0; i <3; i++) {
            abc.add(sc.nextInt());
        }
        Collections.sort(abc);
        System.out.println("Ваши числа в порядке возрастания: ");
        for (int i: abc) {
            System.out.println(i);
        }
    }
}
