package tereshko.NewCollection;


import java.util.ArrayList;

import static tereshko.NewCollection.Scan.setScanner;
import static tereshko.RANDOM.MyRandom.randomMark;

public final class Marks extends Child {
  public  ArrayList<Integer> marks = new ArrayList<>();
  public void getMarks(){
      System.out.println("How many students");
      setChild(setScanner());
      for (int i = 0; i <getChild() ; i++) {
          marks.add(randomMark());
      }
  }

}

