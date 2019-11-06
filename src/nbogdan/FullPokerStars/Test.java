package nbogdan.FullPokerStars;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>() {{
        put(1,"раз");
        put(7,"два");
        put(3,"три");
        put(4,"четыре");
        put(5,"пять");
        }};
        for (int value : hashMap.keySet()) {
            System.out.print(value + ", ");
        }
    }
}
