package vtafeliuk.Lesson6.Intervals;

public class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time (int seconds){
        this.seconds = seconds;
    }

    int intervalInSeconds () {
        this.seconds = seconds + minutes*60 + hours*3600;
        return this.seconds;
    }

    void showTimeInSec(){
        System.out.println("Время в секундах: " + this.seconds);

    }
    void showTimeAsUsual(){
        int h = this.seconds/3600;
        int m = (this.seconds%3600)/60;
        int sec = (this.seconds%3600)%60;
        System.out.println( h + " часов " + m + " минут " + sec + " секунд");
    }
}
