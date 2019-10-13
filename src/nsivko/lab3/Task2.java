package nsivko.lab3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int a, b, c;
        boolean prov = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        a = sc.nextInt();
        b = a;
        for(int i = 2; i < a; i++){
            c = b % i;
            if (c == 0){
                System.out.println("Число " + a + " не является простым");
                prov = false;
                break;
            }
        }
        if (prov == true){System.out.println("Число " + a + " является простым");}
    }
}
