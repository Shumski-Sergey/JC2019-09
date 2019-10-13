package akhrapskaya.Lesson5;

/*6. Ввести n слов с консоли. Найти слово, символы в котором идут в стро-гом порядке возрастания их кодов.
        Если таких слов несколько, найти первое из них.*/
public class Task6 {
    public static void  main(String[] args) {
        StringArrays str = new StringArrays("Введите количество слов");
        str.setWords("Введите слова");
        for( int i = 0; i < str.len; i++){
            boolean n = true;
            for( int j =1; j < str.get(i).length(); j++){
                if ( str.get(i).charAt(j) <= str.get(i).charAt(j-1)){
                    n = false;
                    break;
                }
            }
            if (n){
                System.out.println("Первое слово, в котором символы идут в порядке возрастания:" + str.get(i));
                break;
            }
        }
    }
}
