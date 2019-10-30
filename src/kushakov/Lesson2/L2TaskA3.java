package kushakov.Lesson2;
import java.util.Scanner;
public class L2TaskA3 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите 3 целых числа");
        int k = sc.nextInt();
        int j = sc.nextInt();
        int l = sc.nextInt();
        if (k>l & k>l){
            if(j>l) System.out.println(l+" "+j+" "+k);
            else System.out.println(j+" "+l+" "+k);}
        if(j>k & j>l){
            if (k>l) System.out.println((l+" "+k+" "+j));
            else System.out.println(k+" "+l+" "+j);}
        if(l>k & l>j) System.out.println(j+" "+k+" "+l);
        else System.out.println(k+" "+j+" "+l);}

        }
