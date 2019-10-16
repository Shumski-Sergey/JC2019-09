package tereshko.Lesson6;

import java.util.Objects;

public class Time {
    private Integer seconds;
    private Integer min;
    private Integer hours;

    public Time(int sec, int min, int hr) {
        this.seconds = sec;
        this.min = min;
        this.hours = hr;
    }

    public Time(int sec) {
        this.seconds = sec;
    }

    public int getFullSeconds() {
        int fullseconds;
        fullseconds = (this.hours * 3600) + (this.min * 60) + this.seconds;
        return fullseconds;
    }

    public void Compare(Time Two) {
        if (this.seconds.compareTo(Two.seconds) == 0) System.out.println("They are equals");
        else if (this.seconds.compareTo(Two.getFullSeconds())>0) System.out.println("Thirst Bigger than second");
        else System.out.println("Thirst Smaller than second" );
    }
    public void getInfo(){
        System.out.println(this.seconds+" "+this.min+" "+this.hours);
    }
}
