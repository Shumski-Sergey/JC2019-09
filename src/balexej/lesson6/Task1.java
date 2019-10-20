package balexej.lesson6;

/*A1.Создать иерархию классов, описывающих бытовую технику. Создать
несколько объектов описанных классов, часть из них включить в розетку.
Иерархия должна иметь хотя бы три уровня. */

class Task1 {
    private int power;
public int getPower(){
    return power;
}
     void setPower(){
       power = 220;
   }

   void ofOn(){
       if (power>219){
           System.out.println("Техника готова к  работе ");
       }
       else   {
           System.out.println("Проверте подключение к сети ");
       }
   }


  }

    class TestDriveTask1 {
    public static void main(String [] args){
        Task1 one = new Task1();
        one.setPower();
        one.ofOn();
    }
}




