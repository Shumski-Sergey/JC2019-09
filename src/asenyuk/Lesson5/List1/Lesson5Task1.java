package asenyuk.Lesson5.List1;

import java.util.Scanner;

public class Lesson5Task1 {
    public static void main(String[] args) {

        Scanner count = new Scanner(System.in);

        int n=count.nextInt(); //set count of n

        String arrStr[]=new String[n];

        Scanner inpt = new Scanner(System.in);

        for (int i=0;i<n;i++) {
            arrStr[i] = inpt.nextLine();
        }

        for (int j=0;j<arrStr.length;j++) {
            System.out.println(arrStr[j]);
            System.out.println(arrStr[j].length());
        }


        String  minStr=arrStr[0];
        for (int q=0;q<arrStr.length;q++) {
            if ( minStr.length() >arrStr[q].length()) {
                  minStr= arrStr[q];
            }

        }
        System.out.println( "------");
        System.out.println("MIN STRING : " + minStr);


        String  maxStr=arrStr[0];
        for (int q=0;q<arrStr.length;q++) {
            if ( maxStr.length() <arrStr[q].length()) {
                maxStr= arrStr[q];
            }

        }
        System.out.println( "------");
        System.out.println("MAX STRING : " + maxStr);


        }

    }

