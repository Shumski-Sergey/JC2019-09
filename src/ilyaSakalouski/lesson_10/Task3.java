package ilyaSakalouski.lesson_10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER WORDS SEPARATED BY SPACES:");
        String text = in.nextLine();                            // read one line as a whole
        text = text.toLowerCase();

        String[] words = text.split(" ");                 // translate a string into an array of strings

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i <= words.length - 1; i++)
        {
            String tmpWord = words[i];                          // assign a word from the array to tmpWord
            char[] symbols = words[i].toCharArray();            // convert an array element to a symbols set

            Arrays.sort(symbols);                               // sort the array in ascending order

            String wordK = new String(symbols);                 // convert an array of symbols to a string

            map.merge(wordK, tmpWord, (a, b) -> a + " " + b);   // <== ТУТ БЫЛ IF/ELSE
        }
        System.out.println();
        for (String k : map.values())
            System.out.println(k);
    }
}
