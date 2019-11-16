package ilyaSakalouski.lesson_14.N4;

import java.io.*;

public class Task_4 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        int b;
        try {
            fis = new FileInputStream("C:/Users/Илья/Desktop/Text.txt"); // ФАЙЛ С КОТОРОГО ЧИТАТЬ
            fos = new FileOutputStream("C:/Users/Илья/Desktop/Text_2.txt"); // НОВЫЙ ФАЙЛ В КОТОРЫЙ ЗАЛИВАЕМ
            while ((b = fis.read()) != (-1)) {
                fos.write((char) b);
            }
            System.out.println("Ready");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fis != null;
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                assert fos != null;
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
