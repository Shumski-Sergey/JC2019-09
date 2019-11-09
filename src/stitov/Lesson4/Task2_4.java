package stitov.Lesson4;
import java.util.Scanner;
public class Task2_4 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность квадрата");
        int n = in.nextInt();
        System.out.println();
        int array[][] = new int[n][n];
        int middle;
        if (n%2==0){
            middle = n/2;
        } else {
            middle = (n-n%2)/2+1;
        }
        for (int i = 0; i<n;i++){
            for (int j = 0;j<n;j++){
                if (i<=middle-1) {
                    if (j >= i && j <= n - 1 - i) {
                        array[i][j] = 1;
                    } else {
                        array[i][j] = 0;
                    }
                } else {
                    if (j <= i && j >= n - 1 - i) {
                        array[i][j] = 1;
                    } else {
                        array[i][j] = 0;
                    }
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
