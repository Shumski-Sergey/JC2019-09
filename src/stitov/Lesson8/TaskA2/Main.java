package stitov.Lesson8.TaskA2;

public class Main {
    public static  void main(String[] args) {
        String[] oldCatalog;
        oldCatalog = setCatalog();
        Catalog<String> catalog = new Catalog<>(oldCatalog);
        catalog.addItem("Tesla");
        catalog.addItem("Aston Martin");
        catalog.removeItem(6);
        catalog.removeItem(8);
        String[] newCatalog = new String[catalog.size()];
        newCatalog = catalog.itemsToArray(String.class);
        for (String i : newCatalog){
            System.out.println(i           );
        }


    }
    private static String[] setCatalog(){
        String[] oldCatalog = new String[10];
        oldCatalog[0] = "Audi";
        oldCatalog[1] = "BMW";
        oldCatalog[2] = "Mercedes";
        oldCatalog[3] = "Porsche";
        oldCatalog[4] = "Lada";
        oldCatalog[5] = "Volkswagen";
        oldCatalog[6] = "Bugatti";
        oldCatalog[7] = "Ferrari";
        oldCatalog[8] = "Lamborghini";
        oldCatalog[9] = "Moskvich";
        return oldCatalog;
    }
}
