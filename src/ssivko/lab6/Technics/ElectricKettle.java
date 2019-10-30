package ssivko.lab6.Technics;

public class ElectricKettle extends Technics {

    ElectricKettle(String Technicscolor, int Technicsweight, String Technicsform, String TechnicsconsumptionAA){
        super(Technicscolor,  Technicsweight,  Technicsform,  TechnicsconsumptionAA);
    }

    @Override
    public void noise (){
        System.out.println("Очень шумит");
    }

   public void boiling (){
     System.out.println("Свойство: подогрев воды ");

 }
   public void useWater (){
     System.out.println("Расход воды  2л");
 }
}
