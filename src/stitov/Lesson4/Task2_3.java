package stitov.Lesson4;
import java.util.Scanner;
import java.util.Random;
public class Task2_3 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива");
        int a  = in.nextInt();
        Random rnd = new Random();
        int array[] = new int[a];
        for (int i =0; i<a;i++){
        array[i] = rnd.nextInt(100);
        System.out.print(array[i]+ " ");
        }
        System.out.println();
        int middle = (a - a%2)/2;
        int tmp;
        for (int i =0; i<middle;i++){
            tmp = array[i];
            array[i] = array[a-1-i];
            array[a-1-i] = tmp;
        }
        for (int i: array){
            System.out.print(i+" ");
        }

    }
}
