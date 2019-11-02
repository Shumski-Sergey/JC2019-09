package ssivko.lab9.TaskA2;

import java.util.ArrayList;
import static ssivko.Ulils.*;

public class ArrList2 {
    public static void main(String[] args) {
    System.out.println("Ввведите количество случайных чисел: ");
    int size = entryNumber();

    ArrayList<Integer> rating = new ArrayList<>();
    RandomMethod(rating, size);
    System.out.println("Список чисел: ");

    printRating(rating);

    deleteElement2(rating);
    System.out.println("\nСписок без повторов: ");
    printRating(rating);
}

}


