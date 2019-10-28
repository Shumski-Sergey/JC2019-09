package vtafeliuk.Lesson6.Tech;

public class Tech {
    String tradeMark;
    int power;
    int price;
    boolean plugIn;
    int warranty;

    public Tech(String tradeMark, int power, int price, boolean plugIn, int warranty) {
        this.tradeMark = tradeMark;
        this.power = power;
        this.price = price;
        this.plugIn = plugIn;
        this.warranty = warranty;
    }

    void isPluggedIn(boolean plugIn){
        System.out.println("Текущее состояние питания от сети: ");
        if (plugIn == true){
            System.out.println("вкл");
        } else {
            System.out.println("выкл");
        }
    }

    public boolean turnOffItem (boolean plugIn){
        System.out.println("Отрубаем питание.");
        if(plugIn == true){
            this.plugIn = false;
        }
        return this.plugIn;
    }

    public boolean turnOnItem(boolean plugIn){
        System.out.println("Подключаем в сеть.");
        if(plugIn == false){
            this.plugIn = true;
        }
        return this.plugIn;
    }
}
