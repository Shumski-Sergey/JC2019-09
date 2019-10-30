package vtafeliuk.Lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число оценок: ");
        int arraySize = sc.nextInt();
        Random rd = new Random();

        for (int i = 0; i < arraySize; i++) {
            marks.add(rd.nextInt(10));
        }
        System.out.println( "Все оценки: " + marks);

        for (int i = arraySize-1; i >= 0; i--) {
            if (marks.get(i) < 4) {
                marks.remove(i);
            }
        }
        System.out.println("Только положительные оценки: " + marks);
    }
}

