package AlexandraShokhan.lesson13.Task2;

// 2.  Написать программу, которая создаст текстовый файл и запишет в него список файлов (путь, имя, дата создания)
// из заданного каталога.

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task2 {
    public static void main(String[] args) throws Exception {
        File dir = new File("src/AlexandraShokhan");
        listFilesForFolder(dir);
    }

    public static void listFilesForFolder(File folder) throws FileNotFoundException {
        PrintStream out = new PrintStream(new FileOutputStream("filename.txt"));
        for (File item : folder.listFiles()) {
            if (item.isDirectory()) {
                listFilesForFolder(item);
            } else {
                out.println("Absolute path is: " + item.getAbsolutePath());
                out.println("File name: " + item.getName());
                String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date(item.lastModified()));
                out.println("Last modified: " + date);
                out.println(" ");
            }
        }
    }
}
