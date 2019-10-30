package yKuzMinskij.Lab8.FrequencyDictionary;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Имеется текст. Следует составить для него частотный словарь
 */

public class TaskB1 {
    public static void main (String[] args) throws IOException {
        File file = new File("src\\yKuzMinskij\\Lab8\\FrequencyDictionary\\HPandPS");
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis, "windows-1251");
        BufferedReader br = new BufferedReader(isr);
        HashMap <String, Integer>dictionary = new HashMap<>();
        while (br.ready()){
            String line = br.readLine();
            ArrayList list = new ArrayList();
            list.addAll(Arrays.asList(line.split("\\s+")));
            for (int i = 0; i< list.size(); i++){
            if(dictionary.containsKey(list.get(i))){
                Integer value = (dictionary.get(list.get(i)))+1;
                dictionary.put((String) list.get(i), value);
            }else {dictionary.put((String) list.get(i), 1);}
            }
        }
        br.close();
        for (HashMap.Entry entry : dictionary.entrySet()) {
            System.out.println("Слово: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }
    }
}