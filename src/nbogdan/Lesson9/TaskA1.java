package nbogdan.Lesson9;

import java.util.ArrayList;
import java.util.Scanner;

class TaskA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество учеников");
        int size = sc.nextInt();
        System.out.println("Максимальная оценка:");
        int max = sc.nextInt();
        System.out.println("Минимальная удовлетворительная оценка:");
        int minMark = sc.nextInt();
        ArrayList<Integer> list = Generator.generateIntArrayList(size, max);
        ArrayList<Integer> bad = new ArrayList<>();
        for (int i = 0; i < list.size(); ) {
            if (list.get(i) < minMark) {
                bad.add(list.get(i));
                list.remove(i);
            } else {i++;}
        }
        System.out.print("Список положительных оценок: ");
        for (int mark : list) {
            System.out.print(mark + ", ");
        }
        System.out.print("\b\b.");
        System.out.print("\nСписок отрицательных оценок: ");
        for (int mark : bad) {
            System.out.print(mark + ", ");
        }
        System.out.print("\b\b.");
    }
}
