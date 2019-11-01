package nsivko.lab10;

import java.util.*;

import static nsivko.utils.CreateArrayListRandom.*;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Введите слова через один пробел: ");
        String[] words = createWordsFromText();
        Map<String, String> listWords = getListWords(words);
        System.out.print("Группы анаграмм: ");
        printHashMapValues(listWords);
    }
}
