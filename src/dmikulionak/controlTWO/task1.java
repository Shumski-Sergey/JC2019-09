package dmikulionak.controlTWO;

import java.util.Scanner;

//В данной строке найти количество цифр. Вывести количество и сумму цифр.

public class task1 {
    public static void main(String[] args) {
        String textIn = "Введите строку с данными"; // sada 12 sad asd as 6 das7 7 6s 5
        String regExNumb = "\\D";
        String delimiter = "";
        int summ;


        Scanner in = new Scanner(System.in);
        System.out.println(textIn);
        String data = in.nextLine();

        String result = data.replaceAll(regExNumb, delimiter);

        int num = Integer.parseInt(result);
        summ = sum(num);

        System.out.println("Сумма цифр в строке - " + summ);
        System.out.println("Колличество цифр в строке - "+result.length());
    }

    private static int sum(int n) {
        if (n < 10) return n;
        return n % 10 + sum(n / 10);

    }
}

