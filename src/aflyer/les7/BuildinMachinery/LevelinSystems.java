package aflyer.les7.BuildinMachinery;

import java.util.Scanner;

public class LevelinSystems extends RideOnTrowels {
    private int PerfomancePerDay;
    private int LevelAccuracy;


    public LevelinSystems(int storeNumber, String brand, String model, int perfomancePerDay, int levelAccuracy, String buildinSite, boolean fueled) {
        super.StoreNumber = storeNumber;
        super.Brand = brand;
        super.Model = model;
        this.PerfomancePerDay = perfomancePerDay;
        this.LevelAccuracy = levelAccuracy;
        super.BuildinSite = buildinSite;
        super.fueled = fueled;
    }

    public LevelinSystems() {
        this.StoreNumber = 0;
        this.Brand = "";
        this.Model = "";
        this.PerfomancePerDay = 0;
        this.LevelAccuracy = 0;
        this.BuildinSite = "";
        this.fueled = false;

    }


    public int getLevelAccuracy() {
        return LevelAccuracy;
    }

    public void setLevelAccuracy(int levelAccuracy) {
        LevelAccuracy = levelAccuracy;
    }

    public int getPerfomancePerDay() {
        return PerfomancePerDay;
    }

    public void setPerfomancePerDay(int perfomancePerDay) {
        PerfomancePerDay = perfomancePerDay;
    }


    public static LevelinSystems addNew() {
        LevelinSystems newSystem = new LevelinSystems();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите модель:");
        newSystem.setModel(sc.next());
        System.out.println("Введите производителя сего чуда");
        newSystem.setBrand(sc.next());
        System.out.println("А что это за объект то?");
        newSystem.setBuildinSite(sc.next());
        System.out.println("Давай номер ей придумаем:");
        newSystem.setStoreNumber(sc.nextInt());
        return newSystem;
    }

    public static void outPut(LevelinSystems trowels) {
        System.out.println("Машинка: " + trowels.getBrand() + " " + trowels.getModel() + " на объекте:" + trowels.getBuildinSite() + " инв. номер: " + trowels.getStoreNumber());
        ;
    }
}
