package tereshko.Trash;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int random=scanner.nextInt();
        List<Integer> mark = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            mark.add(random);
        }
        for (int i = mark.size()-1;i>=0; i--) {
            if(mark.get(i)<4) {
                System.out.println("Child number "+i+" has bad mark "+mark.get(i));
                mark.remove(i);
            }
        }
        System.out.println(mark);
    }
}
