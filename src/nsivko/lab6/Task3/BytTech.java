package nsivko.lab6.Task3;

public class BytTech {
    public static void main(String[] args) {

        int kolTech = 4;
        String[] techName = {"Холодильник", "Тостер","Плита","Микроволновка"};
        String[] techColor = {"красного", "чёрного в белую крапинку","чёрного","белого"};
        double[] teshP = {1.5, 1, 3, 1.7};
        boolean[] provVkl = {true, false, true, false};

        Technika tech = new Technika(kolTech);
        Holodos holodil = new Holodos(techColor[0], teshP[0]);
        Toster tost = new Toster(techColor[1], teshP[1]);
        Plita plit = new Plita(techColor[2], teshP[2]);
        Mikrowave mikrow = new Mikrowave(techColor[3], teshP[3]);

        tech.techName(kolTech, techName);

        holodil.parametr(techName[0],techColor[0], teshP[0]);
        holodil.plug(provVkl[0], techName[0]);
        holodil.mesto(techName[0]);

        tost.parametr(techName[1],techColor[1], teshP[1]);
        tost.plug(provVkl[1], techName[1]);
        tost.mesto(techName[1]);

        plit.parametr(techName[2],techColor[2], teshP[2]);
        plit.plug(provVkl[2], techName[2]);

        mikrow.parametr(techName[3],techColor[3], teshP[3]);
        mikrow.plug(provVkl[3], techName[3]);

    }

}
