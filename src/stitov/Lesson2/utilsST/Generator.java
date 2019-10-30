package stitov.Lesson2.utilsST;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by user on 26.10.2019.
 */
public class Generator {
  public ArrayList<Integer> generateIntegerArray (int length){
    ArrayList<Integer> array = new ArrayList<Integer>();
    Random rnd = new Random();
    for (int i = 0; i<length;i++){
      array.add(rnd.nextInt(100)+1);
    }
    return array;
  }
  public LinkedList<Integer> generateIntegerLinkedList (int length){
    LinkedList<Integer> array = new LinkedList<Integer>();
    Random rnd = new Random();
    for (int i=0;i<length;i++){
      array.add(rnd.nextInt(100)+1);
    }
    return array;
  }
  public int[] generateIntArray(int length, int maxValue){
    int[] array = new int[length];
    Random rnd = new Random();
    for (int i = 0; i< length;i++){
      array[i] = rnd.nextInt(maxValue);
    }
    return array;
  }
}
