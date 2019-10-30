package kushakov.Lesson2;
import java.util.Scanner;
public class L2TaskA1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a, b, answ;
        System.out.println("Введите числа");
        a = sc.nextDouble();
        b = sc.nextDouble();
        if (Math.abs(10-a) != Math.abs(10-b)){
            answ =Math.abs(10-a) > Math.abs(10-b) ? b:a;
            System.out.println(answ);
        } else {System.out.println("Числа равноудалены от 10");}
    }
}
