package ssivko.lab6.Technics;

public class Technics {
    String color;
    int weigin;
    String form;
    String consumptionAA;


    Technics(String Technicscolor, int Technicsweigin, String Technicsform, String TechnicsconsumptionAA){
        color = Technicscolor;
        weigin =Technicsweigin;
        form = Technicsform;
        consumptionAA =TechnicsconsumptionAA;


    }

   public void consumption(){
       System.out.println("Потребление электричества");
    }

    public void noise(){
        System.out.println("Издаваемый шум ");
    }

}
