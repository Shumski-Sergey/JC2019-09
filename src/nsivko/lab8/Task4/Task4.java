package nsivko.lab8.Task4;

import java.util.ArrayList;
import java.util.Arrays;
/* Задача по дженерикам +
Написать метод, который возвращает минимальное и максимальное числа в массиве.
*/

public class Task4
{
    public static void main(String[] args) throws Exception
    {
        Integer[] data = new Integer[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Maximum is " + result.y);

        createArrayList(data);
    }

    private static void createArrayList(Integer[] data) {
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < data.length; i++) {
        array.add(data[i]);
        }
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(Integer[] array)
    {
        if (array == null || array.length == 0)
        {
            return new Pair<Integer, Integer>(null, null);
        }

        int Min = array[0];
        int Max = array[0];

        for(int i = 0; i < array.length-1; i++) {
            if (Min > array[i+1]){
            Min = array[i+1];
            }
        }
        for(int i = 0; i < array.length-1; i++) {
            if (Max < array[i+1]){
                Max = array[i+1];
            }
        }

        return new Pair<Integer, Integer>(Min, Max);

        /*Arrays.sort(array);
        return new Pair<Integer, Integer>(array[0],array[9]);*/

    }

    public static class Pair<X, Y>
{
    public X x;
    public Y y;

    public Pair(X x, Y y)
    {
        this.x = x;
        this.y = y;
    }
}
}
