package AlexandraShokhan.lesson11;

// 1. Сформируй часть запроса WHERE используя StringBuilder. Если значение null, то параметр не должен попадать в
// запрос. Пример: {"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null} Результат: "name = 'Ivanov'
// and country = 'Ukraine' and city = 'Kiev'"

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);

        System.out.println(whereReturn(map));
    }

    private static String whereReturn(LinkedHashMap<String, String> map) {
        StringBuilder stringBuilder = new StringBuilder();
        Stream<Map.Entry<String, String>> stream = map.entrySet().stream(); //Преобразуем данные из map в поток

        stream.filter(x -> x.getValue() != null).forEach(x -> stringBuilder.append(x.getKey()).append(" = '").append(x.getValue()).append("' and "));
        stringBuilder.setLength(stringBuilder.length() - 5);

        return String.valueOf(stringBuilder);
    }
}
