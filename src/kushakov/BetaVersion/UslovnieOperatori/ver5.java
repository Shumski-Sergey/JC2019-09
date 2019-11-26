package kushakov.BetaVersion.UslovnieOperatori;

import java.util.Scanner;

public class ver5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<b)
        System.out.println("Переменная б больше a");
        else if (a>b) System.out.println("Переменная а больше б");
        else System.out.println("Они равны" );
        }

    }

