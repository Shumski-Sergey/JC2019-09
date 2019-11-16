package stitov.Lesson14_IO.Task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
// src/stitov/Lesson9_Collections/TaskB1/
public class Task2 {
    public static void main (String[] args){
        String path = inputPath();
        getInfoFromPath(path);

    }
    private static String inputPath(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the Path");
        return scanner.nextLine();
    }
    private static void getInfoFromPath(String path){
        try {
            File file = new File(path);
            ArrayList<File> fileArrayList = new ArrayList<>(Arrays.asList(Objects.requireNonNull(file.listFiles())));
            FileWriter writer = new FileWriter("src\\stitov\\Lesson14_IO\\Task2\\path_Info.txt");
            for (File everyFile: fileArrayList){
                printInfo(everyFile, writer);
            }
            writer.close();
            System.out.println("File is saved");
        } catch (Exception e){
            System.out.println("The path haven't been found");
        }
    }
    private static void printInfo (File file, FileWriter writer) throws IOException {
        writer.write("Path: " + file.getParent()+"\n");
        writer.write("Name: "+ file.getName()+"\n");
        Path way = Paths.get(file.getPath());
        BasicFileAttributes info = Files.readAttributes(way, BasicFileAttributes.class);
        writer.write("Creation date: "+ info.creationTime()+"\n\n\n");
    }
}
