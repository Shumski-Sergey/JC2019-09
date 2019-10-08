package dmikulionak.lesson_4;

import java.util.Scanner;

public class task_a8 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число m: ");
        int m = in.nextInt();
        double[] array = new double[m];
        int x = 1;
        double c;
        for (int i = 0; i < m; i++) {
            array[i] = x;
            x++;
        }
        for (double v : array) {
            c = m / v;
            int res = (int) c; //целая часть
            double res2 = c - res; //дробная часть
            if (res2 == 0.0) {
                System.out.print(v + " ");
            }
        }
    }
}
