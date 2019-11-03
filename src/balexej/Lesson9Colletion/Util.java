package balexej.Lesson9Colletion;

import java.util.ArrayList;

public class Util {
    
  public static void rand(){
  ArrayList<Integer> grade = new ArrayList<Integer>();
        for (int i = 0; i<10; i++){
        int a = (int)(Math.random()*10);
        grade.add(a);
    }
}
}