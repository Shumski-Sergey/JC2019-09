package ilyaSakalouski.lesson_14.N3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text strings:");
        String text = scanner.nextLine();
        System.out.println("Enter way to create and save your text in new file:");
        String way = scanner.nextLine();

        FileWriter fw = null;
        File file = new File(way);
        try {
            fw = new FileWriter(file, true);
            fw.write(text);
            System.out.println("COMPLETED SUCCESSFULLY");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fw != null;
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
