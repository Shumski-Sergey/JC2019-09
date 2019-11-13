package stitov.utilsST;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by user on 26.10.2019.
 */
public class Generator {
  /**
   * Generate ArrayList(Integer) of random values with definite Length
   * @param length length of ArrayList
   * @param maxValue max value of random numbers (Integer)
   * @return created ArrayList
   */
  public static ArrayList<Integer> generateIntegerArray (int length, int maxValue){
    ArrayList<Integer> array = new ArrayList<>();
    Random rnd = new Random();
    for (int i = 0; i<length;i++){
      array.add(rnd.nextInt(maxValue)+1);
    }
    return array;
  }

  /**
   * Generate LinkedList(Integer) of random values with definite Length
   * @param length length of LinkedList
   * @param maxValue max value of random numbers (Integer)
   * @return created LinkedList
   */
  public static LinkedList<Integer> generateIntegerLinkedList (int length, int maxValue){
    LinkedList<Integer> array = new LinkedList<>();
    Random rnd = new Random();
    for (int i=0;i<length;i++){
      array.add(rnd.nextInt(maxValue)+1);
    }
    return array;
  }

  /**
   * Generate Array int[] of random values with definite Length
   * @param length length of array int[]
   * @param maxValue max value of random numbers (Integer)
   * @return created int[]
   */
  public static int[] generateIntArray(int length, int maxValue){
    int[] array = new int[length];
    Random rnd = new Random();
    for (int i = 0; i< length;i++){
      array[i] = rnd.nextInt(maxValue);
    }
    return array;
  }
}
