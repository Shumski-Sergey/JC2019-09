package kushakov.BetaVersion.UslovnieOperatori;

public class ver7 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 5;
        if(a>b || b==c) System.out.println("Верно!");
        if(!(a>b) && !(a>c)) System.out.println("Родной, ты что-то попутал!");
        if(a>b && a>c) System.out.println("Я?!");
    }
}
