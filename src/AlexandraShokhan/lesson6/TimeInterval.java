package AlexandraShokhan.lesson6;

public class TimeInterval {

    int seconds;
    int minutes;
    int hours;

    // Конструктор 1
    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    // Конструктор 2
    public TimeInterval(int seconds) {
        this.seconds = seconds;
    }

    // Метод, который возвращает общее количество секунд
    Integer getTimeInSec() {
        int totalTimeInSec = seconds + (minutes * 60) + ((hours * 60) * 60);
        return totalTimeInSec;
    }

    void printTime() {
        int h = this.getTimeInSec() / 3600;
        int m = (this.getTimeInSec() - h * 3600) / 60;
        int s = this.getTimeInSec() - h * 3600 - m * 60;
        System.out.println(h + " hours, " + m + " minutes, " + s + " seconds.");
    }
}
