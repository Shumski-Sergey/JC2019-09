package vtafeliuk.Lesson6.Tech;

public class KitchenTech extends Tech {
    private final String location = "kitchen";

    public KitchenTech(String tradeMark, int power, int price, boolean plugIn, int warranty) {
        super(tradeMark, power, price, plugIn, warranty);
    }

    public String getLocation() {
        return location;
    }
}
