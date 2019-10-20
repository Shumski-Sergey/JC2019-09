package asenyuk.Lesson6.Task1;

public class MainTime {
    public static void main(String[] args) {

        Time t1=new Time(5109);
        Time t2=new Time(1,25,10);
        t1.showTimeSeconds();
        t2.showTimeSeconds();

        if ( t1.CompareTime(t2) ==-1)  System.out.println("t2 > t1");
        else if ( t1.CompareTime(t2) ==1)  System.out.println("t1 > t2");
        else  System.out.println("t1= t2");

       }
    }

