package yKuzMinskij.Lab6;

import java.util.Scanner;

/**
 * Создать класс и объекты описывающие Банкомат. Набор купюр находящихся
 * в банкомате должен задаваться тремя свойствами: количеством купюр номиналом
 * 20 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
 * снимающую деньги. На вход передается сумма денег. На выход – булевское
 * значение (операция удалась или нет). При снятии денег функция должна
 * рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
 * конструктор с тремя параметрами – количеством купюр. Прочее – на ваше
 * усмотрение.
 */

public class Bankomator {
    public static void main (String[] args) {
        Bankomat Belarusbank = new Bankomat();
        int choise = 0;
        while (choise!=4){
        System.out.println("Выберите тип операции:\n1. Проверка баланса." +
                    "\n2. Пополнение баланса.\n3. Снятие наличных\n4. Выход");
        Scanner sc = new Scanner(System.in);
        choise = sc.nextInt();
        switch (choise){
            case (1) :
                System.out.println("Баланс вашего счёта составляет : " + Belarusbank.getBalance());
                break;
            case (2) :
                Belarusbank.cashIn();
                System.out.println("Баланс вашего счёта : "+Belarusbank.getBalance());
                break;
            case (3) :
                Belarusbank.cashOut();
                break;
            case (4) :
                break;

            }
        }
    }
}
class Bankomat {
    private int Five;
    private int Ten;
    private int Twenty;
    private int Fifty;
    private int Hundred;
    private int sum;
    private int balance;
    Bankomat (){
        this.Five = 0;
        this.Ten = 0;
        this.Twenty = 0;
        this.Fifty = 0;
        this.Hundred = 0;
        this.sum = 0;
        this.balance = 0;
    }
    private void setFive (int five) {this.Five += five;}
    private void setTen (int ten) {this.Ten += ten;}
    private void setTwenty (int twenty) {this.Twenty += twenty;}
    private void setFifty (int fifty) {this.Fifty += fifty;}
    private void setHundred (int hundred) {this.Hundred += hundred;}
    private int getFive () {return Five;}
    private int getTen () {return Ten;}
    private int getTwenty () {return Twenty;}
    private int getFifty () {return Fifty;}
    private int getHundred () {return Hundred;}
    public  int getBalance () {return this.balance;}

    private int addSum () {
        System.out.println("Банкомат принимает и выдаёт купюры достоинтсвом 5, 10, 20, 50, 100 рублей");
        System.out.println("Введите сумму");
        Scanner sc = new Scanner(System.in);
        sum = sc.nextInt();
        if (sum%5!=0) {
            System.out.println("Выввели неверную сумму\nПопробуйте ещё раз.");
            return 0;
        }
        return sum;
    }
    void cashIn () {
        balance += this.addSum();
    }
    void cashOut () {
        System.out.println("Введите сумму которую хотите получить.");
        kol_vo();
        System.out.println("Баланс : " + getBalance() +"\nКупюр к выдаче " + "\n100 : " + getHundred() + "\n50 : " + getFifty()
        + "\n20 : " + getTwenty() + "\n10 : " + getTen() + "\n5 : "+ getFive());
    }
    private void kol_vo (){
        sum = this.addSum();
        if (this.sum>this.balance){
            System.out.println("Недостаточно средств");
        }else {
        balance -= this.sum;
        while (sum>0){
            while (sum>=100){
                setHundred(1);
                sum-=100;
            }
            while (sum>=50){
                setFifty(1);
                sum-=50;
            }
            while (sum>=20){
                setTwenty(1);
                sum-=20;
            }
            while (sum>=10){
                setTen(1);
                sum-=10;
            }
            while (sum>=5){
                setFive(1);
                sum-=5;
            }
        }
    }
  }
}