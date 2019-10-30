package vtafeliuk.Lesson6.Intervals;

public class CheckTime {
    public static void main(String[] args) {
        Time usualTime = new Time(0, 2, 12);
        Time inSecondsTime = new Time(100);

        System.out.println(usualTime.intervalInSeconds() + " секунд");
        inSecondsTime.showTimeAsUsual();

    }
}
//доделать