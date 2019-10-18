package kushakov.Lesson2;
import java.util.Scanner;
public class L2TaskB3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        int res = 2;
        for (int i=num;i>0;i--){
            System.out.println(i);
            res+=i;
        }
        System.out.println("res" +res);
    }

}
