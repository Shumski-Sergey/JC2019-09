package nsivko.lab9.TaskB1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) throws IOException {

        String text = "привет надо может привет с слова слово как привет надо";
        ArrayList<String> wordsText = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();
        createArrayText(text, wordsText);

        createDictionary(wordsText, number);

        System.out.println("Частотный словарь: ");
        for (int i = 0; i < wordsText.size(); i++)
        System.out.println("Слово " + "\"" + wordsText.get(i) + "\"" + "  встречается " + number.get(i) + " раз(-а).");
        }

    private static void createDictionary(ArrayList<String> wordsText, ArrayList<Integer> number) {
        for (int i = 0; i < wordsText.size(); i++) {
            int k = 1;
            for (int j = i+1; j < wordsText.size(); j++) {
            if (wordsText.get(i).equals(wordsText.get(j))) {
                k++;
                wordsText.remove(j);
                j--;
             }
            }
            number.add(k);
        }
    }

    private static void createArrayText(String text, ArrayList<String> wordsText) {
        String[] words = text.split(" +");
        Collections.addAll(wordsText, words);
    }
}
