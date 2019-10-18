package nsivko.lab6.Task1;

public class PeriodOfT {
    int hours;
    int minutes;
    int second;
    int allSec;

    PeriodOfT(int ch, int min, int sec) {
        this.hours = ch;
        this.minutes = min;
        this.second = sec;
    }

    PeriodOfT(int s) {
        this.allSec = s;
    }


    Integer allSec () {
        int seсond = hours * 3600 + minutes * 60 + second;
        return seсond;
    }

    int likeCompareTo(PeriodOfT time2) {
        return (this.allSec() < time2.allSec()) ? -1 :
                ((this.allSec().equals(time2.allSec())) ? 0 : 1);
    }

    void zapHMS(int t1, int t2, int t3) {
        System.out.print(t1 + " ч " + t2 + " мин " + t3 + " сек");
    }

    void zapS(int t1) {
        System.out.print(t1 + " сек");
    }

    void text(int t){
        if (t == 1) {
            System.out.print("\nПервый промежуток времени больше второго");
        } else if (t == 0) {
            System.out.print("\nПервый промежуток времени равен второму");
        } else System.out.print("\nПервый промежуток времени меньше второго");
    }

}
