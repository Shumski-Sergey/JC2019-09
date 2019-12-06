package tereshko.KR;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.naturalOrder;


public class TestC {
    public static void main(String[] args) throws IOException {
        FileWriter fw =new FileWriter("TestC");

        List<Integer> numb = new ArrayList<>();
        for (int i = 1; i <10 ; i++) {
            numb.add(i);
        }
        numb.removeIf(x->x%2==1);
        numb.sort(naturalOrder());
        fw.write(String.valueOf(numb));
        fw.close();
        System.out.println(numb.toString());
    }
}
