package vtafeliuk.Lesson13IO;

import java.io.*;
import java.util.Scanner;

public class Test2 {
    public static final String PATHNAME = "src" + File.separator + "vtafeliuk" + File.separator + "Lesson13IO";

    public static void main(String[] args) throws FileNotFoundException {
        File resourceDirectory = new File(PATHNAME);
        File file = new File(resourceDirectory, "poem.txt");
        System.out.println(file.exists());
//
   //     try (Scanner scanner = new Scanner( new BufferedInputStream (new FileInputStream(file)))) {
   //         while (scanner.hasNextLine()) {
   //             String line = scanner.nextLine();
   //             System.out.println(line);
   //         }
   //     } catch (FileNotFoundException e) {
   //         e.printStackTrace();
   //     }

       // FileWriter fileOutputStream = new FileWriter(file);
       // BufferedWriter bufferedOutputStream = new BufferedWriter(fileOutputStream);
       // bufferedOutputStream.write();


    }
}
