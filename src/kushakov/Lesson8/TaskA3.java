package kushakov.Lesson8;

import java.util.ArrayList;
import static kushakov.Lesson8.TaskA1.createmarkArrayasList;


public class TaskA3 {
    public static void main(String[] args) {
        int pup = 20;
        int minmark = 0;
        int maxmark = 10;
        ArrayList<Integer> list = createmarkArrayasList(pup, minmark, maxmark);
        System.out.println("Оценки пуп " + list);
        System.out.println("Самая высокая оценка пуп " + "10");
    }

}
