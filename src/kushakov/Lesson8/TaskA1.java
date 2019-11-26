package kushakov.Lesson8;

import java.util.ArrayList;
import static kushakov.Lesson8.sOs.createrandomArrayslist;

public class TaskA1 {
    public static void main(String[] args) {
        ArrayList<Integer> mark = new ArrayList<>();
        int arrayListLength = 10;
        int min = 0;
        int max = 10;
       mark =  createrandomArrayslist(arrayListLength, min, max);
        System.out.println("Оценки" + mark);
        for (int g = 0; g < 5; g++) {
            if (g > 5)
            System.out.println(g);
        }
    }
}