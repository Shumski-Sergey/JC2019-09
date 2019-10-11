package aflyer.les5;

import java.util.Scanner;

//Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.
public class TaskA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int n=sc.nextInt();
        String [] str=new String[n];
        String StrSort="";

        for (int i=0;i<n; i++){
            System.out.println("Введите строку №"+ (i+1));
            str[i]=sc.next();
        }
        for (int i=0; i<n; i++){
            for (int j=n-1; j>=i; --j ){
                if (str[i].length()>str[j].length()){ StrSort=str[i]; str[i]=str[j]; str[j]=StrSort;}
            }

        }
        for (String x: str)
             { System.out.print(x+" ");
        }
        for (int i=n-1; i>=0; --i){
             System.out.print(str[i]+" ");
        }
    }

}
