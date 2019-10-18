package balexej.lesson5;
//3. Имеется строка с текстом. Вывести текст, составленный из последних букв
//        всех слов
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        System.out.println(a);

        Pattern p =Pattern.compile(".\\b");
        Matcher match = p.matcher(a);
        int i=0;
        while (match.find()){ i++;
            System.out.print(match.group());}
        System.out.println(i );
}
}
