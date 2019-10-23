package ssivko.lab6.Time;

import java.util.Scanner;


public class Clock {
    public static void main(String[] args) {

        System.out.println("Введите с клавиатуры промежуток времени: часы, минуты, секунды.");
        Scanner proba1 = new Scanner(System.in);
        int h1 = proba1.nextInt();
        int m1 = proba1.nextInt();
        int s1 = proba1.nextInt();
        System.out.println("Вы ввели: "+ h1 + " ч "+ m1 + " мин " + s1 + " сек");

        NewTime time1 = new NewTime(h1, m1, s1);
        System.out.println("Cекунд: ");
        System.out.println(time1.allsecond());

        System.out.println("Введите с клавиатуры промежуток времени: часы, минуты, секунды.");
        Scanner proba2 = new Scanner(System.in);
        int h2 = proba2.nextInt();
        int m2 = proba2.nextInt();
        int s2 = proba2.nextInt();
        System.out.println("Вы ввели: "+ h2 + " ч "+ m2 + " мин " + s2 + " сек");

        NewTime time2 = new NewTime(h2, m2, s2);
        System.out.println("Cекунд: ");
        System.out.println(time2.allsecond());

        System.out.println("Результат сравнения: " + time1.compareTo(time2));

        int r = time1.compareTo(time2);



    }

}
