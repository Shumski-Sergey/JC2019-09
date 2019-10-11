package akhrapskaya.Lesson5;


//1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.

public class Task1 {
    private static int maxi(StringArrays str){
        int maxi = 0;
        for( int i =1; i < str.len; i++)
            if(str.get(i).length() > str.get(maxi).length())
                maxi = i;
        return maxi;
    }
    private static int mini(StringArrays str){
        int mini = 0;
        for( int i =1; i < str.len; i++)
            if(str.get(i).length() < str.get(mini).length())
                mini = i;
        return mini;
    }
    public static void  main(String[] args){
        StringArrays str = new StringArrays("Введите количество строк");
        str.set("Ведите строки:");
        int maxi = maxi(str);
        int mini = mini(str);
        System.out.println("Самая длинная строка -" + str.get(maxi) + "(" + str.get(maxi).length() + ")" );
        System.out.println("Самая короткая строка -" + str.get(mini) + "(" + str.get(mini).length() + ")" );
    }

}
