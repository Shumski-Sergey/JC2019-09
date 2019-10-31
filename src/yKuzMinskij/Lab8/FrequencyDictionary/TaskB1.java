package yKuzMinskij.Lab8.FrequencyDictionary;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Имеется текст. Следует составить для него частотный словарь
 */

public class TaskB1 {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\yKuzMinskij\\Lab8\\FrequencyDictionary\\HPandPS");
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis, "windows-1251");
        BufferedReader br = new BufferedReader(isr);
        HashMap<String, Integer> dictionary = new HashMap<>();
        ArrayList<String> list;
        while (br.ready()) {
            String line = br.readLine();
            list = (ArrayList<String>) Arrays.asList(line.split("\\s+"));
            for (String s : list) {
                if (dictionary.containsKey(s)) {
                    Integer value = (dictionary.get(s)) + 1;
                    dictionary.put(s, value);
                } else {
                    dictionary.put(s, 1);
                }
            }
        }
        br.close();
        for (HashMap.Entry entry : dictionary.entrySet()) {
            System.out.println("Слово: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }
    }
}