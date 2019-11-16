package nbogdan.Lesson14ReadWrite;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя файла, в который нужно записать данные");
        File f = new File("src\\\\nbogdan\\\\Lesson14ReadWrite\\\\" + sc.nextLine() + ".txt");
        if (!f.isFile()) {
            if (f.createNewFile()) {
            }
        } else {
            if (f.delete() && f.createNewFile()) {
            }
        }

    }
}
