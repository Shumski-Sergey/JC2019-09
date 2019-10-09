package stitov.Lesson2.Lesson4;
import java.util.Scanner;
public class Task2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array[] = new int[50];
        System.out.println("Введите количество элементов");
        int a = in.nextInt();
        System.out.println("Введите " + a + " элементов");
        for (int i = 0; i < a; i++) {
            array[i] = in.nextInt();
        }
        int maxvalue = array[0];
        int maxindex = 0;
        if (a > 1) {
            for (int i = 1; i < a; i++) {
                if (array[i]>maxvalue){
                    maxvalue = array[i];
                }
            }
            for (int i = 0; i<a;i++){
                if (array[i]==maxvalue){
                    maxindex = i;
                    break;
                }
            }
        }
        System.out.println("Максимальный элемент "+ maxvalue+" находится на " + (maxindex+1)+" месте");

        }
}