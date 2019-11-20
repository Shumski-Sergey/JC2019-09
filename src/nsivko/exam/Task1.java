package nsivko.exam;

import java.util.ArrayList;
import static nsivko.exam.utils.getMassiveNumbers;
import static nsivko.exam.utils.printMinMaxSum;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> massiveNumber = getMassiveNumbers();
        int max = massiveNumber.stream().max(Integer::compare).get();
        int min = massiveNumber.stream().min(Integer::compare).get();
        int sum = 0;
        for (Integer n : massiveNumber) {
            if (n != min && n != max) {
                sum += n;
            }
        }
        printMinMaxSum(max, min, sum);
    }
}
