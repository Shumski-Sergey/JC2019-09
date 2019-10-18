package ilyaSakalouski.lesson_6_and_7;
/* Создать класс и объекты описывающие Банкомат. Набор купюр находящихся
в банкомате должен задаваться тремя свойствами: количеством купюр номиналом
20 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
снимающую деньги. На вход передается сумма денег. На выход – булевское
значение (операция удалась или нет). При снятии денег функция должна
рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
конструктор с тремя параметрами – количеством купюр. Прочее – на ваше
усмотрение.*/

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Какую операцию вы хотите выполнить?");
        String o = sc.nextLine();
        String p = "пополнить";
        String s = "снять";
        if (o.equals(p)){
            System.out.println("вставте купюры");
            int money = sc.nextInt();
        }else if (o.equals(s)){
            System.out.println("введите сумму");
            int sum = sc.nextInt();
            if (sum <=3/*balance*/){
                //takeMoney
            }else {
                System.out.println("недостатьчно средств");
            }
        }else System.out.println("ошибка операции");
    }

}
