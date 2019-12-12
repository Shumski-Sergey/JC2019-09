package akhrapskaya.NewKR;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стороку");
        String str = sc.nextLine();
        putOutCountSum(str);
    }

    private static void putOutCountSum(String str) {
        int count = 0;
        int sum = 0;
        char[] chars = str.toCharArray();
        for(char c: chars){
            if(c >='0' && c <= '9'){
                count++;
                System.out.print(c + " ");
                sum+= c- '0';
            }
        }
        System.out.println("Количество:" + count);
        System.out.println("Сумма:" + sum);
    }
}
