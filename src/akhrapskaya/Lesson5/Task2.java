package akhrapskaya.Lesson5;

//2. Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.

public class Task2 {

    public static void  main(String[] args){
        StringArrays str = new StringArrays("Введите количество строк");
        str.set("Ведите строки:");
        str.sort();
        str.putOut();
    }
}
