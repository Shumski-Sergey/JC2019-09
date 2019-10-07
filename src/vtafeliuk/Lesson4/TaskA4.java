package vtafeliuk.Lesson4;

import java.util.Scanner;

public class TaskA4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер квадратного массива");
        int a = sc.nextInt();
        int[][] array = new int[a][a];
        //наполнение 1/4 массива + 1 ряд, если "a" является нечётным
        for (int i = 0; i < a / 2 + 1; i++) {
            for (int j = 0; j < array[i].length / 2 + 1; j++) {
                if (i <= j) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 9;
                }
            }
        }
        //зеркальное отражение 1/4 массива по двум осям. Сначала по строкам, потом по столбцам

        for (int i = 0; i < array.length / 2 + 1; i++) {
            array[a - i - 1] = array[i];
            for (int j = 0; j < array[i].length / 2 + 1; j++) {
                array[a - i - 1][a - j - 1] = array[i][j];
            }
        }

        //вывод массива на экран
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}