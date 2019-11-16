package dmikulionak.IO;

import java.io.*;
import java.util.Scanner;

//Ввести с консоли имя файла. Найти байт или байты с максимальным количеством повторов. Вывести их на экран через пробел. Закрыть поток ввода-вывода.
public class task1 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        System.out.println("Введите имя файла в директории проекта");
        InputStream fileIn = new FileInputStream(in.nextLine());         // src\dmikulionak\IO\task2.java
        byte[] sizeRead = new byte[128];
        byte maxRepeat;
        while (fileIn.available() > 0) {
            maxRepeat = (byte) fileIn.read();
            sizeRead[maxRepeat]++;
        }
        for (int i = 0; i < sizeRead.length; i++) {
            if (sizeRead[i] > 1) {
                System.out.println(i + " ");
            }
        }
        fileIn.close();
        System.in.close();
        System.out.close();
    }
}
