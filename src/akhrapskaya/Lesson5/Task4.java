package akhrapskaya.Lesson5;

/*4. Ввести n слов с консоли. Найти слово, в котором число различных символов минимально.
        Если таких слов несколько, найти первое из них.*/
//60-78

public class Task4 {
    public static void  main(String[] args) {
        StringArrays w = new StringArrays("Введите количество слов");
        w.setWords("Введите слова:");
        System.out.println(w.minSymbol());
    }

}
