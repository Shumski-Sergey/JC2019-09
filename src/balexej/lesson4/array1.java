package balexej.lesson4;
import java.util.Scanner;

public class array1 {
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int[] ar = new int[10];
        for (int i = 0; i < a; i++) {
            ar [i] = sc.nextInt();
        }
        int maxValue = ar[0];
        int maxIndex = 0;
        for (int i = 0; i<ar.length;i++){
            if (ar[i]>maxValue){
                maxValue = ar[i];
                maxIndex = i;
            }
        }
        System.out.println("Максимальная оценка " + maxValue);
        System.out.println("Интдекс " + maxIndex);
}
}