package Tereshko.Lesson4.New;

import java.util.Random;

public class Test3 extends Search {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numb = new int[10];
        int sum = 0;
        for (int i = 0; i < numb.length; i++) {
            numb[i] = random.nextInt(20);
            searchDuplicate(numb);
            System.out.println(numb[i]);
        }
        for (int i = 0; i < numb.length; i++) {
            for (int j = numb.length - 1; j > i; j--) {
                if (numb[j] < numb[j - 1]) {
                    int wc;
                    wc = numb[j - 1];
                    numb[j - 1] = numb[j];
                    numb[j] = wc;
                }
            }
        }
    }
}
