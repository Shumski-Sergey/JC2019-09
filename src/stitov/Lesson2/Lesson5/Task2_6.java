package stitov.Lesson2.Lesson5;
import java.util.Scanner;
import stitov.Lesson2.Lesson5.Task2_2;
public class Task2_6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество слов");
        int stringNumber = in.nextInt();
        String stringArray[] = new String[stringNumber];
        System.out.println("Вводите строки");
        stringArray= stitov.Lesson2.Lesson5.Task2_2.inputstrings(stringNumber);
        int asciiCode1, asciiCode2, flag;
        for (int i = 0; i< stringNumber;i++) {
            if (stringArray[i].length() == 1) {
                System.out.println("Первое слово с возрастающими символами: "+ stringArray[i]);
                break;
            } else {
                flag =1;
                for (int j = 1; j < stringArray[i].length(); j++) {
                    asciiCode1 = (int) stringArray[i].charAt(j);
                    asciiCode2 = (int) stringArray[i].charAt(j-1);
                    if (asciiCode1<asciiCode2) {
                        flag = 0;
                    }
                }
                if (flag==1){
                    System.out.println("Первое слово с возрастающими символами: "+ stringArray[i]);
                    break;
                }
            }
        }
    }
}
