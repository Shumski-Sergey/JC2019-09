package asenyuk.Lesson5.List1;

import java.util.Scanner;

public class Lesson5Task3 {
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
        int average=0;
        int sum=0;

        for (int z=0;z<arrStr.length;z++) {
            sum=sum+arrStr[z].length();
        }
        average=  sum/arrStr.length;

        System.out.println("Average " +average);

        for (int q=0;q<arrStr.length;q++) {
            if (arrStr[q].length()>average) {
                System.out.println("More then average " +arrStr[q] + "Lenght =" +arrStr[q].length());


            }
        }

    }
}
