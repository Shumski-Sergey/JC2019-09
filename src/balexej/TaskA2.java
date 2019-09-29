package balexej;

public class TaskA2 {
  public static void main( String[] args){
      double a,b,c,d,x1,x2;
      a=1;
      b=26;
      c=25;
      d= b*b-4*a*c;
      if(d >= 0) {
          x1 = (-b + Math.sqrt(d))/(2*a);
          x2 = (-b - Math.sqrt(d))/(2*a);
          System.out.println("x1 = " + x1+", x2 = " + x2);
      }
      else{
          System.out.println("Уравнение не имеет решения ");
      }

  }
}
