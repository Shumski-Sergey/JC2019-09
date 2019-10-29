package vtafeliuk.Lesson6.Tech;

public class Item extends KitchenTech {
    String purpose;
    String material;
    String name;

    public Item(String tradeMark, int power, int price, boolean plugIn, int warranty, String purpose, String material, String name) {
        super(tradeMark, power, price, plugIn, warranty);
        this.purpose = purpose;
        this.material = material;
        this.name = name;
    }




}
