package tereshko.Map;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        String text = "123, 456, 231 21 546 231 12 AD 312 !da! 4556";
        String[] words = text.toLowerCase().replaceAll("\\p{Punct}", "").split(" ");
        Map<String, String> map = new LinkedHashMap<>();
        for (int i = 0; i <= words.length - 1; i++) {
            String str = words[i];
            char[] ch = words[i].toCharArray();
            Arrays.sort(ch);
            String wordkey = new String(ch);
            map.merge(wordkey, str, (a, b) -> a + " " + b);
        }
        for (String k2 : map.values()) {
            System.out.println(k2);
        }
    }
}
