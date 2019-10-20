package nsivko.lab6.Task3;

public class Technika {
    String color;
    double P;
    int kol;

    Technika(int kolPrib) {
        this.kol = kolPrib;
    }

    Technika(String tColor, double tP) {
        this.color = tColor;
        this.P = tP;
    }

    public void techName(int k, String[] name) {
        System.out.println("Количество техники равно " + k + ", это:");
        for(int i = 0; i < k; i++) {
            System.out.println("- " + name[i]);
        }
    }

    public void parametr (String name, String tColor, double tP) {
        System.out.println("\n" + name + " "+ tColor + " цвета и мощности " + tP + " кВт.");
    }

    public void plug(boolean prov, String name){
        if (prov == true) {
            System.out.println(name + " включен(-а) в розетку.");
        } else System.out.println(name + " не включен(-а) в розетку.");
    }

}
