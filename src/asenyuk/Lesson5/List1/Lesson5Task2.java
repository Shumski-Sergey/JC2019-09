package asenyuk.Lesson5.List1;

import java.util.Scanner;

public class Lesson5Task2 {
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
            System.out.println(arrStr.length);
        }



for (int x=0;x<arrStr.length;x++) {
      for (int q = arrStr.length-1; q>x ; q--) {
        if (arrStr[q-1].length() > arrStr[q].length()) {
          String minStr = arrStr[q-1];
            arrStr[q-1]=arrStr[q];
            arrStr[q]=minStr;
        }

    }
}
        System.out.println( "------");
        for (int z=0;z<arrStr.length;z++) {
            System.out.println(arrStr[z]);
        }




    }
}
