package AlexandraShokhan.lesson11;

// 1. Сформируй часть запроса WHERE используя StringBuilder. Если значение null, то параметр не должен попадать в
// запрос. Пример: {"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null} Результат: "name = 'Ivanov'
// and country = 'Ukraine' and city = 'Kiev'"

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String parameter1 = "name";
        String parameter2 = "country";
        String parameter3 = "city";
        String parameter4 = "age";

        Map<String, String> data = new HashMap<>();
        data.put("name", requestValue(parameter1));
        data.put("country", requestValue(parameter2));
        data.put("city", requestValue(parameter3));
        data.put("age", requestValue(parameter4));

        StringBuilder query = new StringBuilder("SELECT * FROM table WHERE ");

        int counter = 0;
        for(Map.Entry<String, String> entry : data.entrySet()) {
            counter++;
            if (!entry.getValue().equals("")) {
                query.append(String.format("%s = \'%s\'", entry.getKey(), entry.getValue()));
                if (counter != data.size()) {
                    query.append(" AND ");
                } else query.append(";");
            }
        }
        System.out.println(query);
    }
    public static String requestValue(String parameter){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter " + parameter + ":");
        String value = in.nextLine();
        return value;
    }
}
