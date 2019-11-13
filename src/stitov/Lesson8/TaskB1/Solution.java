package stitov.Lesson8.TaskB1;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main (String[] args) throws Exception{
        int [] data = new int[]{1,2,3,5,-2,-8,0,77,5,5};
        Pair<Integer,Integer> result = getMinimumAndMaximum (data);
        System.out.println("Minimum is "+result.x);
        System.out.println("Maximum is "+ result.y);
    }
    private static Pair<Integer,Integer> getMinimumAndMaximum(int[] array){
        if (array==null || array.length==0){
            return new Pair<Integer, Integer>(null,null);
        } else {
            ArrayList<Integer> newArray = new ArrayList<>();
            Integer[] arrayInt = new Integer[array.length];
            for (int i= 0; i<array.length;i++){
                arrayInt[i] = array[i];
            }
            newArray = putOnArray(arrayInt);
            Collections.sort(newArray);
            return new Pair<Integer, Integer>(newArray.get(0),newArray.get(9));
        }
    }
    public static <T> ArrayList putOnArray (T[] array){
        ArrayList<T> newArray = new ArrayList<>();
        newArray.addAll(Arrays.asList(array));
        return newArray;
    }
    public static class Pair<X, Y>{
        public X x;
        public Y y;
        public Pair(X x, Y y){
            this.x = x;
            this.y = y;
        }
    }
}

