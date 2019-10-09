package nsivko.lab4;

import java.util.Scanner;

public class TaskM2 {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner mas = new Scanner(System.in);
        int a = mas.nextInt();
        int[] mm = new int[a];
        System.out.print("Введите массив: ");
        Scanner ch = new Scanner(System.in);
        for (int i = 0; i < a; i++) {
            mm[i] = ch.nextInt();
        }
        int max = mm[0], min = mm[0], mMax = 0, mMin = 0, sum = 0;
        for(int i = 0; i < a; i++){
                if (max < mm[i]) max = mm[i];
                if (min > mm[i]) min = mm[i];
        }

        for(int i = 0; i < a; i++){
            if(mm[i] == max) mMax = i;
            if(mm[i] == min) mMin = i;
        }
        System.out.println(mMax + " " + mMin);
        for(int i = 0; i < a; i++){
            if(mMax > mMin){
               if (i > mMin && i < mMax) sum += mm[i];
            }
            if(mMax < mMin){
                if(i > mMax && i < mMin) sum += mm[i];
            }
        }
        System.out.println("Сумма элементов между максимальным и минимальным значениями равна " + sum);
    }

}
