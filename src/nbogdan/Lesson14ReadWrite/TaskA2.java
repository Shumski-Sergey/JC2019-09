package nbogdan.Lesson14ReadWrite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class TaskA2 {
    private static final String FILEPATH = "src\\nbogdan\\Lesson14ReadWrite\\";
    private static final String INFOPATH = "src\\nbogdan\\FullPokerStars\\";

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        File WC;
        System.out.println("Введите имя файла, в который нужно записать данные");
        File f = new File(FILEPATH + sc.nextLine() + ".txt");
        String info = "В папке FullPokerStars находятся: \n";
        f.delete();
        f.createNewFile();
        for (String file: Objects.requireNonNull(new File(INFOPATH).list())) {
            WC = new File(INFOPATH + file);
            info += ("Файл " + file + ": " + WC + "(путь), " + "\n");
        }
        FileOutputStream writer = new FileOutputStream(f);
        byte[] buffer = info.getBytes();
        writer.write(buffer, 0, buffer.length);
        System.out.print("Файл создан. Не забудьте удалить после прочтения!");
    }
}
