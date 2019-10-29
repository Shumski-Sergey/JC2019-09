package aflyer.les7.BuildinMachinery;

import java.util.Scanner;

public class RideOnTrowels extends WalkBehindTrowels {
    public int NumberOfRotors;


    public RideOnTrowels(int storeNumber, String brand, String model, int NumberOfRotors, String buildinSite, boolean fueled) {
        super.StoreNumber = storeNumber;
        super.Brand = brand;
        super.Model = model;
        this.NumberOfRotors = NumberOfRotors;
        super.BuildinSite = buildinSite;
        super.fueled = fueled;

    }

    public RideOnTrowels() {
        this.StoreNumber = 0;
        this.Brand = "";
        this.Model = "";
        this.NumberOfRotors = 0;
        this.BuildinSite = "";
        this.fueled = false;
    }

    public int getNumberOfRotors() {
        return NumberOfRotors;
    }

    public void setNumberOfRotors(int NumberOfRotors) {
        this.NumberOfRotors = NumberOfRotors;
    }

    public static RideOnTrowels addNew() {
        RideOnTrowels newTrowel = new RideOnTrowels();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите модель:");
        newTrowel.setModel(sc.nextLine());
        System.out.println("Введите производителя сего чуда");
        newTrowel.setBrand(sc.next());
        System.out.println("А что это за объект то?");
        newTrowel.setBuildinSite(sc.next());
        System.out.println("Давай номер ей придумаем:");
        newTrowel.setStoreNumber(sc.nextInt());
        return newTrowel;
    }

    public static void outPut(RideOnTrowels trowels) {
        System.out.println("Машинка: " + trowels.getBrand() + " " + trowels.getModel() + " на объекте:" + trowels.getBuildinSite() + " инв. номер " + trowels.getStoreNumber());
    }
}
