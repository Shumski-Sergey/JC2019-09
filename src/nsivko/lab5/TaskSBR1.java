package nsivko.lab5;

import java.util.Scanner;

public class TaskSBR1 {
    public static void main(String[] args) {
            System.out.println("Введите количество строк: ");
            Scanner kolst = new Scanner(System.in);
            int n = kolst.nextInt();
            System.out.println("Введите строки: ");
            Scanner str = new Scanner(System.in);
            String[] stroki = new String[n];
            for(int i = 0; i < n; i++){
                stroki[i] = str.nextLine();
            }
            int min = stroki[0].length(), max = stroki[0].length();
            for (int i = 1; i < n; i++){
                if( min > stroki[i].length()) min = stroki[i].length();
                if( max < stroki[i].length()) max = stroki[i].length();
            }
        System.out.println("Самая(-ые) короткая(-ие) строка(-и): ");
            for(int i = 1; i < n; i++){
                if(min == stroki[i].length()){
                    System.out.println(stroki[i]);
                }
            }
        System.out.println("И её(их) длина равна " + min);
        System.out.println("Самая(-ые) длинная(-ые) строка(-и): ");
        for(int i = 1; i < n; i++){
            if(max == stroki[i].length()){
                System.out.println(stroki[i]);
            }
        }
        System.out.println("И её(их) длина равна " + max);
        }
    }

