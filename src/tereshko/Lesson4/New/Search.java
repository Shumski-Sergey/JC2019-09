package tereshko.Lesson4.New;

import java.util.Random;

public class Search {
    public static void main(String[] args) {
        int[] idMax = new int[10];
        Random random = new Random();
        int k=0;
        for (int i = 0; i < idMax.length; i++) {
            idMax[i] = random.nextInt(20);
            searchDuplicate(idMax);
        }
        for (int i = 0; i < idMax.length ; i++) {
            for (int max : idMax) {
                if (idMax[i] > max) {
                    k++;
                }
            }
            if (k == 9) {System.out.println("Index" + i + "");
            break;}
            else k = 0;
        }
        for (int x:idMax
             ) {System.out.println(x);

        }
        }

    public static void searchDuplicate(int[] max){
        Random random =new Random();
        for (int i = 0; i <max.length ; i++) {
            for (int j = 0; j <i ; j++) {
                if(max[i]==max[j]) {
                    max[i]=random.nextInt(20);
                    searchDuplicate(max);
                }
            }

        }

    }
}
