package ilyaSakalouski.lesson_6_and_7.HouseTechnics;

public class MainTechnics {

    public static void Service() {
        System.out.println("Замените пакет!");
    }

    public static void main(String[] args) {

        Served vc = new Served(2, 4.5, "пылесос", 3);
        vc.Say();
        vc.On();
        MainTechnics.Service();
        System.out.println();

        Sclass rg = new Sclass(4, 45.0, "холодильник");
        rg.Say();
        rg.Off();
    }
}
