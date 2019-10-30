package ssivko.lab8.TaskA2;

public class Function {
    private static final int NumElMass = 5;

    public static void main(String[] args) {

        List<Food> list = new List<>();
        go(list);
    }

    private static void go(List<Food> list) {
        Food[] fd = goodFood();
        list.setList(fd);
        for (int i = 0; i < NumElMass; i++){
            System.out.println("продукт питания: " + list.getList()[i].getTitle() + " , срок годности: " + list.getList()[i].getShelfLife());
        }
    }

    private static Food[] goodFood() {
        Food foodBread = new Food("Bread", 3);
        Food foodMilk = new Food("Milk",8);
        Food foodEggs = new Food("Eggs", 20);
        Food foodPasta = new Food("Pasta", 150);
        Food foodPepper = new Food("Pepper", 10);
        Food foodFish = new Food("Fish",5);
        Food[] food = new Food[6];
        food [0] = foodBread;
        food [1] = foodMilk;
        food [2] = foodEggs;
        food [3] = foodPasta;
        food [4] = foodPepper;
        food [5] = foodFish;

        return food;
    }

}


class List<T>{
    private T[] list;


    public T[] getList() {
        return list;
    }

    public void setList(T[] list) {
        this.list = list;
    }
}

class Food {
    private String title;
    private int shelfLife;

    public Food (String title, int shelfLife){
        this.title = title;
        this.shelfLife = shelfLife;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }
}