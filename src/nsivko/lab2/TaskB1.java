package nsivko.lab2;

public class TaskB1 {
    public static void main(String[] args) {
        int ch = (int) (Math.random()* 150 + 5);
        if (ch > 25 && ch < 100){
            System.out.println("Число " + ch + " лежит в отрезке [25,100]" );
        } else {System.out.println("Число " + ch + " не лежит в отрезке [25,100]" );}


    }
}
