package balexej.test.Dog1;

public class Dog1TestDrive {

        public static void main(String[] args){
            Dog1 one = new Dog1();
            one.setSize(70);
            Dog1 two = new Dog1();
            two.setSize(8);
            System.out.println("Первая собака: " + one.getSize());
            System.out.println("Вторая собака :" + two.getSize());
            one.bark();
            two.bark();

        }
    }

