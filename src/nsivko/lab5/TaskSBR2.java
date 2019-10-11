package nsivko.lab5;

import java.util.Scanner;

public class TaskSBR2 {
    public static void main(String[] args) {
        System.out.println("Введите количество строк: ");
        Scanner kolst = new Scanner(System.in);
        int n = kolst.nextInt();
        System.out.println("Введите строки: ");
        Scanner str = new Scanner(System.in);
        String[] strokimin = new String[n];
        String[] strokimax = new String[n];
        for(int i = 0; i < n; i++){
            strokimin[i] = str.nextLine();
        }
        for(int i = 0; i < n; i++){
            strokimax[i] = strokimin[i];
        }

        for (int i = strokimin.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++) {
                if (strokimax[j].length() > strokimax[j + 1].length()) {
                    String temp1 = strokimax[j];
                    strokimax[j] = strokimax[j + 1];
                    strokimax[j + 1] = temp1;
                }
                if (strokimin[j].length() < strokimin[j + 1].length()) {
                    String temp2 = strokimin[j];
                    strokimin[j] = strokimin[j + 1];
                    strokimin[j + 1] = temp2;
                }
            }
        }
        System.out.println("Строки в порядке убывания: ");
        for (int j = 0; j < n; j++){
            System.out.println(strokimin[j]);
        }
        System.out.println("Строки в порядке возрастания: ");
        for (int j = 0; j < n; j++){
            System.out.println(strokimax[j]);
        }
    }
}
