package ilyaSakalouski.lesson_9;

import java.util.ArrayList;
import java.util.LinkedList;
import static ilyaSakalouski.Different_Utility.UtilityForCollections.*;

public class A4
{
    private static final int MILLION = 1000000;
    private static final int TEN_THOUSAND = 10000;
     
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList;
        arrayList = GetRandArr(MILLION,TEN_THOUSAND);

        LinkedList<Integer> linkedList;
        linkedList = GetRandLink(MILLION,TEN_THOUSAND);

        long startArrTime = System.currentTimeMillis();
        getRandomElements(arrayList,TEN_THOUSAND);
        long endArrTime = System.currentTimeMillis();
        long ArrTime = endArrTime - startArrTime;
        System.out.println("Time for ArrayList: " + ArrTime + "ms");

        long startLinkTime = System.currentTimeMillis();
        getRandomElements(linkedList,TEN_THOUSAND);
        long endLinkTime = System.currentTimeMillis();
        long LinkTime = endLinkTime - startLinkTime;
        System.out.println("Time for LinkedList: " + LinkTime + "ms");
    }
}
