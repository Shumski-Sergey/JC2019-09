package nsivko.lab12;

import java.util.ArrayList;
import java.util.Arrays;

import static nsivko.utils.forStringAndStream.getStrings;

public class Task2 {
    public static void main(String[] args) {
        String[] word = getStrings();
        ArrayList<String> words = new ArrayList<>(Arrays.asList(word));
        ArrayList<String> wordsNew = new ArrayList<>();
        words.stream().filter(wordNew -> wordNew.length() > 6).forEach(wordsNew::add);
        StringBuilder str = new StringBuilder();
        str.append(wordsNew.get(0));
        if (wordsNew.size() != 1) {
            for (int i = 1; i < wordsNew.size(); i++) {
                str.append(", " + wordsNew.get(i));
            }
            System.out.println(str);
        }
        else {
            System.out.println(str);
        }
    }
}
