package ilyaSakalouski.Different_Utility;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class UtilityForCollections
{
    // This method return new random ArrayList <Integer> (Size, MaxValue):
    public static ArrayList<Integer> GetRandArr(int Size, int MaxValue)
    {
       ArrayList<Integer> randArrList = new ArrayList<>();
        for (int i = 0; i < Size; i++)
        {
            int a = (int) (Math.random() * MaxValue);
            randArrList.add(a);
        }
        return randArrList;
    }

    // This method return new random ArrayList <Integer> (Size, MaxValue):
    public static LinkedList<Integer> GetRandLink(int Size, int MaxValue)
    {
        LinkedList<Integer> randLinList2 = new LinkedList<>();
        for (int i = 0; i < Size; i++)
        {
            int a = (int) (Math.random() * MaxValue);
            randLinList2.add(a);
        }
        return randLinList2;
    }

    // This method chose random value from List<Integer> n-times:
    public static void getRandomElements(List<Integer> collectList, int nTimes) {
        Random getRandom = new Random();
        for (int i = 1; i <= nTimes; i++) {
            collectList.get(getRandom.nextInt(collectList.size()));
        }
    }

    // This method return set of the random numbers from min to max:
    public static int getRandomNumber(int min, int max)
    {
        if (min >= max)
            throw new IllegalArgumentException(" MAX must be greater than MIN !!!");

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
