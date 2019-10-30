package akhrapskaya.Lesson5;


/*1.Напишите два цикла выполняющих многократное сложение строк, один
        с помощью оператора сложения и String, а другой с помощью StringBuilder
        и метода append. Сравните скорость их выполнения.*/
public class TaskB1 {
    public static void  main(String[] args) {
        final int k = 1000;
        String s = "Напишите два цикла выполняющих многократное сложение строк. ";
        String s1= "";
        long start = System.currentTimeMillis();
        for(int i = 0; i < k; i++){
            s1+=s;
        }
        long finish = System.currentTimeMillis();
        System.out.println("Время цикла с оператором сложения:" + (finish - start));
        StringBuilder str = new StringBuilder(s);
        start = System.currentTimeMillis();
        for(int i = 0; i < k; i++){
            str.append(s);
        }

        finish = System.currentTimeMillis();
        System.out.println("Время цикла со StringBuilder:" + (finish - start));

    }
}
