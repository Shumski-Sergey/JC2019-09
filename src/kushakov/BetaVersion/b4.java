package kushakov.BetaVersion;
import java.util.Scanner;
public class b4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int j = scan.nextInt();
        if ( k > j)  System.out.println("Переменная  k >больше>  j");
        else if (k<j)System.out.println("Переменная K <меньше< J");
        else System.out.println("переменные равны");

    }
}
