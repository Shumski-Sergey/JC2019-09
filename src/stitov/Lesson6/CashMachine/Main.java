package stitov.Lesson6.CashMachine;

public class Main {
    public static void main (String[] args){
        CashMachine cash = new CashMachine(100, 100, 100);
        cash.showAllMoney();
        cash.showNotes();
        cash.addMoney(20, 10,30);
        cash.showAllMoney();
        cash.showNotes();
        if (cash.withdrawMoney(20000)){
            System.out.println("Transaction was succesful");
        } else {
            System.out.println("Transaction rejected");
        }
        cash.showAllMoney();
        cash.showNotes();
    }
}
