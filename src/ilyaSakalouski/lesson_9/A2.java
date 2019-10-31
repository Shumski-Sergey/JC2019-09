package ilyaSakalouski.lesson_9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import static ilyaSakalouski.Different_Utility.UtilityForCollections.GetRandArr;

public class A2
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList;
        arrayList = GetRandArr(15,10);  // ДОБАВЛЮ ЕЩЁ SCANNER C ПРОВЕРКОЙ.
        System.out.println(arrayList);

        Set<Integer> set = new HashSet<>(arrayList);
        arrayList.addAll(set);
        System.out.println(set);
    }
}
