package balexej.lesson6and7.Task2;

public class CreditCard extends Salary {
    private  int creditLimit;


    public CreditCard() {
        super();
    }

    public int getCreditLimit() {
        return creditLimit;
    }
    public void setCreditLimit(int creditLimit){
        this.creditLimit = creditLimit;
    }
    void takeMoney(int x){
        x = 0;
        while ( x  > this.creditLimit){
            System.out.println("Кредит доступен");

        }
    }
}
