package stitov.Lesson2.Lesson9_Collections.TaskA1;
import stitov.Lesson2.utilsST.Generator;
import stitov.Lesson2.utilsST.PrintArray;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 26.10.2019.
 */
public class Main {
  private static final Integer BADMARK = 40;
  private static final Integer MAX_MARK = 100;
 public static void main (String[] args){
     Random rnd = new Random();
     int length = rnd.nextInt(MAX_MARK)+1;
     ArrayList<Integer> arrayOfMarks = Generator.generateIntegerArray(length, MAX_MARK);
     PrintArray.printArray(arrayOfMarks);
     System.out.println();
     deleteBad(arrayOfMarks);
     PrintArray.printArray(arrayOfMarks);
 }
 private static void deleteBad(ArrayList<Integer> array){
for (int i = 0; i<array.size();i++){
  if (array.get(i)<BADMARK){
    array.remove(i);
    i--;
  }
}
 }
 }

