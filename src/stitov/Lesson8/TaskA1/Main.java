package stitov.Lesson8.TaskA1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Integer[] array1 = new Integer[5];
        String[] array2 = new String[5];
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Input 5 elements of Integer array");
        for (int i = 0; i<5;i++){
            array1[i] = sc1.nextInt();
        }
        AnyArray anyArray1 = new AnyArray(array1);
        System.out.println("Input 5 elements of String array");
        for (int i = 0; i<5;i++){
            array2[i] = sc2.next();
        }
        AnyArray anyArray2 = new AnyArray(array2);
        System.out.println("Input index");
        int index = sc1.nextInt()-1;
        System.out.println((index+1) +" element in Integer array = "+anyArray1.getValue(index));
        System.out.println((index+1) +" element in String array = "+anyArray2.getValue(index));
    }
}
