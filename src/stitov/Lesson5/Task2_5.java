package stitov.Lesson5;
import java.util.Scanner;

/**
 * Created by user on 12.10.2019.
 */
public class Task2_5 {
  static int VOWELS = 6;
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Введите количество слов");
    int stringNumber = in.nextInt();
    String stringArray[] = new String[stringNumber];
    System.out.println("Вводите строки");
    stringArray= Task2_2.inputstrings(stringNumber);
    String alphabet = new String("eyuioaqwrtpsdfghjklzxcvbnm");
    String alphaArray[] = new String [stringNumber];
    int countAlpha;
    int alphaLength=0;
    for (int i = 0; i<stringNumber; i++){
      countAlpha = 0;
      for (int j = 0; j<stringArray[i].length();j++){
        for (int k = 0; k<alphabet.length();k++){
          if (stringArray[i].charAt(j)==alphabet.charAt(k)){
            countAlpha++;
            break;
          }
        }
      }
      if (stringArray[i].length()==countAlpha){
        alphaArray[alphaLength] = stringArray[i];
        alphaLength++;
      }
    }
    String equalArray[] = new String[alphaLength];
    int equalLength=0;
    int vowelNumber, consonantsNumber;
    for (int i = 0; i<alphaLength;i++){
      vowelNumber = 0;
      consonantsNumber = 0;
      for (int j = 0; j<alphaArray[i].length();j++){
        for (int k = 0; k< alphabet.length();k++){
          if (alphaArray[i].charAt(j)==alphabet.charAt(k)){
            if (k<VOWELS){
              vowelNumber++;
            } else {
              consonantsNumber++;
            }
            break;
          }
        }
      }
      if (vowelNumber==consonantsNumber){
        equalArray[equalLength]=alphaArray[i];
        equalLength++;
      }
    }
    System.out.println("Слова только на латинском с равным количеством гласный и согласных:");
    for (int i = 0;i<equalLength;i++){
      System.out.println(equalArray[i]);
    }

  }
}
