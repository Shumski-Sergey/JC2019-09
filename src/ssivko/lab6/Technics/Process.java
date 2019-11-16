package ssivko.lab6.Technics;

public class Process {
    public static void main(String[] args) {
        ElectricKettle electricKettle = new ElectricKettle("Black",6,"Oval", "B+");
        Fridge fridge = new Fridge("White", 65, "rectangle", "AA+");
        Dishwasher dishwasher = new Dishwasher("No color", 45, "square", "A");
        Washer washer = new Washer("silver", 55, "square", "A");

        System.out.println("Электрический чайник обладает параметрами: " + electricKettle.metod());
        electricKettle.boiling();
        electricKettle.noise();
        electricKettle.useWater();

        System.out.println("\nХолодильник обладает параметрами: " + fridge.metod());
        fridge.noise();

        System.out.println("\nПосудомоечная машина обладает параметрами: " + dishwasher.metod());
        dishwasher.boiling();
        dishwasher.noise();
        dishwasher.useWater();

        System.out.println("\nСтиральная машина обладает параметрами: " + washer.metod());
        washer.boiling();
        washer.noise();
        washer.useWater();

    }
}
