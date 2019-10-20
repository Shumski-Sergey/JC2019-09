package balexej.lesson6.Task2;

public class Salary extends Card {


    public Salary(String name, String currency, int cash){
       super(name, currency, cash);
    }
   private int balance;

    public Salary() {
        super();
    }


    public int getBalance(){
        return balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void pay(){
   while (this.balance>0){
       System.out.println("Баланс положительный" + this.balance);

   }
}
}