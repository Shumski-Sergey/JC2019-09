package nbogdan.Lesson6.Task1;

class Timer {
    private int hour, minute, second;
    private static final int CONVERTER = 60;
    Timer(int hour, int minute, int second) {
        this.hour = (hour < CONVERTER) ? hour : CONVERTER - 1;
        this.minute = (minute < CONVERTER) ? minute : CONVERTER - 1;
        this.second = (second < CONVERTER) ? second : CONVERTER - 1;
    }
    Timer(int second) {
        this.second = second % CONVERTER;
        this.minute = ((second - this.second) / CONVERTER) % CONVERTER;
        this.hour = ((second - this.second) / CONVERTER) / CONVERTER;
    }
    void writeFullTime() {
        System.out.printf("\n%d ч, %d мин, %d с.\n", this.hour, this.minute, this.second);
    }
    void writeToSec() {
        System.out.printf("\n%d с.\n", convertToSec());
    }
    private int convertToSec() {
        return (second + CONVERTER * (minute + (hour * CONVERTER)));
    }
    int compareTo(Timer o) {
        return Integer.compare(this.convertToSec(), o.convertToSec());
    }
}
