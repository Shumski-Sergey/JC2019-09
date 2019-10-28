package vtafeliuk.Lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int arraySize = sc.nextInt();
        Random rd = new Random();

        for (int i = 0; i < arraySize; i++) {
            marks.add(rd.nextInt(10));
        }
        System.out.println(marks);


        for (int i = arraySize-1; i >= 0; i--) {
            for (int  j = 0; j < i; j++)
            if (marks.get(i) == marks.get(j)) {
                marks.remove(i);
            }
        }
        System.out.println(marks);
///доделать
    }
}
