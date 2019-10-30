package akhrapskaya.Lesson7;


public class Box<T> {
    private T[] item;

    private Box(T[] item) {
        this.item = item;
    }
    private T getItemInd(int i) {
        return item[i];
    }
    public static void  main(String[] args){
        Cats[] cats = new Cats[3];
        for(int j =0; j< cats.length; j++)
            cats[j] = new Cats();
        cats[0].setName("Barsik");
        cats[0].setAge(5);
        cats[1].setName("Pushok");
        cats[1].setAge(3);
        cats[2].setName("Snejok");
        cats[2].setAge(1);
        Box<Cats> catsInBox = new Box<>(cats);
        System.out.println(catsInBox.getItemInd(2).getName() + " " + catsInBox.getItemInd(2).getAge());

    }
}
