package akhrapskaya.Lesson5;
//80-105
/*5. Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского алфавита,
        а среди них – количество слов с равным числом гласных и согласных букв.*/
public class Task5 {
    public static void  main(String[] args) {
        StringArrays str = new StringArrays("Введите количество слов");
        str.setWords("Введите слова:");
        String reg = "[a-zA-Z]+";
        int k = 0;
        int k2 = 0;
            for(int i = 0; i < str.len; i++){
                if(str.get(i).matches(reg)) {
                    k++;
                    k2+=str.countWords(i);
                }
            }
        System.out.println("Количество слов. состоящих только из латинских букв: " + k);
        System.out.println("Из них с одинаком количеством гласных и согласных: " + k2);
    }

}
