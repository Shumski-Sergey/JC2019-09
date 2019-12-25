package zyahya.Stream;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

public class exe2 {
    public static void main(String[] args) throws IOException {
        File folderSource = new File("f:\\Tmp\\2\\");
        File[] files = folderSource.listFiles();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        PrintWriter write = new PrintWriter("f:\\Tmp\\3\\FolderContent.txt", "UTF-8");
        for (File f : files) {
            write.printf("%25s %25s %25s\n", f.getAbsoluteFile(), f.getName(), format.format(f.lastModified()));

        }
        write.close();

    }
}
