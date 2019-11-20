package nsivko.exam;

import java.util.ArrayList;
import java.util.HashMap;
import static nsivko.exam.utils.*;

public class Task3 {
    public static void main(String[] args) {
        Integer max = 0;
        ArrayList<Integer> massiveNumber = getMassiveNumbers();
        HashMap<Integer, Integer> numbers = getHashMap(massiveNumber);
        Integer[] key = getMassiveKey(numbers);
        max = searchMax(max, numbers);
        print(max, numbers, key);
    }
}
