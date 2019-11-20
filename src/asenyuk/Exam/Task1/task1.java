package asenyuk.Exam.Task1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class task1 {

    public static void main(String[] args) throws IOException {

        ArrayList<Integer> nubres = new ArrayList<>();

        nubres.add(15);
        nubres.add(12);
        nubres.add(19);
        nubres.add(7);
        nubres.add(8);
        nubres.add(2);
       int max=Collections.max(nubres);
       int min= Collections.min(nubres);
        System.out.println(max);
        System.out.println(min);
  int sum=0;
        for (Integer number : nubres) {
            sum=sum+number;
        }
        System.out.println("sum= " + (sum-min-max));




    }

}
