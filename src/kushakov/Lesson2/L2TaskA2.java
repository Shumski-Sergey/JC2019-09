package kushakov.Lesson2;

public class L2TaskA2 {
    public static void main(String[] args){
        int k = 4;
        int j = 3;
        int l = 1;
        double x1;
        double x2;
        double d;
        d =(k*k -4*j*l);
        if(d==0){
            x1=(-1*k)/(2*j);
            System.out.println("x1" + x1);
        } else if (d>0){
            x1 = ((-1*k + Math.sqrt(d))/2 *j);
            x2 = ((-1 *k - Math.sqrt(d))/2 *j);
            System.out.println("x1" + x1);
            System.out.println("x2" + x2);
        } else if (d>0){
            System.out.println("Нет решения");
        }
    }

}
