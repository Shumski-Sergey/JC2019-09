package ilyaSakalouski.lesson_6_and_7.HouseTechnics;

public class VacuumCleaner extends Served {
    protected VacuumCleaner(int power, double weight, String name, int packetSize) {
        super(power, weight, name, packetSize);
    }
    private void Service(){
        System.out.println("Замените пакет!");
    }

    public static void main(String[] args) {

        VacuumCleaner vc = new VacuumCleaner(2,4.5,"пылесос",3);
        vc.Say();
        vc.On();
        vc.Service();
        System.out.println();

        VacuumCleaner rg = new VacuumCleaner(4,45.0,"холодильник",0);
        rg.Say();
        rg.Off();
    }
}
