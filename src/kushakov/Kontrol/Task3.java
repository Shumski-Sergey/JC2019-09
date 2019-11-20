package kushakov.Kontrol;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

/**
 * Created by user on 20.11.2019.
 */
public class Task3 {
    public static void main(String[] args) {
        int [] numb = {3,5,3,6,3,7,8,3,9,3,7};
        Arrays.sort(numb);
        int a = Integer.MIN_VALUE;
        int b = numb [0];
        int c = 0;
        Set<Integer> res = new HashSet<>();
        for ( int num: numb)
            if (b == num)
                c++;
        else {
            a = Math.max(a,c);
            if(a==c) {
                res.add(b);
                b = num;
                c = 1;
            }
            }
        System.out.println(a);
        System.out.println(res);


    }
}
