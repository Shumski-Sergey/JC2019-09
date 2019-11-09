package stitov.Lesson5;
import java.util.Scanner;
public class Task2_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int stringnumber = in.nextInt();
        String stringarray[] = new String[stringnumber];
        System.out.println("Вводите строки");
        stringarray= inputstrings(stringnumber);
        int stringlength[] = new int[stringnumber];
        for (int i = 0; i<stringnumber;i++){
            stringlength[i] = stringarray[i].length();
        }
        sort(stringarray,stringlength);
        for (String i : stringarray) {
            System.out.println(i);
        }
    }
    public static String[] sort (String[] stringarray, int[] stringlength){
        int minvalue;
        int minindex, tmpint;
        String tmpstr;
        for (int i = 0; i< stringlength.length; i++){
            minvalue =  stringlength[i];
            minindex = i;
            for (int j = i; j<stringlength.length;j++){
                if (stringlength[j]<minvalue){
                    minvalue = stringlength[j];
                    minindex = j;
                }
            }
            tmpint = stringlength[i];
            stringlength[i] = stringlength[minindex];
            stringlength[minindex] =tmpint;
            tmpstr = stringarray[i];
            stringarray[i] = stringarray[minindex];
            stringarray[minindex] = tmpstr;
        }
        return stringarray;
    }
    public static String[] inputstrings (int length){
        String stringarray[] = new String[length];
        Scanner in1 = new Scanner(System.in);
        int stringlength[] = new int[length];
        for (int i = 0; i<length;i++){
            stringarray[i] = in1.nextLine();
        }
        return stringarray;
    }

}
