package zyahya.lesson2;

public class ProblemFullNum {

    public static boolean IsSimple(int value)
    {
        for (int i = 2; i < value; i++)
        {
            if (value % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(IsSimple(11));
    }
}
