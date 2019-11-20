package ilyaSakalouski.K_R_20_11_19.Task_1;

import java.util.ArrayList;
import java.util.Collections;
import static ilyaSakalouski.Different_Utility.UtilityForCollections.GetRandArr;

public class MinMaxValues {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList;
        arrayList = GetRandArr(5,10);
        System.out.println(arrayList);
        System.out.println(Collections.max(arrayList));
        System.out.println(Collections.min(arrayList));

        arrayList.remove(Collections.max(arrayList));
        arrayList.remove(Collections.min(arrayList));

        int sum = arrayList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
