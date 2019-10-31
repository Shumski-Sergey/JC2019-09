package tereshko.Trash;


import java.util.ArrayList;
import java.util.Collections;;
import java.util.List;
import java.util.Scanner;
import static tereshko.NewCollection.MyRandom.randomMark;


public class Test3 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        int random=scanner.nextInt();
        for (int i = 0; i < 20; i++) {
            marks.add(randomMark());
        }
        System.out.println(marks);
        Integer high =Collections.max(marks);
        System.out.println(high);


        }
}
