package kushakov.BetaVersion;
import java.util.Scanner;
public class b6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i=0;
        int a = scan.nextInt();
        int multi = 1;
        while ( i<3){
        i++;
        multi *= a ;

        System.out.println(multi);
        }

    }


}
