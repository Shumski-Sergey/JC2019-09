package akhrapskaya.Lesson6.Appliances;

public class App {
    private int power;
    private int enCon;

    protected App(int power, int enCon){
        this.power = power;
        this.enCon = enCon;
    }
    protected void match(){
        System.out.println("Моя мощность: " + power + ". Энергопотребление: " + enCon + ".");
    }
    protected void turnOn(){
        System.out.println("Я включен в розетку.");
    }
    protected void turnOff(){
        System.out.println("Я выключен.");
    }
}
