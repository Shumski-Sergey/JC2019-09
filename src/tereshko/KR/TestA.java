package tereshko.KR;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestA {
    private static final Pattern pattern = Pattern.compile("(\\d+)");
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку");
        String text = null;
        try {
            text = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        getSumAndCount(text);

    }
    private static void getSumAndCount(String text) {
        int sum = 0;
        int count = 0;
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
            count++;
        }
        System.out.printf("Кол-во чисел в строке: %s%nСумма чисел: %s", sum, count);
    }
}
