package ssivko.lab2;

public class Q3 {
    public static void main(String[] args) {
        int a = 6, b = 3, c = 4;
        if (a < b){
            if (b < c){
                System.out.println(a+","+b+ "," +c);
            }
            else  if (a > c){
                System.out.println(c+","+a+","+b);
            }
            else {
                    System.out.println(a+","+c+","+b);
                }

            }
        else if (b > c){
            System.out.println(c+","+b+","+a);
        } else if(a < c){
                System.out.println(b+","+a+","+c);
        }
          else {
            System.out.println(b+","+c+","+a);
        }

        }

        }
