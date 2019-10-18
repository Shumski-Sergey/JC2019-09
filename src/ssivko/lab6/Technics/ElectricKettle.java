package ssivko.lab6.Technics;

public class ElectricKettle extends Technics {
    ElectricKettle(){
        super("Black",6,"Oval", "B+");
    }


    public void noise (){
        System.out.println("Очень шумит");
    }

   public void boiling (){
     System.out.println("Подогрев воды ");

 }
   public void useWater (){
     System.out.println("Расход воды ");
 }
}
