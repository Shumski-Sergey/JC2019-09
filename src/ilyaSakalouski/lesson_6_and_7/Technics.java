package ilyaSakalouski.lesson_6_and_7;

class Technics {
    String color;
    String name;
    double power;
}

class Refrigerator  extends Technics {
    String on = " И я включен в розетку";
}

class Iron extends Technics {
    String on = " И я включен в розетку";
}

class Robot_vacuum_cleaner extends Technics {
    String off = " И я не включен в розетку";
}

class ExtendsTechnics {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.color = " белый";
        refrigerator.name = " холодильник";
        refrigerator.power = 2.5;

        Iron iron = new Iron();
        iron.color = " чёрный";
        iron.name = " утюг";
        iron.power = 1.2;

        Robot_vacuum_cleaner robot_vacuum_cleaner = new Robot_vacuum_cleaner();
        robot_vacuum_cleaner.color = " серый";
        robot_vacuum_cleaner.name = " робот-пылесос";
        robot_vacuum_cleaner.power = 2.0;


        System.out.println("Я " + refrigerator.color + " " + refrigerator.name + " с мощностью " + refrigerator.power + " kW." + refrigerator.on);
        System.out.println("Я " + iron.color + " " + iron.name + " с мощностью " + iron.power + " kW." + iron.on);
        System.out.println("Я " + robot_vacuum_cleaner.color + " " + robot_vacuum_cleaner.name + " с мощностью " + robot_vacuum_cleaner.power + " kW." + robot_vacuum_cleaner.off);
    }
}

