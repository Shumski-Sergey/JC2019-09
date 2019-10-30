package ssivko.lab6.Technics;

public class Washer extends ElectricKettle{

    Washer(String Technicscolor, int Technicsweight, String Technicsform, String TechnicsconsumptionAA){

        super(Technicscolor,  Technicsweight,  Technicsform,  TechnicsconsumptionAA);
    }
    @Override
    public void boiling (){
        System.out.println("Свойство: подогрев воды ");

    }
    @Override
    public void useWater (){
        System.out.println("Расход воды 7л/ч");
    }
}
