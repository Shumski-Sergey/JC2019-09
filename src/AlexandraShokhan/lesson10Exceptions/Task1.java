package AlexandraShokhan.lesson10Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static String readFile(String filePath) throws FileNotFoundException {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return "It's text from catch";
        } finally {
            return "It's text from finally";
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(readFile("jhbjhb"));
    }
}
