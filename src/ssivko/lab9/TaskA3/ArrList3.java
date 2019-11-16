package ssivko.lab9.TaskA3;

import java.util.ArrayList;
import static ssivko.Ulils.*;

public class ArrList3 {
    public static void main(String[] args) {
        System.out.println("Ввведите количество оценок: ");
        int size = entryNumber();

        ArrayList<Integer> rating = new ArrayList<>();
        RandomMethod(rating, size);
        System.out.println("Список оценок: ");

        printRating(rating);
        iteratorMethod(rating);

        System.out.println("\nСамая высокая оценка: " +iteratorMethod(rating));
    }

}
