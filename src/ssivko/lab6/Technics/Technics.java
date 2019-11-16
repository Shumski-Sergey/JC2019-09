package ssivko.lab6.Technics;

public class Technics {
    String color;
    int weight;
    String form;
    String consumptionAA;


    Technics(String Technicscolor, int Technicsweight, String Technicsform, String TechnicsconsumptionAA){
        this.color = Technicscolor;
        this.weight = Technicsweight;
        this.form = Technicsform;
        this.consumptionAA = TechnicsconsumptionAA;

    }

    String metod(){
        return "цвет: " + color + ", вес: " + weight + "кг,  форма: " + form + ", энергопотребление: " + consumptionAA + ".";
    }

   public void boiling(){
       System.out.println("Подогрев воды ");
    }

    public void noise(){
        System.out.println("Издаваемый шум ");
    }

}
