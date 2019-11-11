package stitov.Lesson12_Stream.Task4;

import stitov.utilsST.Splitter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//src\stitov\Lesson12_Stream\Task4\world.txt
public class Task4 {
    public static void main (String[] args) {
        System.out.println("Input file name:");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        ArrayList<String> words = new ArrayList<>();
        boolean flag = true;
        try {
            FileReader file = new FileReader(fileName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                words.addAll(Splitter.splitWords(reader.nextLine()));
            }
            file.close();
        }catch (IOException e){
            System.out.println("File not found");
            flag= false;
        }
        long count = words.stream().filter(s -> s.equals("world")).count();
        if (flag)
        System.out.println("File " + fileName+ " consist "+count +" words World");
    }
}
