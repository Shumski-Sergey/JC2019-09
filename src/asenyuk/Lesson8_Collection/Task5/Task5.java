package asenyuk.Lesson8_Collection.Task5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) throws IOException {
        FileInputStream stream;
       // stream = new FileInputStream("C:\\Users\\Alexsandr\\Downloads\\COLLECTION1.txt");
        stream = new FileInputStream("src/asenyuk/Lesson8_Collection/Task5/task");
        int lengt = stream.available();
        byte[] data = new byte[lengt];
        stream.read(data);
        String text = new String(data);
        int y = 0;
        text.replace("\n", " ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
            String[] line = text.split(" ");
        for (String words : line) {
                      for (String word : line) {
                if (words.equals(word)) {
                    y = y + 1;
                }
            }
            map.put(words, y);
            y = 0;
        }
        System.out.println("===================================");
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            System.out.println(item.getKey() + "  -  " + item.getValue());
        }
    }
}