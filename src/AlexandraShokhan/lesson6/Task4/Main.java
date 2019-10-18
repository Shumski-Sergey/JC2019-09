package AlexandraShokhan.lesson6.Task4;

// 4.Создать иерархию классов, описывающих банковские карточки.
//Иерархия должна иметь хотя бы три уровня.

public class Main {
    public static void main(String[] args) {
        DebitCard JohnsCard = new DebitCard("John", "visa", 100, 5,
                1,3,300, false, 0.05);

        JohnsCard.getCardDetails();
        JohnsCard.makeTransfer(27);
        JohnsCard.getCardDetails();
        JohnsCard.receiveTransfer(60);
        JohnsCard.getCardDetails();
        JohnsCard.calculateMonthlyIntrest();
        JohnsCard.getCardDetails();
        JohnsCard.withdrawMonthlyFee();
        JohnsCard.getCardDetails();
        JohnsCard.blockCard();
        JohnsCard.makeTransfer(30);
    }
}
