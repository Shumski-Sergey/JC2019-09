package asenyuk.Exam.Task3;

import java.io.IOException;
import java.util.*;

public class Task3 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> nubres = new ArrayList<>();

      //  nubres.add(1);
      //  nubres.add(2);
      //  nubres.add(2);
     //   nubres.add(3);
     //   nubres.add(4);
      //  nubres.add(5);

        nubres.add(random.genericNumbs());
        nubres.add(random.genericNumbs());
        nubres.add(random.genericNumbs());
        nubres.add(random.genericNumbs());
        nubres.add(random.genericNumbs());


int y=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (Integer number: nubres) {
        for  (Integer num: nubres) {
            if(number.equals(num)) {
                y=y+1;
            }
                   }
        map.put(number,y);
        y=0;
        }

        for (Map.Entry<Integer,Integer> item : map.entrySet()) {

           System.out.println(item.getKey() + "  -  " + item.getValue());
        }

       System.out.println("MAX " +map.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey));

    }

}
