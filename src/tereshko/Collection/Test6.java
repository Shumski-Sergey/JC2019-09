package tereshko.Collection;

import java.io.*;
import java.util.*;

public class Test6 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("src/tereshko/Collection/Text6.txt");
        Scanner scanner=new Scanner(reader);;
        String text = scanner.nextLine();
        Map<String, Integer> wordsMap = new HashMap<>();
        List<String> wordsList = Arrays.asList(text.replaceAll("\\p{Punct}", "").split(" "));
        for (String word : wordsList) {
            wordsMap.put(word, Collections.frequency(wordsList, word));
        }
        System.out.println("Частотный словарь: " + wordsMap);
    }
}
