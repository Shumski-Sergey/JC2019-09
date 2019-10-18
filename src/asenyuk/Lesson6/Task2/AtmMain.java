package asenyuk.Lesson6.Task2;

public class AtmMain {
    public static void main(String[] args) {


        ATM atm =new ATM(0,0,0);

        atm.addCountOfCasset(1000,500,200);

        atm.showCasset();
       if ( ( atm.cashWithdrawal() ) && ( atm.checkCasset () )) {


           System.out.println("Выдаем");

           atm.changeCount();

           atm.showCasset();

       }

       else  System.out.println("Не выдаем");


    }

}
