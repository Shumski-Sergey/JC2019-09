package akhrapskaya.Lesson5;

//3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.

public class Task3S {
    public static void  main(String[] args){
        StringArrays str = new StringArrays("Введите количество строк");
        str.set("Введите строки");
        str.sort();
        int mid = str.len/2 ;
        System.out.println("Строки меньшей длины, чем средняя:");
        for( int i =0; i < mid; i++) {
            if (str.get(i).length() != str.get(mid).length())
                str.outPutLine(i);
        }
        System.out.println("Строки большей длины, чем средняя:");
        for( int i =mid+1; i < str.len; i++) {
            if (str.get(i).length() != str.get(mid).length())
                str.outPutLine(i);
        }
    }
}
