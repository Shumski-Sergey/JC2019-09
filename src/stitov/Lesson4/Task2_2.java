package stitov.Lesson4;
import java.util.Scanner;

public class Task2_2 {
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
        int minvalue = array[0];
        int maxindex = 0;
        int minindex = 0;
        int flag = 0;
        int sum = 0;
        if (a > 1) {
            for (int i = 1; i < a; i++) {
                if (array[i] > maxvalue) {
                    maxvalue = array[i];
                }
                if (array[i] < minvalue) {
                    minvalue = array[i];
                }
            }
            for (int i = 0; i<a; i++){
                if (flag>0){
                    sum+=array[i];
                }
                if ((flag==0) && (array[i] == maxvalue || array[i]==minvalue)){
                    if (array[i]==maxvalue) {
                        flag = 1;
                        sum += array[i];
                        continue;
                    }
                    if (array[i]==minvalue){
                        flag = 2;
                        sum += array[i];
                        continue;
                    }
                }
                if ((flag==2) && (array[i] == maxvalue)){
                    flag =0;
                    break;
                }
                if (flag==1 && array[i]==minvalue){
                    flag =0;
                    break;
                }
            }
            System.out.println("sum = "+sum);
        } else {
            System.out.println(array[0]);
        }
        System.out.print("Min = "+minvalue+" max = "+maxvalue);
    }
}
