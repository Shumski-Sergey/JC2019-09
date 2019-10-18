package kushakov.Lesson2;

public class L2TaskB1 {
    public static void main(String[] args){
        int max=100;
        int min=10;
        double a = (Math.random() * (max-min+1)) +min;
        System.out.println("Число =" +a);
        if (20<a & a<80){
            System.out.println("Положительное число");
        }
        else {
            System.out.println("Отрицательное число");
        }
    }
}
