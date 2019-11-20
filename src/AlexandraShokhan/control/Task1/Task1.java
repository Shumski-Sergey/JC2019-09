package AlexandraShokhan.control.Task1;

import java.util.ArrayList;
import java.util.Collections;

import static AlexandraShokhan.Utils.createRandomArrayList;

public class Task1 {
    static final int LENGTH = 10;
    static final int MIN_VALUE = 0;
    static final int MAX_VALUE = 10;
    public static void main(String[] args) {
        ArrayList<Integer> listOfRandomNumbers = createRandomArrayList(LENGTH, MIN_VALUE, MAX_VALUE);
        int maxValueInArray = Collections.max(listOfRandomNumbers);
        System.out.println("The max value in the array is " + maxValueInArray + ".");
        listOfRandomNumbers.remove(listOfRandomNumbers.indexOf(maxValueInArray));

        int minValueInArray = Collections.min(listOfRandomNumbers);
        System.out.println("The min value in the array is " + minValueInArray + ".");
        listOfRandomNumbers.remove(listOfRandomNumbers.indexOf(minValueInArray));

        int totalSum = getSum(listOfRandomNumbers);

        System.out.println("The total sum of the elements without min & max is " + totalSum + ".");
    }

    public static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }
}
