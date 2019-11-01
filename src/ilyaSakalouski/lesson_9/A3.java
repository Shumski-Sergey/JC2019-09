package ilyaSakalouski.lesson_9;

import java.util.ArrayList;
import java.util.Collections;
import static ilyaSakalouski.Different_Utility.UtilityForCollections.GetRandArr;

public class A3
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList;
        arrayList = GetRandArr(18,10);  // ДОБАВЛЮ ЕЩЁ SCANNER C ПРОВЕРКОЙ.
        System.out.println(arrayList);
        System.out.println("Max value in this ArrayList is: " + Collections.max(arrayList));
        // Я РАЗБЕРУСЬ С ИТЕРАТОРОМ И ПЕРЕДЕЛАЮ КОНЦОВКУ =)     ХОТЯ ТАК ПРОЩЕ ^
    }
}
