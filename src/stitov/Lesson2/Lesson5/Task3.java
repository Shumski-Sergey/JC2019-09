package stitov.Lesson2.Lesson5;
import java.util.*;
/**
 * Created by user on 09.10.2019.
 */
public class Task3 {
  public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Введите строку");
    String s = in.nextLine();
    String[] arraystring = s.split(" +");
    char[] lastletters = new char[arraystring.length];
    int j=0;
    for (String i : arraystring){
      if (!i.isEmpty()) {
        lastletters[j] = i.charAt(i.length() - 1);
        j++;
      }
    }
    for (String i : arraystring){
      System.out.print(i+ "  ");
    }
    System.out.println();
    for (char i : lastletters){
      System.out.print(i + " ");
    }
  }
}
