package kushakov.Lesson8;

import java.util.ArrayList;

import static kushakov.Lesson8.TaskA1.createmarkArrayasList;

public class TaskA2 {
    public static void main(String[] args) {
        int arrayListLength = 100;
        int max = 10;
        int min = 0;
        ArrayList<Integer> randomNum = createmarkArrayasList(arrayListLength,max,min);
        System.out.println(randomNum);


    }
}