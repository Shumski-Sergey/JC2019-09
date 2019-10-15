package stitov.Lesson2.Lesson6.Card;

public class CreditCard extends PersonalCard {
    public CreditCard(String hold, int eMonth, int eYear, int cCode, String numb, String nBank, String nCard) {
        super(hold, eMonth, eYear, cCode, numb, nBank, nCard);
        this.creditLimit = 0;
        this.creditBalance =0;
    }
    private long creditLimit;
    private long creditBalance;
    public long getCreditLimit(){return this.creditLimit;}
    public void setCreditLimit(long creditLimit) { this.creditLimit = creditLimit; }
    public long getCreditBalance() {return this.creditBalance;}
    public void setCreditBalance(long creditBalance){this.creditBalance = creditBalance;}

    public void withdrawMoney (long money){
        if (money>this.creditLimit+this.getBalance()){
            System.out.println("Not enough money!");
        } else if (money<this.getBalance()) {
            super.withdrawMoney(money);
        } else {
            long temp = money-this.getBalance();
            super.withdrawMoney(this.getBalance());
            this.creditLimit -=temp;
        }
    }
    public void showBalance(){
        System.out.println("Balance: "+this.getBalance()+"$");
        System.out.println("Creditbalance: "+this.getCreditLimit()+"$");
    }
}
