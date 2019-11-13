package stitov.Lesson6.Timer;


public class Timer {
    private static final int SECOND = 60;
    private static final int MINUTE = 60;
    private Long seconds;
    private Long minutes;
    private Integer hours;

    private Long getSeconds() {
        return seconds;
    }

    public Long getMinutes() {
        return minutes;
    }

    public Integer getHours() {
        return hours;
    }

    public void setSeconds(long sec) {
        this.seconds = sec;
    }

    public void setMinutes(long min) {
        this.minutes = min;
    }

    public void setHours(int h) {
        this.hours = h;
    }

    private void setTimeInSeconds(long sec) {
        if (sec < 0) {
            System.out.println("Введено некорректное время");
        } else {
            wcSecondsConverter(sec);
        }
    }

    private void wcSecondsConverter(long sec) {
        long temp;
        temp = (sec - sec % (SECOND * MINUTE)) / (SECOND * MINUTE);
        this.hours = (int) temp;
        temp = sec % (SECOND * MINUTE);
        this.minutes = (temp - temp % SECOND) / SECOND;
        this.seconds = temp % 60;
    }

    public void showTime() {
        System.out.println(this.hours + " hours " + this.minutes + " minutes " + this.seconds + " seconds");
    }

    void showTimeInSeconds() {
        long sec = getTimeInSeconds();
        System.out.println(sec + " seconds");
    }

    long getTimeInSeconds() {
        return (this.hours * SECOND * MINUTE + this.minutes * SECOND + this.seconds);
    }

    int compareTo(Timer t) {
        return (this.getSeconds() < t.getSeconds()) ? -1 :
                ((this.getSeconds().equals(t.getSeconds())) ? 0 : 1);
    }

    Timer(long sec, long min, int h) {
        this.hours = h;
        this.minutes = min;
        this.seconds = sec;
    }

    Timer(long sec) {
        this.setTimeInSeconds(sec);
    }
}
