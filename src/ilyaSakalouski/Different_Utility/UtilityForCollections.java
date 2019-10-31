package ilyaSakalouski.Different_Utility;

import java.util.ArrayList;
import java.util.Random;

public class UtilityForCollections
{
    // This method return new random ArrayList <Integer> (Size, MaxValue):
    public static ArrayList<Integer> GetRandArr(int Size, int MaxValue)
    {
       ArrayList<Integer> randArr = new ArrayList<>();
        for (int i = 0; i < Size; i++)
        {
            int a = (int) (Math.random() * MaxValue + 1);
            randArr.add(a);
        }
        return randArr;
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
