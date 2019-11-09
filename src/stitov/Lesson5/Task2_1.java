package stitov.Lesson5;
import java.util.Scanner;
/**
 * Created by user on 09.10.2019.
 */
public class Task2_1 {
  public static void main(String[] args){
    System.out.println("Введите количество строк");
    Scanner in = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    int numberOfStrings = in.nextInt();
    String[] arrayString = new String[numberOfStrings];
    int arrayOfLengths[] = new int[numberOfStrings];
    System.out.println("Вводите строки");
    for (int i =0; i<numberOfStrings;i++){
      arrayString[i] = sc.nextLine();
    }
    for (int i =0; i<numberOfStrings;i++){
      arrayOfLengths[i] = arrayString[i].length();
    }
    /*for (String i : arrayString){
      System.out.println(i);
    }
    for (int i : arrayOfLengths){
      System.out.println(i);
    }*/
    maxElements(arrayOfLengths,arrayString);
    minElements(arrayOfLengths,arrayString);
  }
  public static void maxElements (int arrayOfLength[], String arrayOfStrings[]){
    int maxlength = arrayOfLength[0];
    String maxString = new String();
    int index = 0;
    for (int i = 0;i<arrayOfLength.length;i++){
      if (arrayOfLength[i]>maxlength){
        maxlength = arrayOfLength[i];
        index = i;
      }
    }
    System.out.println ("Самая длинная строка:");
    System.out.println(arrayOfStrings[index]);
    System.out.println("Длина самой длинной строки "+maxlength);
  }
  public static void minElements (int arrayOfLength[], String arrayOfStrings[]){
    int minlength = arrayOfLength[0];
    String minString = new String();
    int index = 0;
    for (int i = 0;i<arrayOfLength.length;i++){
      if (arrayOfLength[i]<minlength){
        minlength = arrayOfLength[i];
        index = i;
      }
    }
    System.out.println ("Самая коротокая строка:");
    System.out.println(arrayOfStrings[index]);
    System.out.println("Длина самой короткой строки "+minlength);
  }
}
