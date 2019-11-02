package aflyer.les6.ATM;
import java.util.Scanner;
//2.Создать класс и объекты описывающие Банкомат. Набор купюр находящихся
//в банкомате должен задаваться тремя свойствами: количеством купюр номиналом
//20 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
//снимающую деньги. На вход передается сумма денег. На выход – булевское
//значение (операция удалась или нет). При снятии денег функция должна
//рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
//конструктор с тремя параметрами – количеством купюр. Прочее – на ваше
//усмотрение.

public class Main {
    public static String GetStarted () {
        System.out.println("\n");
        System.out.println("Здравствуйте! Выберите пожайлуйста операцию:");
        System.out.println("Если вы хотите пополнить банкомат - нажмите '1' ");
        System.out.println("Если вы хотите снять средства - нажмите '2' ");
        System.out.println("Если вы хотите завершить работу программы - нажмите '0' ");
        Scanner sc = new Scanner(System.in);
        String Answer = sc.next();

        if ( !Answer.equals("1") && !Answer.equals("2") && !Answer.equals("0")) GetStarted();
        return Answer;
    }
    public static void main(String[] args)  {
        ATMBank atm = new ATMBank();
        String x="";
        while (!x.equals("0")) {
            x = GetStarted();
            switch (x) {
                case "1": {
                    atm.AddinMoney();
                    break;
                }
                case "2": {
                    atm.GivinMoney();
                    break;
                }
            }
        }
        System.out.println("Спасибо!");


    }
}
