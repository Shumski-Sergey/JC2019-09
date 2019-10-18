package akhrapskaya.Lesson5;

/*7. Ввести n слов с консоли. Найти слово, состоящее только из различных символов.
        Если таких слов несколько, найти первое из них.*/

public class Task7 {
    public static void  main(String[] args) {
        StringArrays str = new StringArrays("Введите количество слов");
        str.setWords("Введите слова");
        boolean n = false;
        for( int i =0; i < str.len; i++){
            if ( str.countSymbol(i) == str.get(i).length() ){
                n = true;
                System.out.println("Слово состоящее из различных символов:" + str.get(i));
                break;
            }
        }
        if (!n)
            System.out.println("Нет слов состоящих из различных символов");
    }
}
