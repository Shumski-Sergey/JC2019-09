package stitov.Lesson2.Lesson6.Timer;


public class Timer {
    public static final int SECOND = 60;
    public static final int MINUTE = 60;
    private long seconds;
    private long minutes;
    private int hours;

    public long getSeconds(){return seconds;}
    public long getMinutes() {return minutes;}
    public int getHours() {return hours;}
    public void setSeconds (long sec) {this.seconds=sec;}
    public void setMinutes (long min) {this.minutes=min;}
    public void setHours (int h) {this.hours = h;}
    public void setTimeInSeconds (long sec){
        if (sec <0) {
            System.out.println("Введено некорректное время");
        } else {
            long temp;
            temp = (sec-sec%(SECOND*MINUTE))/(SECOND*MINUTE);
            this.hours = (int) temp;
            temp = sec%(SECOND*MINUTE);
            this.minutes = (temp-temp%SECOND)/SECOND;
            this.seconds = temp%60;
        }
    }
    public void showTime(){
        System.out.println(this.hours + " hours " + this.minutes + " minutes " + this.seconds+" seconds");
    }
    public void showTimeInSeconds(){
        long sec = getTimeInSeconds();
        System.out.println(sec + " seconds");
    }
    public long getTimeInSeconds () {
        return (this.hours*SECOND*MINUTE + this.minutes*SECOND + this.seconds);
    }
    public int compareTo (Timer t){
        long thisTime = this.getTimeInSeconds();
        long otherTime = t.getTimeInSeconds();
        if (thisTime < otherTime){
            return -1;
        } else if (thisTime == otherTime){
            return 0;
        } else {
            return 1;
        }
    }
    public Timer () {
        this.seconds = 0;
        this.minutes = 0;
        this.hours = 0;
    }
    public Timer (long sec, long min, int h) {
        this.hours = h;
        this.minutes = min;
        this.seconds = sec;
    }
    public Timer (long sec) {
        this.setTimeInSeconds(sec);
    }
}
