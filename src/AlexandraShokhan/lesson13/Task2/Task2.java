package AlexandraShokhan.lesson13.Task2;

// 2.  Написать программу, которая создаст текстовый файл и запишет в него список файлов (путь, имя, дата создания)
// из заданного каталога.

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task2 {
    public static void main(String[] args) throws Exception {
        File dir = new File("src/AlexandraShokhan");
        listFilesForFolder(dir);

    }
     public static void listFilesForFolder(File folder) {
        for (File item : folder.listFiles()) {
            if (item.isDirectory()) {
                listFilesForFolder(item);
            } else {
                System.out.println("Absolute path is: " + item.getAbsolutePath());
                System.out.println("File name: " + item.getName());
                String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date(item.lastModified()));
                System.out.println("Last modified: " + date);
                System.out.println(" ");
            }
        }
    }
}
