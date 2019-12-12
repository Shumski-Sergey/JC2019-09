package nsivko.lab17.task1;

import java.util.*;
import static nsivko.lab17.task1.Library.*;

public class Task1 {
    public static void main(String[] args) {

        HashMap<Integer, String> books1 = createBooks();
        System.out.print("Cколько будет посетителей библиотеки? ");
        Scanner n = new Scanner(System.in);
        int numberPeople = n.nextInt();
        for (int i = 1; i <= numberPeople ; i++){
            getIntegerStringHashMap(books1, i);
        }
    }


}
