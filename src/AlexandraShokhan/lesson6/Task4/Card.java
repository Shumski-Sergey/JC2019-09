package AlexandraShokhan.lesson6.Task4;

abstract class Card {
    String ownerName;
    String paymentAdapter;
    int maxTransactionLimit;
    int monthlyServiceFee;
    int incomingTransferFee;
    int outgoingTransferFee;
    double balance;
    boolean isBlocked;

    void makeTransfer(int amount) {
        if (isBlocked == false) {
            if (balance >= amount) {
                if (amount <= maxTransactionLimit) {
                    balance = balance - (amount + outgoingTransferFee);
                    System.out.println("Outgoing transaction: " + "-" + amount + "(fee: " + outgoingTransferFee + ").");
                } else System.out.println("The requested transfer cannot be processed because the amount exceeds the limit.");
            } else {
                System.out.println("Not enough funds.");
            }
        } else System.out.println("Your card is blocked. Please contact support.");
    }

    void receiveTransfer(int amount) {
        if (isBlocked == false) {
            balance = balance + amount - incomingTransferFee;
            System.out.println("Incoming transaction: " + "+" + amount + "(fee: " + incomingTransferFee + ").");
            if (balance < 0) {
                isBlocked = true;
                System.out.println("Your balance is negative. Please offset the negative balance to continue using the card.");
            }
        } else System.out.println("Your card is blocked. Please contact support.");
    }

    void withdrawMonthlyFee() {
        balance -= monthlyServiceFee;
        System.out.println("Monthly service fee: " + "-" + monthlyServiceFee);
    }

    void getCardDetails() {
        System.out.println("Owner name: " + ownerName);
        System.out.println("Balance: " + (Math.round(balance * 100.0) / 100.0));
        System.out.println("Payment adapter: " + paymentAdapter);
        if (isBlocked) {
            System.out.println("Status: blocked");
        } else System.out.println("Status: active");
        System.out.println("");
    }
    void blockCard() {
        isBlocked = true;
    }

    void activateCard() {
        isBlocked = false;
    }
}


class DebitCard extends Card {
    double monthlyIntrestRate;

    // Конструктор
    public DebitCard (String ownerName, String paymentAdapter, int maxTransactionLimit, int monthlyServiceFee, int incomingTransferFee,
                      int outgoingTransferFee, double balance, boolean isBlocked, double monthlyIntrestRate) {
        this.ownerName = ownerName;
        this.paymentAdapter = paymentAdapter;
        this.maxTransactionLimit = maxTransactionLimit;
        this.monthlyServiceFee = monthlyServiceFee;
        this.incomingTransferFee = incomingTransferFee;
        this.outgoingTransferFee = outgoingTransferFee;
        this.balance = balance;
        this.isBlocked = isBlocked;
        this.monthlyIntrestRate = monthlyIntrestRate;
    }

    void calculateMonthlyIntrest() {
        balance += balance * monthlyIntrestRate;
        System.out.println("The interest rate for the current month is " + (Math.round(balance * monthlyIntrestRate * 100.0) / 100.0));
    }
}
