package ilyaSakalouski.lesson_14.N1;

import java.io.*;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        String fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        /*----------------------------------*/
        //массив где будут индексы-"высота байта",значения счетчик частоты этих байт
        byte[] bytes = new byte[255];
        byte byteHigh;
        //заносим в массив
        while (fileInputStream.available() > 0) {
            byteHigh = (byte) fileInputStream.read();
            bytes[byteHigh] += 1;
        }
        /*-----------------------------------*/
        //вычисляем "наибольшую частоту встречаемости байта"
        int maxValue = bytes[0];
        for (int i = 0; i < bytes.length; i++) {
            int tmpData = (int) bytes[i];
            if (tmpData > maxValue)
                maxValue = tmpData;
        }

        /*-----------------------------------*/
        //в соответствии с частотой выводим байт
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == maxValue) {
                System.out.print(i);
                System.out.print(" ");
            }
        }

        fileInputStream.close();
        System.in.close();
        System.out.close();
    }
}
