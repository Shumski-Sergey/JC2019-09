package ssivko.lab6.Technics;

public class Dishwasher extends ElectricKettle {
    Dishwasher(String Technicscolor, int Technicsweight, String Technicsform, String TechnicsconsumptionAA){
        super(Technicscolor,  Technicsweight,  Technicsform,  TechnicsconsumptionAA);
    }
    @Override
    public void noise(){
        System.out.println("Безшумная ");

    }
    @Override
    public void boiling (){
        System.out.println("Свойство: подогрев воды ");

    }
    @Override
    public void useWater (){
        System.out.println("Расход воды 4 л/ч");
    }
}

