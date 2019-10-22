package balexej.lesson6.ATM;

public class Money {
  private int n1 = 20;
  private int n2 = 50;
  private int n3 = 100;

  public int getN1(){ return n1;}
  public int getN2(){ return n2;}
  public int getN3(){ return n3;}

  public void setN2(int n2){this.n2 = n2;}
    public void setN1(int n1){this.n1 = n1;}
    public void setN3(int n3){this.n3 = n3;}

   public Money(int n1,int n2,int n3){
       this.n1 = n1;
       this.n2 = n2;
       this.n3 = n3;

   }

}
