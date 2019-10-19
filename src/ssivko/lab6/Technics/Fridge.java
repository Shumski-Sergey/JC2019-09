package ssivko.lab6.Technics;

public class Fridge extends Technics {
    Fridge(String Technicscolor, int Technicsweight, String Technicsform, String TechnicsconsumptionAA){
        super(Technicscolor,  Technicsweight,  Technicsform,  TechnicsconsumptionAA);
    }
    public void noise(){
        System.out.println("Очень тихий ");
    }
}
