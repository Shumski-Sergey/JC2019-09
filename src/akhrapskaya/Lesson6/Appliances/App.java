package akhrapskaya.Lesson6.Appliances;

public abstract class App {
    private int power;
    private boolean on;
    protected App(int power){
        this.power = power;

    }
    protected boolean getOn(){
        return on;
    }
    protected void info() {
        System.out.println("Моя мощность: " + power  + ".");
        if (on)
            System.out.println("Включен в розетку и готов к работе!");
        else
            System.out.println("Выключен!");
    }
    protected void turnOn(){
        on = true;
    }
    protected void turnOff(){
        on = false;
    }
}
