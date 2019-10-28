package nbogdan.Lesson9;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

class TaskA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество учеников:");
        int size = sc.nextInt();
        System.out.println("Введите максимальную оценку:");
        int max = sc.nextInt();
        ArrayList<Integer> list = Generator.generateIntArrayList(size, max);
        int maxMark = list.get(0);
        ListIterator<Integer> liter = list.listIterator();
        while (liter.hasNext()) {
            maxMark = (liter.next() > maxMark) ? list.get(liter.previousIndex()) : maxMark;
        }
        System.out.print("Все оценки: ");
        for (int a : list) {
            System.out.print(a + ", ");
        }
        System.out.print("\b\b.\nМаксимальная оценка: " + maxMark + ".");
    }
}