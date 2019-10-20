package balexej.lesson6.Task2;
//4.Создать иерархию классов, описывающих банковские карточки.
  //      Иерархия должна иметь хотя бы три уровня.

 public class Card{
         String name;
         String currency;
         int cash;


     public Card(String name,String currency,int cash){
         this.name = name;
         this.currency = currency;
         this.cash = cash;

     }


     public Card() {

     }


     public String getName(){
         return this.name;
     }
     public String getCurrency(){
         return this.currency;
     }
     public int getCash(){
         return this.cash;
     }
     public void setName(String name){
this.name = name;
     }
     public void setCurrency( String currency){
         this.currency = currency;
     }
     public void setCash(int cash){
         this.cash = cash;
     }
 }

