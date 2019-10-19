package yKuzMinskij.Lab6;
import java.util.Scanner;

/**
 * Создать иерархию классов, описывающих банковские карточки.
 * Иерархия должна иметь хотя бы три уровня.
 */

public class Cards {
    public static void main (String[] args) {
        Client N001 = new Client("Ivanov Ivan Ivanovich");
        Client N002 = new Client("Petrov Petr Petrovich");
        Bank.Card.DebitCards bps = new Bank.Card.DebitCards("BPS", 147258369, 147,
                100, N001.name);
        Bank.Card.CreditCards khalva = new Bank.Card.CreditCards("MTB", 258369741, 785,
                -500, N001.name);

        System.out.println("Вы можете положить деньги на вашу карту");

        bps.CashIn();
        khalva.CashIn();
        bps.infoOut();
        khalva.infoOut();
    }
}
interface cardsInfo{
}

class Client {
    String name;
    Client (String name) {
        this.name = name;
    }
}
class Bank {
    String nameOfBank;

    Bank (String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }

    static class Card extends Bank {
        long number;
        int cvv;

        Card (String nameOfBank, long number, int cvv) {
            super(nameOfBank);
            this.number = number;
            this.cvv = cvv;
        }

        static class DebitCards extends Card implements cardsInfo {
            double balance;
            String nameOfClient;

            DebitCards (String nameOfBank, long number, int cvv, double balance, String nameOfClient) {
                super(nameOfBank, number, cvv);
                this.balance = balance;
                this.nameOfClient = nameOfClient;
            }

            String getBank () {return this.nameOfBank;}
            long getCardNumber () {return this.number;}
            int getCVV () {return this.cvv;}
            String getClientName () {return this.nameOfClient;}
            double getBalance () {return this.balance;}

            void CashIn () {
                Scanner cash = new Scanner(System.in);
                balance += cash.nextDouble();
            }

            void infoOut () {
                System.out.println(getBank() + " " + getClientName() + " "
                        + getBalance() + " " + getCardNumber() + " " + getCVV());
            }
        }
        static class CreditCards extends Card implements cardsInfo {
            double balance;
            String nameOfClient;

            CreditCards (String nameOfBank, long number, int cvv, double balance, String nameOfClient) {
                super(nameOfBank, number, cvv);
                this.balance = balance;
                this.nameOfClient = nameOfClient;
            }
            String getBank () {return this.nameOfBank;}
            long getCardNumber () {return this.number;}
            int getCVV () {return this.cvv;}
            String getClientName () {return this.nameOfClient;}
            double getBalance () {return this.balance;}
            public double CashIn () {
                Scanner cash = new Scanner(System.in);
                balance += cash.nextDouble();
                return balance;
            }
            void infoOut () {
                System.out.println(getBank() + " " + getClientName() + " "
                        + getBalance() + " " + getCardNumber() + " " + getCVV());
            }
        }
}
}