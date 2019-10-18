package asenyuk.Lesson6.Task2;

public class ATM {
  private  int countOfN3; //колличество купюр в кассете номинал 20
    private  int countOfN2; //колличество купюр в кассете номинал 50
    private  int countOfN1; //колличество купюр в кассете номинал 100


    ATM (int  countOfN3,int countOfN2,int countOfN1) {
        this.countOfN3=countOfN3;
        this.countOfN2=countOfN2;
        this.countOfN1=countOfN1;
    }

    void addCountOfCasset (int  countOfN3,int countOfN2,int countOfN1) {
        this.countOfN3=countOfN3;
        this.countOfN2=countOfN2;
        this.countOfN1=countOfN1;
    }

  void showCasset ()
  {
      System.out.println( "колличество купюр в кассете номинал 20 = " +countOfN3);
      System.out.println( "колличество купюр в кассете номинал 50 = " +countOfN2);
      System.out.println( "колличество купюр в кассете номинал 100 = " +countOfN1);
  }

    int sum = 70;
    final int n1 = 100;
   final int n2 = 50;
   final int n3 = 20;


    boolean w;
    int x=0;
    int y=0;
    int z=0;

 boolean cashWithdrawal () {
        while (sum > n1) {
            sum = sum - n1;
            x++;
        }
        while (sum > n2) {
            sum = sum - n2;
            y++;
        }
        if (sum % 20 == 0) {
            while (sum >= n3) {
                sum = sum - n3;
                z++;
                   w = true;
            }

        } else {
            System.out.println("Нельзя выдать");
             w = false;
        }

     //   System.out.println(" x = " + x + " y= " + y + " z= " + z);
     //   System.out.println("w = " + w);

   return  w;

}

boolean checkCasset () {
if ( (countOfN3 -x >=0)  && (countOfN2 -y >=0) && (countOfN1 -z >=0) ) return true;
else return false;

}

void changeCount () {
    countOfN3= countOfN3 -x;
    countOfN2= countOfN3 -y;
    countOfN1= countOfN3 -z;

}


}
