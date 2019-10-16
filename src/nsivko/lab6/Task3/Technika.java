package nsivko.lab6.Task3;

public class Technika {
    String color;
    double P;

    Technika(int kolPrib) {
        int kol = kolPrib;
    }

    Technika(String tColor, double tP) {
        color = tColor;
        P = tP;
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
