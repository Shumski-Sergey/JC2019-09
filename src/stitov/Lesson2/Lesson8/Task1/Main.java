package stitov.Lesson2.Lesson8.Task1;
import java.util.Scanner;

/**
 * Created by user on 19.10.2019.
 */
public class Main {
  public static void main (String[] args){
    Integer array1[] = new Integer[5];
    String array2[] = new String[5];
    System.out.println("Введите 5 элементов массива Integer");
    Scanner sc1 = new Scanner(System.in);
    for (int i = 0; i<5;i++){
      array1[i] = sc1.nextInt();
    }
    System.out.println("Введите 5 элементов массива String");
    Scanner sc2 = new Scanner(System.in);
    for (int i = 0; i<5;i++){
      array2[i] = sc1.nextLine();
    }
    AnyArray<Integer> anyArray1 = new AnyArray<Integer>(array1);
    AnyArray<String> anyArray2 = new AnyArray<String>(array2);
    System.out.println("Введите необходимый индекс");
    int index = sc1.nextInt();
    System.out.println("В массиве Integer "+ index+ " элемент = "+anyArray1.getItem(index));
    System.out.println("В массиве String "+ index+ " элемент = "+anyArray2.getItem(index));

  }
}
