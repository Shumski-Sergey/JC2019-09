package stitov.Lesson2.Lesson9.TaskA1;
import stitov.Lesson2.utilsST.Generator;
import stitov.Lesson2.utilsST.PrintArray;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 26.10.2019.
 */
public class Main {
  private static final Integer BADMARK = 40;
 public static void main (String[] args){
    Random rnd = new Random();
   Generator gen = new Generator();
   PrintArray printArray = new PrintArray();
    int length = rnd.nextInt(100)+1;
    System.out.println("Длина массива: " + length);
   ArrayList<Integer> arrayOfMarks = new ArrayList<Integer>();
   arrayOfMarks = gen.generateMarks(length);
   printArray.printArray(arrayOfMarks);
   System.out.println();
   arrayOfMarks = deleteBad(arrayOfMarks);
   printArray.printArray(arrayOfMarks);

 }
 public static ArrayList<Integer> deleteBad (ArrayList<Integer> array){
for (int i = 0; i<array.size();i++){
  if (array.get(i)<BADMARK){
    array.remove(i);
    i--;
  }
}
   return array;
   }
 }

