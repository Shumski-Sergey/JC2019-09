package ssivko.lab5;

import java.util.Scanner;

public class TaskAA2 {
    public static void main(String[] args) {
        Scanner srt = new Scanner(System.in);
        System.out.println("Введите количество строк : ");
        int col = srt.nextInt();
        System.out.println("Введите строки: ");
        Scanner stroki = new Scanner(System.in);
        String[] min = new String[col];
        String[] max = new String[col];
        for(int i = 0; i < col; i++) {
            min[i] = stroki.nextLine();
        }
        for(int i = 0; i < col; i++){
                max[i] = min[i];
            }

            for (int i = min.length - 1; i > 0; i--){
                for(int j = 0; j < i; j++) {
                    if (max[j].length() > max[j + 1].length()) {
                        String temp1 = max[j];
                        max[j] = max[j + 1];
                        max[j + 1] = temp1;
                    }
                    if (min[j].length() < min[j + 1].length()) {
                        String temp2 = min[j];
                        min[j] = min[j + 1];
                        min[j + 1] = temp2;
                    }
                }
            }
            System.out.println("Строки в порядке убывания: ");
            for (int j = 0; j < col; j++){
                System.out.println(min[j]);
            }
            System.out.println("Строки в порядке возрастания: ");
            for (int j = 0; j < col; j++){
                System.out.println(max[j]);
            }
        }
}
