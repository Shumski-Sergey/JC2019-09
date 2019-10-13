package aflyer.les3;
// Имеется целое число, определить является ли это число простым,
//т.е. делится без остатка только на 1 и себя.

import java.util.Scanner;

public class Cycles_TaskA2 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner sc=new Scanner(System.in);
        int k = sc.nextInt();
        for (int i=2; i<=(k-1);i++)
            if (k%i==0) { System.out.println("Число не является простым, оно нацело делится на: " + i);
                k=0; break; }
        if (k!=0) System.out.println("Число простое!");


    }
}
