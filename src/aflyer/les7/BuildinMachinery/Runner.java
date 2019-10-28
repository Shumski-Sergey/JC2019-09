package aflyer.les7.BuildinMachinery;
//Я решил немного изменить условия задачи и вместо домашней техники описать строительную технику.
//Условием включения в розетку принял наличие топлива в баке.

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static String inPut() {
        System.out.println("\n");
        System.out.println("Здравствуйте! Выберите пожайлуйста операцию:");
        System.out.println("Если нашлась новая однороторная машинка - нажмите '1' ");
        System.out.println("Если нашли двуроторную машинку - нажмите '2' ");
        System.out.println("Если это машинка для укладки - нажмите '3' ");
        System.out.println("Глянем что у нас есть? - нажмите '4' ");
        System.out.println("На сегодня хватит? - нажмите '0' ");
        Scanner sc = new Scanner(System.in);
        String Answer = sc.next();

        if (!Answer.equals("1") && !Answer.equals("2") && !Answer.equals("3") && !Answer.equals("4") && !Answer.equals("0"))
            inPut();
        return Answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choise = "";
        int i = 0;
        ArrayList Equipment = new ArrayList<>();
        WalkBehindTrowels Wtrowel = new WalkBehindTrowels();
        RideOnTrowels Rtrowel = new RideOnTrowels();
        LevelinSystems Lsystem = new LevelinSystems();

        System.out.println("Добро пожаловать к нам на стройку! \n А что у нас есть из оборудования?");
        while (!choise.equals("0")) {
            choise = inPut();
            switch (choise) {
                case "1": {
                    Wtrowel = WalkBehindTrowels.addNew();
                    Equipment.add(i, Wtrowel);
                    i++;
                    break;
                }
                case "2": {
                    Rtrowel = RideOnTrowels.addNew();
                    Equipment.add(i, Rtrowel);
                    i++;
                    break;
                }
                case "3": {
                    Lsystem = LevelinSystems.addNew();
                    Equipment.add(i, Lsystem);
                    i++;
                    break;
                }
                case "4": {
                    OutPutEverything(Equipment);
                    break;
                }
            }
        }


    }

    public static void OutPutEverything(ArrayList equipment) {
        WalkBehindTrowels wTr = new WalkBehindTrowels();
        RideOnTrowels rTr = new RideOnTrowels();
        LevelinSystems lSys = new LevelinSystems();
        for (int j = 0; j <= equipment.size() - 1; j++) {
            if (WalkBehindTrowels.class.isInstance(equipment.get(j))) {
                wTr = (WalkBehindTrowels) equipment.get(j);
                WalkBehindTrowels.outPut(wTr);
            } else if (RideOnTrowels.class.isInstance(equipment.get(j))) {
                rTr = (RideOnTrowels) equipment.get(j);
                RideOnTrowels.outPut(rTr);
            } else if (LevelinSystems.class.isInstance(equipment.get(j))) {
                lSys = (LevelinSystems) equipment.get(j);
                LevelinSystems.outPut(lSys);
            }
        }
    }
}
