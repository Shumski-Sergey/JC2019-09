package dmikulionak.lesson_5;

import java.util.Scanner;

public class task1 {
    public static void main (String[] args) {
        int x;
        String[] str;
        Scanner in = new Scanner (System.in);
        System.out.println("Введите кол-во строк");
        x = Integer.parseInt (in.nextLine ());
        int max = 0;
        int min = 0;
        str = new String[x];
        System.out.println("Введите текст");
        for (int i = 0; i < x; i++) {
            str[i] = in.nextLine ();
            if (str[i].length () <= str[min].length ())
                min = i;
            if (str[i].length () >= str[max].length ())
                max = i;
        }
        System.out.println("Короткая : " + "index - " + min + "; " + "text : " + str[min]);
        System.out.println("Длинная : " + "index - " + max + "; " + "text : " + str[max]);
    }
}
