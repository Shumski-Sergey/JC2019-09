package nsivko.lab6.Task1;

import java.util.Scanner;

public class PeriodOfTime {
    public static void main(String[] args) {

        System.out.println("Введите промежуток времени(сначала количество часов, затем минут, затем секунд): ");
        Scanner promez1 = new Scanner(System.in);
        int ch1 = promez1.nextInt();
        int min1 = promez1.nextInt();
        int sec1 = promez1.nextInt();

        System.out.println("Введите промежуток времени(сначала количество часов, затем минут, затем секунд): ");
        Scanner promez2 = new Scanner(System.in);
        int ch2 = promez2.nextInt();
        int min2 = promez2.nextInt();
        int sec2 = promez2.nextInt();

        PeriodOfT time1 = new PeriodOfT(ch1, min1, sec1);//  в виде часов, минут, секунд
        PeriodOfT time2 = new PeriodOfT(ch2, min2, sec2);

        int alls1 = time1.allSec();
        int alls2 = time2.allSec();

        PeriodOfT time11 = new PeriodOfT(alls1);// в виде секунд
        PeriodOfT time22 = new PeriodOfT(alls2);

        System.out.print("Наши промежутки времени:\n1. ");
        time1.zapHMS(ch1, min1, sec1);
        System.out.print("\n2. ");
        time2.zapHMS(ch2, min2, sec2);

        System.out.print("\nНаши промежутки времени:\n1. ");
        time1.zapS(alls1);
        System.out.print("\n2. ");
        time2.zapS(alls2);

        int comp = time1.likeCompareTo(time2);
        time11.text(comp);
    }


}


