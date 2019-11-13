package stitov.Lesson6.Timer;

public class Main {
    public static void main(String[] args) {
        Timer t1 = new Timer(32);
        Timer t2 = new Timer(34, 45, 3);
        //TODO out this please
        int compare = t1.compareTo(t2);
        t2.showTimeInSeconds();
        t1.showTimeInSeconds();
        System.out.println(t2.getTimeInSeconds());
    }
}
