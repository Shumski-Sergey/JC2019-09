package akhrapskaya.Stream;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);
        System.out.println(getStingFromMap(map));
    }
    private static String getStingFromMap(LinkedHashMap<String, String> map){
         return  map.entrySet().stream()
                .filter(e -> e.getValue()!= null)
                .flatMap(e -> Stream.of( e.getKey() +" = '" + e.getValue() + "'" ))
                .collect(Collectors.joining(" and "));
    }
}
