package nsivko.lab6;

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

        sravn(alls1, alls2);

    }
    public static void sravn(int time1, int time2) {

        if(time1 > time2) {
            System.out.print("\nПромежуток времени " + time1 + " больше промежутка времени " + time2);
        }

        if(time1 < time2) {
            System.out.print("\nПромежуток времени " + time2 + " больше промежутка времени " + time1);
        }

        if(time1 == time2) {
            System.out.print("\nПромежуток времени " + time1 + " равен промежутку времени " + time2);
        }

    }

}

class PeriodOfT {
    int hours;
    int minutes;
    int second;
    int allsec;

    PeriodOfT(int ch, int min, int sec) {
        this.hours = ch;
        this.minutes = min;
        this.second = sec;
    }

    PeriodOfT(int s) {

        this.allsec = s;
    }

    public int allSec () {
        int seсond = hours * 3600 + minutes * 60 + second;
        return seсond;
    }

    void zapHMS(int t1, int t2, int t3) {
        System.out.print(t1 + " ч " + t2 + " мин " + t3 + " сек");
    }

    void zapS(int t1) {
        System.out.print(t1 + " сек");
    }

}

