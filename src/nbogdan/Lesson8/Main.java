package nbogdan.Lesson8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String hui;
        int a;
        Random r = new Random();
        for(int i = 0; i < 9; i++) {
            a = r.nextInt(50000);
            if (a % 2 == 0) {
            hui = "Да";
        } else {
            hui = "Нет";
        }
        System.out.println(hui);
        }
    }
}
