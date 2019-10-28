package vtafeliuk.Lesson6.BankingCards;

import java.util.Scanner;

public class CardVisaElectron extends CardVisa {
    private final String cardType = "Electron";
    private final int CREDITLIMIT = 0;

    public CardVisaElectron(String cardName, String cardHolder, char currency) {
        super(cardName, cardHolder, currency);
    }

    public static void main(String[] args) {
        CardVisaElectron firstCard = new CardVisaElectron("Dollars", "Vitali", '$');
        CardVisaElectron secondCard = new CardVisaElectron("Euro", "Vitali", '€');
        CardVisaElectron thirdCard = new CardVisaElectron("Dollars2", "Masha", '$');

        firstCard.setCvvCardCode(111);
        secondCard.setCvvCardCode(111);
        thirdCard.setCvvCardCode(333);
        firstCard.setCurrentBalance(1000);
        secondCard.setCurrentBalance(2000);
        System.out.println("У нас есть три карты. Операции по какой карте Вы желаете увидеть? Введите число от 1 до 3: ");
        switch ((new Scanner(System.in).nextInt())) {
            case  (1):
                System.out.println("cvv код " + firstCard.cardName + " карты: " + firstCard.getCvvCardCode());
                firstCard.checkCVVNotification();
                if (firstCard.check(new Scanner(System.in).nextInt())) {
                    firstCard.showBalance();
                    firstCard.invoiceMoney(600);
                    firstCard.withdrawMoney(2000);
                } else {
                    firstCard.failureNotification();
                }
                break;
            case (2):
                System.out.println("cvv код " + secondCard.cardName + " карты: " + secondCard.getCvvCardCode());
                secondCard.checkCVVNotification();
                if (secondCard.check(new Scanner(System.in).nextInt())) {
                    secondCard.showBalance();
                    secondCard.invoiceMoney(600);
                    secondCard.withdrawMoney(2000);
                } else {
                    secondCard.failureNotification();
                }
                break;
            case (3):
                System.out.println("Тип карты: " + thirdCard.cardType);
                System.out.println("Лимит кредитования: " + thirdCard.CREDITLIMIT + " " + thirdCard.currency);
                System.out.println("cvv код " + thirdCard.cardName + " карты: " + thirdCard.getCvvCardCode());
                thirdCard.checkCVVNotification();
                if (thirdCard.check(new Scanner(System.in).nextInt())) {
                    thirdCard.showBalance();
                    thirdCard.invoiceMoney(600);
                    thirdCard.withdrawMoney(2000);
                } else {
                    thirdCard.failureNotification();
                }
                break;
            default:
                System.out.println("ну и зачем ты ввёл другое число?");
                break;

        }
    }
}