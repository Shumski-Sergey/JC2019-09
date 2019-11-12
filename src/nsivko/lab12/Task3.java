package nsivko.lab12;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String text = "12 text var2 14 8v 1";
        String[] word = text.split(" +");
        ArrayList<String> words = new ArrayList<>(Arrays.asList(word));
        words.stream()
                .filter(s -> s.matches("\\d+"))
                .forEach(System.out::println);

    }

}
