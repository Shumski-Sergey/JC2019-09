package aflyer.les7.BuildinMachinery;

import java.util.Scanner;

public class WalkBehindTrowels {
    public int StoreNumber;
    public String Brand;
    public String Model;
    public String BuildinSite;
    public boolean fueled;


    public WalkBehindTrowels(int storeNumber, String brand, String model, String buildinSite, boolean fueled) {
        this.StoreNumber = storeNumber;
        this.Brand = brand;
        this.Model = model;
        this.BuildinSite = buildinSite;
        this.fueled = fueled;
    }

    public WalkBehindTrowels() {
        this.StoreNumber = 0;
        this.Brand = "";
        this.Model = "";
        this.BuildinSite = "";
        this.fueled = false;
    }


    public int getStoreNumber() {
        return StoreNumber;
    }

    public void setStoreNumber(int storeNumber) {
        this.StoreNumber = storeNumber;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    public String getBuildinSite() {
        return BuildinSite;
    }

    public void setBuildinSite(String buildinSite) {
        this.BuildinSite = buildinSite;
    }

    public boolean isFueled() {
        return fueled;
    }

    public void setFueled(boolean fueled) {
        this.fueled = fueled;
    }

    public static WalkBehindTrowels addNew() {

        WalkBehindTrowels newTrowel = new WalkBehindTrowels();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите модель:");
        newTrowel.setModel(sc.next());
        System.out.println("Введите производителя сего чуда");
        newTrowel.setBrand(sc.next());
        System.out.println("А что это за объект то?");
        newTrowel.setBuildinSite(sc.next());
        System.out.println("Давай номер ей придумаем:");
        newTrowel.setStoreNumber(sc.nextInt());
        return newTrowel;
    }

    public static void outPut(WalkBehindTrowels trowels) {
        System.out.println("Машинка: " + trowels.getBrand() + " " + trowels.getModel() + " на объекте:" + trowels.getBuildinSite() + " инв. номер " + trowels.getStoreNumber());
    }
}
