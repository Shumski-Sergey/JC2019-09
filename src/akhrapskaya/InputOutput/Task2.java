package akhrapskaya.InputOutput;

import akhrapskaya.Utils.MyFiles;

import java.io.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;


public class Task2 {
    private static final File FILE = new File("src/akhrapskaya/InputOutput/files.txt");

    public static void  main(String[] args) {
        File dir = MyFiles.getFileName("Введите имя директории(с путем)");
        if (!dir.isDirectory()){
            System.out.println("Неверно введена директория");
        }
        else
            getFile(dir);
    }
    private static void getFile(File dir){
       try {
            FileOutputStream writer = new FileOutputStream(FILE);
            filesInDir(dir, writer);
            writer.close();

       } catch (IOException e) {
            System.out.println("Ошибка записи в файл");
            e.printStackTrace();
       }

    }

    private static void filesInDir(File dir, FileOutputStream writer) throws IOException {
        File[] files = dir.listFiles();
        assert files != null;
        for (File f: files){
            if (f.isFile()){
                forFiles(writer, f);
            }
            if (f.isDirectory()){
                forDir(writer, f);
            }
        }
    }

    private static void forFiles(FileOutputStream writer, File f) throws IOException {
        String s = getLine(f);
        writer.write(s.getBytes());
    }

    private static void forDir(FileOutputStream writer, File f) throws IOException {
        String s = "\nДиректория " + f.getName() + "{" + "\n";
        writer.write(s.getBytes());
        filesInDir(f, writer );
        writer.write("}\n".getBytes());
    }

    private static String getLine(File f) {
        Timestamp time = new Timestamp(f.lastModified());
        String timeStamp = new SimpleDateFormat("dd.MM.yyyy").format(time);
        return f.getName() + "     " + f.getPath() + "     " + timeStamp + "\n";
    }
}
