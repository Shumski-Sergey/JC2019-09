package nsivko.lab5;

import java.util.Scanner;

public class TaskSBR3 {
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
        int vdl = 0;
        int[] dl = new int[n];
        for (int i = 0; i < n; i++){
            dl[i] = stroki[i].length();
            vdl += dl[i];
        }
        double sr_dl = (double) vdl / n;
        System.out.println("Средняя длина строки равна " + sr_dl);
        System.out.println("\nСтроки, длины которых меньше средней длины:");
        for(int i = 0; i < n; i++){
            if (stroki[i].length() < sr_dl) System.out.println("Строка " + "\"" + stroki[i] + "\"" + ", её длина равна " + stroki[i].length());
        }
        System.out.println("\nСтроки, длины которых больше средней длины:");
        for(int i = 0; i < n; i++){
            if (stroki[i].length() > sr_dl) System.out.println("Строка " + "\"" + stroki[i] + "\"" + ", её длина равна " + stroki[i].length());
        }

    }
}
