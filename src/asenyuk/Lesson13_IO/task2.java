package asenyuk.Lesson13_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class task2 {

    public static void main(String[] args) throws IOException {

        File task2 = new File("src/asenyuk/Lesson13_IO/task2");
        try {
            var newFile = task2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String filePath = task2.getPath();
       // String fileName = task2.getName();
        Long fileModifyL = task2.lastModified();
        String fileModify = fileModifyL.toString();
        String space= "  ";
        String informFile = filePath.concat(space).concat(space).concat(fileModify);

        FileOutputStream fos = new FileOutputStream(task2);
        byte[] buffer = informFile.getBytes();

        try {
            fos.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

