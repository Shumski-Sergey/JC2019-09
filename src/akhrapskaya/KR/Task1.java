package akhrapskaya.KR;


import java.util.Arrays;
import java.util.IntSummaryStatistics;


public class Task1 {
    private  static final int[] ARRAY = {20, 20, 25, 60, -52, -30, 102, -4};

    public static void  main(String[] args){
       IntSummaryStatistics stats = Arrays.stream(ARRAY)
                .summaryStatistics();
        System.out.println("Max = " + stats.getMax());
        System.out.println("Min = " + stats.getMin());
        System.out.println("Сумма остальных элементов:" + (stats.getSum()-stats.getMax()-stats.getMin()));
    }

}
