package sshumsky.generics;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Runner {

    private static final int BIG_APPLE = 10;

    public static void main(String[] args) {
        /************************/
//        Box<Apple> appleBox = new Box<>();
//        appleBox.setItem(new Apple("Antonovka", "White", 1));
        /************************/
        Box<ArrayList<Apple>> box = getArrayListBox();
        ArrayList<Apple> appleStream = (ArrayList<Apple>) box.getItem().stream()
                .filter(apple -> apple.getWeight() != BIG_APPLE).collect(Collectors.toList());
        appleStream.forEach(apple -> System.out.println(apple.getGrade()));
    }

    private static Box<ArrayList<Apple>> getArrayListBox() {
        Box<ArrayList<Apple>> box = new Box<>();
        box.setItem(createApple("Antonovka", "White", 1));
        box.getItem().add((createApple("WhiteNaliv", "White", 10)).get(0));
        box.getItem().add((createApple("PrinceInRed", "Red", 3)).get(0));
        return box;
    }

    private static ArrayList<Apple> createApple(String color, String grade, int weight) {
        Apple apple = new Apple(color, grade, weight);
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(apple);
        return apples;
    }
}
