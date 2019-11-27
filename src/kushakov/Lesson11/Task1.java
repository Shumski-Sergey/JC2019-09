package kushakov.Lesson11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
        lhm.put("Name ", "Kawasaki");
        lhm.put("country", "Japan");
        lhm.put("city", "Osaka");
        lhm.put("age", null);
        System.out.println(wherereturn(lhm));



    }

    private static String wherereturn(LinkedHashMap<String, String> lhm) {
        StringBuilder sb = new StringBuilder();
        Stream<Map.Entry<String, String>> stream = lhm.entrySet().stream();
        stream.filter(x->x.getValue()!=null).forEach(x-> sb.append(x.getKey()).append(" = ").append(x.getValue()).append("     "));
        sb.setLength(sb.length() - 5);
        return String.valueOf(sb);

    }
    }

