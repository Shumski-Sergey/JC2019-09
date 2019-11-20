package asenyuk.Lesson13_IO;

import java.io.*;
import java.util.Scanner;

public class task3 {
    public static void main (String [] args) throws IOException {
        File task3 = new File("src/asenyuk/Lesson13_IO/task3");
        Scanner consl =new Scanner(System.in);
       // String file=consl.nextLine();
        String text="qweer rty asd fff ghh";
        FileInputStream fis=new FileInputStream ("src/asenyuk/Lesson13_IO/task1");
      //  FileOutputStream fos=new FileOutputStream(task3);

//byte [] buff =text.getBytes();
int i=-1;
//fis.read(buff,0,buff.length);





        while((i=fis.read())!=-1){

            System.out.println((char)i);
            System.out.println("------");
        }


    }
}
