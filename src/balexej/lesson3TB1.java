package balexej;
import java.util.Scanner;

public class lesson3TB1 {
    public static void main(String []args){
        System.out.println("Введите натуральное число");
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        System.out.println(x);
        int b = 1;
        for (int i = 1; i<=x ; i++){
            b *= i;

        }
        System.out.println("Факторриал числа равен " + b);
    }
}
