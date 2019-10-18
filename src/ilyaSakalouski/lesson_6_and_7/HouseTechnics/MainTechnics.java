package ilyaSakalouski.lesson_6_and_7.HouseTechnics;

public class MainTechnics extends Served {
    protected MainTechnics(int power, double weight, String name, int packetSize) {
        super(power, weight, name, packetSize);
    }
    private void Service(){
        System.out.println("Замените пакет!");
    }

    public static void main(String[] args) {

        MainTechnics vc = new MainTechnics(2,4.5,"пылесос",3);
        vc.Say();
        vc.On();
        vc.Service();
        System.out.println();

        MainTechnics rg = new MainTechnics(4,45.0,"холодильник",0);
        rg.Say();
        rg.Off();
    }
}
