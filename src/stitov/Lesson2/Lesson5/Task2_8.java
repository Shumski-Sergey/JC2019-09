package stitov.Lesson2.Lesson5;
import java.util.Scanner;
import stitov.Lesson2.Lesson5.Task2_2;
public class Task2_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int stringNumber = in.nextInt();
        String stringArray[] = new String[stringNumber];
        System.out.println("Вводите строки");
        stringArray = stitov.Lesson2.Lesson5.Task2_2.inputstrings(stringNumber);
        String numberArray[] = new String[stringNumber];
        numberArray = searchOnlyNumber(stringArray, stringNumber);
        if (numberArray[0].equals("N")){
            System.out.println("Среди слов отсутствуют слова только с цифрами");
        } else {
            int lengthNumberArray = realLength(numberArray,stringNumber);
            String palindromeArray[] = new String[lengthNumberArray];
            palindromeArray = searchPalindrome(numberArray, lengthNumberArray);
            int lengthPalindromeArray = realLength(palindromeArray, stringNumber);
            if (lengthPalindromeArray > 1) {
                System.out.println("Второй палиндром состоящий только из цифр: " + palindromeArray[1]);
            } else {
                System.out.println("Среди слов нет 2 и более палиндрома");
            }
        }
    }
    public static String[] searchPalindrome (String stringArray[], int stringNumber){
        int middleOfString, flag;
        String palindromeArray[] = new String[stringNumber];
        int counter = 0;
        for (int i =0; i< stringNumber;i++){
            middleOfString = (stringArray[i].length()-stringArray[i].length()%2)/2;
            flag = 0;
            for (int j =0; j < middleOfString;j++){
                if (stringArray[i].charAt(j)!=stringArray[i].charAt(stringArray[i].length()-1-j)){
                    flag =1;
                    break;
                }
            }
            if (flag == 0){
                palindromeArray[counter] = stringArray[i];
                counter++;
            }
        }
        return palindromeArray;
    }

    public static int realLength(String stringArray[], int maxIndex){
        int counter=0;
        while (counter<maxIndex&&(!stringArray[counter].isEmpty())){
            counter++;
        }
        return counter;
    }
    public static String[] searchOnlyNumber (String[] stringArray, int stringNumber){
        String numberArray[] = new String[stringNumber];
        String template = "1234567890";
        int flag=0;
        int counter = 0;
        for (int i = 0; i< stringNumber;i++){
            for (int j = 0; j<stringArray[i].length();j++){
                flag = 0;
                for (int k = 0; k< template.length();k++){
                    if (stringArray[i].charAt(j)==template.charAt(k)){
                        flag =1;
                    }
                }
                if (flag==0) {
                    break;
                }
            }
            if (flag == 1){
                numberArray[counter] = stringArray[i];
                counter++;
            }
        }
        if (counter==0){
            numberArray[0]="N";
        }
        return numberArray;
    }
}
