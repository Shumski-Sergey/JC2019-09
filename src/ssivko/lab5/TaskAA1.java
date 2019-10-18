package ssivko.lab5;

import java.util.Scanner;

public class TaskAA1 {
    public static void main(String[] args) {
        Scanner srt = new Scanner(System.in);
        System.out.println("Введите количество строк : ");
        int col = srt.nextInt();
        System.out.println("Введите строки: ");
        Scanner stroki = new Scanner(System.in);
        String[] mas_stroki = new String[col];
        for(int i = 0; i < col; i++){
            mas_stroki[i] = stroki.nextLine();
            System.out.println(mas_stroki[i]);
        }
        int min = mas_stroki[0].length(), max = mas_stroki[0].length();
        for (int i = 1; i < col; i++){
            if( min > mas_stroki[i].length()) min = mas_stroki[i].length();
            if( max < mas_stroki[i].length()) max = mas_stroki[i].length();
        }
        System.out.println("Минимальная длинна строки имеет : "+min + " символов. " + " Максимальная строка имеет : " + max + " символов.");
        for(int i = 1; i < col; i++) {
            if (min == mas_stroki[i].length()) {
                System.out.println(mas_stroki[i]+" Мin");
            }
        }
        for(int i = 1; i < col; i++) {
            if (max == mas_stroki[i].length()) {
                System.out.println(mas_stroki[i]+" Max");
            }
        }

    }
}
/* for (int a=1; a<col; a++){
            for (int b=col-1;b>=a; b--){
                   if (mas_stroki[b-1]>mas_stroki[b]){
                    int t = mas_stroki[b-1];
                   mas_stroki[b-1] = mas_stroki[b];
                  mas_stroki[b] = t;

                }
            }
        }*/