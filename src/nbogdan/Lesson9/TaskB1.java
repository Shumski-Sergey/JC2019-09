package nbogdan.Lesson9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void main(String[] args) throws IOException {
        Pattern p = Pattern.compile("\\W+");
        Matcher m;
        int count;
        String text = Files.readString(Paths.get("src\\\\nbogdan\\\\Lesson9\\\\B1.txt"));
        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(p.split(text)));
        for (String word : uniqueWords) {
            count = 0;
            p = Pattern.compile(word);
            m = p.matcher(text);
            while (m.find()) {
                count++;
            }
            System.out.print("Слово " + word + " повторяется в тексте " + count + " раз(а).\n");
        }
    }
}