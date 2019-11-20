package asenyuk.Lesson13_IO;
/*
1. Ввести с консоли имя файла. Найти байт или байты с максимальным количеством повторов. Вывести их на экран через пробел. Закрыть поток ввода-вывода.
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    public static void main (String [] args)  {
        Scanner consl =new Scanner(System.in);
        String file=consl.nextLine();
    //String file="src/asenyuk/Lesson13_IO/task1";
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte buff [] = new byte[0];
        try {
            buff = new byte [fis.available()];
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fis.read(buff,0,fis.available());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        HashMap<Integer,Byte> CollFile = new HashMap<>();
int y=0;
for (int i=0;i<buff.length;i++) {
    for (int n=0;n<buff.length;n++) {
       if (buff[i] ==buff[n])
       {
         y=y+1;
       }
    }
CollFile.put(y,buff[i]);
    y=0;
}
        for (Map.Entry<Integer,Byte> item : CollFile.entrySet()) {
            System.out.println(item.getKey() + "  -  " + item.getValue());
        }
    }
}
