package kushakov.Lesson8;

import java.util.ArrayList;
import static kushakov.Lesson8.sOs.createrandomArrayslist;

public class TaskA2 {
    public static void main(String[] args) {
        int arrayListLength = 100;
        int max = 10;
        int min = 0;
        ArrayList<Integer> randomNum = createrandomArrayslist(arrayListLength, min, max);
        System.out.println(randomNum);


    }
}