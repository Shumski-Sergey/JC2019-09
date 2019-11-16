package akhrapskaya.Utils;

import java.io.File;
import java.util.Scanner;

public class MyFiles {
    public static File getFileName(String s){
        Scanner sc = new Scanner(System.in);
        System.out.println(s);
        return new File(sc.nextLine());
    }

}
