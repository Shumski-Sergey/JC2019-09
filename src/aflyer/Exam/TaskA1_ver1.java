package aflyer.Exam;
//Найти в массиве чисел элементы с наибольшим и наименшим значениями. Вывести эти 2 элемента на экран, а также посчитать
//и вывести сумму всех остальных элементов. (min и max в сумму не входят)

import aflyer.Methods.ArrayRandomizer;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.abs;


public class TaskA1_ver1 {
    private static final int BYTE_MAXVALUE = Byte.MAX_VALUE;
    public static void main ( String[] args ) {
        Random r = new Random();
        int range = abs(r.nextInt(BYTE_MAXVALUE));
        int size = abs(r.nextInt(BYTE_MAXVALUE));
        ArrayList list = ArrayRandomizer.newArrayList(size,range);
        int max = ArrayRandomizer.FindMax(list);
        int min = ArrayRandomizer.FindMin(list);
        int sum = ArrayRandomizer.GetSum(list);
        System.out.println("Минимальное значение " + min);
        System.out.println("Максимальное значение " + max);
        System.out.println("Сумма без границ "+ (sum-min-max));



    }
}
