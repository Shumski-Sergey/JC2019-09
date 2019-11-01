package stitov.Lesson2.utilsST;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by user on 26.10.2019.
 */
public class Generator {
  public static ArrayList<Integer> generateIntegerArray (int length, int maxValue){
    ArrayList<Integer> array = new ArrayList<>();
    Random rnd = new Random();
    for (int i = 0; i<length;i++){
      array.add(rnd.nextInt(maxValue)+1);
    }
    return array;
  }

  public static LinkedList<Integer> generateIntegerLinkedList (int length, int maxValue){
    LinkedList<Integer> array = new LinkedList<>();
    Random rnd = new Random();
    for (int i=0;i<length;i++){
      array.add(rnd.nextInt(maxValue)+1);
    }
    return array;
  }
  public static int[] generateIntArray(int length, int maxValue){
    int[] array = new int[length];
    Random rnd = new Random();
    for (int i = 0; i< length;i++){
      array[i] = rnd.nextInt(maxValue);
    }
    return array;
  }
}
