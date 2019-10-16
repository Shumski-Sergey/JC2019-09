package tereshko.Lesson6;

public class TestA1 {
    public static void main(String[] args) {
        Time thirst = new Time(3700);
        Time second = new Time(12,24,0);
        thirst.Compare(second);
        System.out.println(second.getFullSeconds());
        thirst.getInfo();
        second.getInfo();


    }

}
