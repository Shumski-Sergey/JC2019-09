package tereshko.Trash;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static tereshko.RANDOM.MyRandom.randomMark;

public class Test2 {

    public static void main(String[] args) {
        List<Integer> numb = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        int random=scanner.nextInt();
    for (int i = 0; i <10; i++) {
            numb.add(randomMark());
        }
        System.out.println(numb);
        for (int i=0; i<numb.size()-1 ; i++) {
            for (int j = 0; j <i; j++) {
                if(numb.get(i).equals(numb.get(j))){
                    System.out.println("Remove the number "+numb.get(j)+" under the index "+i);
                    numb.remove(j);
                }
            }
        }
       System.out.println(numb);

        }

}
