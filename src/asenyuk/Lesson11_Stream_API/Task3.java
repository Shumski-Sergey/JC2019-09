package asenyuk.Lesson11_Stream_API;

import balexej.lesson8.Array.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String var =scn.nextLine();
        System.out.println(var);
        System.out.println("-------");
               String [] arr = var.split(" ");

        Arrays.stream(arr).map(x-> {
            try{
              return   Integer.valueOf(x);
        }  catch (NumberFormatException e) {
                return null;           }

        }).filter(z->z!=null).forEach(y->System.out.println(y));


    }
}
