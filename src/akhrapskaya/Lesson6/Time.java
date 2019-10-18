package akhrapskaya.Lesson6;

public class Time {
    private int sec, min, h;
    private final int k = 60;

    private Time(int h, int min, int sec){
        this.h = h;
        this.min = min;
        this.sec = sec;
    }
    private Time(int sec){
        h = sec/(k*k);
        sec = sec%(k*k);
        min = sec/k;
        this.sec = sec%k;
    }
    private int allInSec(){
        return sec+(min*k)+(h*k*k);
    }
    private void putOut(){
        System.out.println(h + ":" + min + ":" + sec);
    }
    private void putOutSec(){
        System.out.println( allInSec() + " секунд");
    }
    private int compareTime(Time ob){
        int i = 0;
        if( allInSec() > ob.allInSec())
            i = 1;
        if (allInSec() < ob.allInSec())
            i = -1;
        return i;
    }
    public static void  main(String[] args){
        Time t1 = new Time(3620);
        Time t2 = new Time(1, 0, 60);
        t1.putOut();
        t2.putOutSec();
        System.out.println("Сравниваем T1 и T2:");
        if (t1.compareTime(t2) == 0)
            System.out.println("Промежутки равны.");
        else if(t1.compareTime(t2) == -1)
                System.out.println("Второй промежуток больше.");
            else System.out.println("Первый промежуток больше.");

    }

}
