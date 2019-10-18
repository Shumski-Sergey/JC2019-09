package dmikulionak.lesson_5_regular;
//Напишите два цикла выполняющих многократное сложение строк, один
//с помощью оператора сложения и String, а другой с помощью StringBuilder
//и метода append. Сравните скорость их выполнения.



public class taskB1 {
    public static void main (String[] args) {

        long startTime = System.currentTimeMillis();
        for (int i = 0; i<1000; i++) {
            String str = "Я изучаю Java";
            StringBuilder sb = new StringBuilder(str);
            sb.append(" и английский тоже надо");
            System.out.println(sb);
        }
        long stopTime = System.currentTimeMillis();

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i<1000; i++) {
            String str1 = "Я изучаю Java";
            str1 += " и английский тоже надо";
            System.out.println(str1);
        }
        long stopTime1 = System.currentTimeMillis();
        System.out.println("Elapsed time was " + (stopTime1 - startTime1) + " miliseconds.");
        System.out.println("Elapsed time was " + (stopTime - startTime) + " miliseconds.");
    }
}
