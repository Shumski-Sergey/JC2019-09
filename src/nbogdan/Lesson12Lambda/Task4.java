package nbogdan.Lesson12Lambda;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("[,.!?/:;]\\s*");
        String text = "";
        System.out.println("Введите имя файла");
        File f = new File("src\\\\nbogdan\\\\Lesson12Lambda\\\\" + sc.nextLine());
        if (f.isFile()) {
            text = Files.readString(Path.of(f.toString()));
        } else {
            System.out.println("Такого файла не существует!");
            System.exit(0);
        }
        text = text.toLowerCase();
        System.out.println("Слово \"world\" встречается в тексте " + Arrays.stream(p.split(text)).filter("world"::equals).count() + " раз.");
    }
}
