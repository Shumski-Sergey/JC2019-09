package yKuzMinskij.Lab4.TasksArrays;
    /**
     * Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
     * */
import java.util.Scanner;

public class TaskA3 {
    public static void main (String[] args) {
        outArray(arrayCreating(sizeMaker()));
    }
    public static int[] arrayCreating(int[] arr1){
        int s = arr1[0];
        int size = arr1[1];
        int [] numsArray = new int[size];
        for (int i=0; i<numsArray.length; i++){
            numsArray[i]=s;
            s-=5;
        }
        return numsArray;
    }
    public static int[] sizeMaker(){
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int size = s/5;
        int [] arr1 = {s, size};
        return arr1;
    }
    public static void outArray (int [] numsArray){
        for (int i=0; i<numsArray.length; i++) {
            System.out.print(numsArray[i] + " ");
        }
    }

}
