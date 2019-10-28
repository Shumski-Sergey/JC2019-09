package vtafeliuk.Lesson6.BankingCards;

import java.util.Scanner;

public class Card {
    String cardName;
    String cardHolder;
    char currency;
    int currentBalance;

    public Card(String cardName, String cardHolder, char currency) {
        this.cardName = cardName;
        this.cardHolder = cardHolder;
        this.currency = currency;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }
    public int getCurrentBalance() {
        return currentBalance;
    }

    public void showBalance() {
        System.out.println("Баланс " + cardName + " карты = " + currentBalance +" "+ currency);
    }

    public int invoiceMoney(int sum) {
        currentBalance += sum;
        System.out.println("Баланс " + cardName + " карты после пополнения на " + sum + " равен: " + currentBalance + " " + currency);
        return currentBalance;
    }

    public void checkCVVNotification(){
        System.out.println("Введите CVV код ");
    }

    public void failureNotification(){
        System.out.println("Код неверный! В доступе отказано! Пробуйте заново.");
    }

}
