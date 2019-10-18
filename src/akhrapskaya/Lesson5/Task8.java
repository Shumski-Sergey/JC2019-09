package akhrapskaya.Lesson5;
/*8. Ввести n слов с консоли. Среди слов, состоящих только из цифр, найти слово-палиндром.
        Если таких слов больше одного, найти второе из них.*/

public class Task8 {
    public static void  main(String[] args) {
        StringArrays str = new StringArrays("Введите количество слов");
        str.setWords("Введите слова");
        String reg = "[0-9]+";
        int k = digitPal(reg, str);
        if( k != -1)
            System.out.println("Число-палиндром: " + str.get(k));
        else
            System.out.println("Таких чисел нет.");
    }
    private static int digitPal(String reg, StringArrays str ){
        StringBuffer s;
        int n = 0;
        int k = -1;
        for(int i = 0; i < str.len; i++){
            if(str.get(i).matches(reg)) {
                s = new StringBuffer(str.get(i));
                s.reverse();
                if ( String.valueOf(s).equals(str.get(i))){
                    n++;
                    k = i;
                }
                if( n > 1)
                    break;
            }
        }
        return k;
    }
}
