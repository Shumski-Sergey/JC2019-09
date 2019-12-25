package zyahya.OOP;

import org.w3c.dom.ls.LSOutput;

import javax.swing.event.TreeWillExpandListener;
import java.util.Scanner;

//Создать класс и объекты описывающие Банкомат. Набор купюр находящихся
//в банкомате должен задаваться тремя свойствами: количеством купюр номиналом
//20 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
//снимающую деньги. На вход передается сумма денег. На выход – булевское
//значение (операция удалась или нет). При снятии денег функция должна
//рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
//конструктор с тремя параметрами – количеством купюр. Прочее – на ваше
//усмотрение.
public class Bank {
    private int twenty;
    private int fifty;
    private int hundred;
    private static final int TWENTY = 20;
    private static final int FIFTY = 50;
    private static final int HUNDRED = 100;

    public Bank() {
        this.twenty = 0;
        this.fifty = 0;
        this.hundred = 0;
    }

    public Bank(int twenty, int fifty, int hundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.hundred = hundred;

    }

    public int getTwenty() {
        return twenty;
    }

    public int getFifty() {
        return fifty;
    }

    public int getHundred() {
        return hundred;
    }
    public int setTwenty(){
        return twenty;
    }
    public int setFifty(){
        return fifty;
    }
    public int setHundred(){
        return hundred;
    }

    public float getMoney() {
        return twenty * TWENTY + fifty * FIFTY + hundred * HUNDRED;
    }

    public void showMoney() {
        System.out.println("You have : " + this.twenty * TWENTY + this.fifty * FIFTY + this.hundred * HUNDRED + " $");

    }

    public void text() {
        System.out.println("You have : " +this. twenty * TWENTY + " $");
        System.out.println("You have : " + this.fifty * FIFTY + " $");
        System.out.println("You have : " + this.hundred * HUNDRED + " $");
    }

    public void addMoney(int twenty, int fifty, int hundred) {
        this.twenty += twenty;
        this.fifty += fifty;
        this.hundred += hundred;

    }

    public boolean money(int money) {
        int twenty, fifty, hundred;
        int inmoney = money;
        if ((money % TWENTY != 0) || (money % FIFTY != 0)) {
            return false;
        }
        if (money > this.getMoney()) {
            return false;
        }
        hundred = (inmoney - inmoney % HUNDRED) / HUNDRED;

        inmoney -= hundred * HUNDRED;
        fifty = (inmoney - inmoney % FIFTY) / FIFTY;
        inmoney = inmoney - fifty * FIFTY;
        twenty = (inmoney - inmoney % TWENTY) / TWENTY;
        inmoney -= twenty * TWENTY;
        if (inmoney != 0) {
            return false;
        } else {
            this.hundred -= hundred;
            this.fifty -= fifty;
            this.twenty -= twenty;
            return true;
        }
    }


    public static void main(String[] args) {
        Bank machine = new Bank(20, 50, 10);
        machine.showMoney();
        machine.text();
        machine.addMoney(20, 10, 30);
        machine.showMoney();


    }
}




