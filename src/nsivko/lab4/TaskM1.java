package nsivko.lab4;

import java.util.Random;
import java.util.Scanner;

public class TaskM1 {
    public static void main(String[] args) {
        int a;
        Random rand = new Random();
        Scanner rm = new Scanner(System.in);
        System.out.print("Введите количество оценок для проверки: ");
        a = rm.nextInt();
        int[] ch = new int[a];
        System.out.print("Последовательность оценок: ");
        for (int i = 0; i < ch.length; i++) {
            ch[i] = rand.nextInt(11);
            System.out.print(ch[i] + " ");
        }
        int max = 0;
        int maxIndex = 0;
        for (int j = 0; j < ch.length; j++) {
                if (ch[j] > max) {
                    max = ch[j];
                    maxIndex = j;
                }
        }
        System.out.print("\nМаксимальное(-ые) число(-а) находится(-ятся) на месте(-ах): ");
        for(int j = 0; j < ch.length; j++){
        if(ch[maxIndex] == ch[j]){
            int mm = j + 1;
            System.out.print(mm + " ");
        }
        }
    }
}
