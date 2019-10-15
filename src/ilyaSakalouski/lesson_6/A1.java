package ilyaSakalouski.lesson_6;

public class A1 {
    public static void main(String[] args) {
        Home_1 refrigerator = new Home_1();
        refrigerator.color = "белый";
        refrigerator.name = "холодильник";
        refrigerator.power = 2.5;

        refrigerator.discribe();
        refrigerator.discribe_2();
        refrigerator.discribe_3();
        refrigerator.discribe_4();

        Home_1 iron = new Home_1();
        iron.name = "утюг";
        iron.color = "чёрный";
        iron.power = 1.2;

        iron.discribe();
        iron.discribe_2();
        iron.discribe_3();
        iron.discribe_4();

        Home_1 robot_vacuum_cleaner = new Home_1();

        robot_vacuum_cleaner.name = "робот-пылесос";
        robot_vacuum_cleaner.color = "серый";
        robot_vacuum_cleaner.power = 2.0;

        robot_vacuum_cleaner.discribe();
        robot_vacuum_cleaner.discribe_2();
        robot_vacuum_cleaner.discribe_3();
        robot_vacuum_cleaner.discribe_5();
    }

    static class Home_1 {
        String color;
        String name;
        double power;

        void discribe() {
            System.out.print("Привет кожаный ублюдок! Я смотрю тебя нормально торкнуло... Я " + color + " ");
        }

        void discribe_2() {
            System.out.print(name + " с мощностью ");
        }

        void discribe_3() {
            System.out.println(power + " kW.");
        }

        void discribe_4() {
            System.out.println("И я включен в розетку");
        }

        void discribe_5() {
            System.out.println("И я не включен в розетку");
        }

    }

    static class Home_2 {   // ХОЧУ ЧТОБЫ В ЭТОМ КЛАССЕ ВЫЗЫВАЛСЯ МЕТОД, КОТОРЫЙ БУДЕТ ВЫВОДИТЬ (name + " с мощностью ")
        String name;

        void discribe_2() {
            System.out.print(name + " с мощностью ");
        }
    }

    static class Home_3 {  // ХОЧУ ЧТОБЫ В ЭТОМ КЛАССЕ ВЫЗЫВАЛСЯ МЕТОД, КОТОРЫЙ БУДЕТ ВЫВОДИТЬ (power + " kW.")
        double power;

        void discribe_3() {
            System.out.println(power + " kW.");
        }
    }

    static class Home_4 {   // ХОЧУ ЧТОБЫ В ЭТОМ КЛАССЕ ВЫЗЫВАЛСЯ МЕТОД, КОТОРЫЙ БУДЕТ ВЫВОДИТЬ ("И я включен в розетку") ИЛИ ("И я не включен в розетку")
        void discribe_4() {
            System.out.println("И я включен в розетку");
        }
        void discribe_5() {
            System.out.println("И я не включен в розетку");
        }


    }

}
