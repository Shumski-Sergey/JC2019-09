package vtafeliuk.Lesson6.BankingCards;

import java.util.Scanner;

public class CardVisa extends Card {
    int cvvCardCode;

    public CardVisa(String cardName, String cardHolder, char currency) {
        super(cardName, cardHolder, currency);
    }

    public void setCvvCardCode(int cvvCardCode) {
        this.cvvCardCode = cvvCardCode;
    }
    public int getCvvCardCode() {
        return this.cvvCardCode;
    }

    public boolean check (int checkCVV){

        if (checkCVV == cvvCardCode){
            return true;
        } else {
            return false;
        }
    }

    public  int withdrawMoney(int sum) {
        System.out.println("Введите сумму списания с карты: ");
        sum = new Scanner(System.in).nextInt();
        if (currentBalance < sum){
            System.out.println("Недостаточно средств! Текущий баланс карты " + cardName+ " : " + currentBalance +" " + currency);
        } else {
            currentBalance -= sum;
            System.out.println("Баланс после списания " + sum + " равен: " + currentBalance + " " + currency);
        }
        return currentBalance;
    }
}
