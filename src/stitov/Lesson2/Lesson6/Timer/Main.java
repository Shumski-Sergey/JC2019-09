package stitov.Lesson2.Lesson6.Timer;

public class Main {
    public static void main (String[] args){
        Timer t1 = new Timer();
        Timer t2 = new Timer( 34, 45, 3);
        t1.setTimeInSeconds(50000);
        t1.showTime();
        t2.showTimeInSeconds();
        System.out.println(t1.compareTo(t2));
        long s = t2.getTimeInSeconds();
        System.out.println(s);

    }
}
