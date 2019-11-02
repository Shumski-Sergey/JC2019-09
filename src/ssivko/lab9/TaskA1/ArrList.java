package ssivko.lab9.TaskA1;

import java.util.ArrayList;
import static ssivko.Ulils.*;

public class ArrList {
    public static void main(String[] args) {
        System.out.println("Ввведите количество оценок: ");
        int size = entryNumber();

        ArrayList<Integer> rating = new ArrayList<>();
        System.out.println("Список оценок: ");
        RandomMethod(rating, size);

        printRating(rating);

        deleteElement(rating);
        System.out.println("\nСписок положительных оценок: ");
        printRating(rating);
    }
}
