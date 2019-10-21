package nsivko.lab8.Task2;

public class SaveCatalog {


    private static final int numberOfElements = 5;

    public static void main(String[] args) {

        Catalog<Profession> catalog = new Catalog<>();
        printElementsCatalog(catalog);

    }

    private static void printElementsCatalog(Catalog<Profession> catalog) {
        Profession[] prof = createProfession();
        catalog.setCatalog(prof);
        System.out.println("Первые " + numberOfElements + " элементов: ");
        for(int i = 0; i < numberOfElements; i++)
        System.out.println("Профессия " + catalog.getCatalog()[i].getName() + ", стаж " + catalog.getCatalog()[i].getExperience());
    }

    public static Profession[] createProfession() {
        Profession professionIngineer = new Profession("Инженер", (int) (Math.random() * 15));
        Profession professionProgrammer = new Profession("Программист", (int) (Math.random() * 15));
        Profession professionEconomist = new Profession("Экономист", (int) (Math.random() * 15));
        Profession professionAccountant = new Profession("Бухгалтер", (int) (Math.random() * 15));
        Profession professionTeacher = new Profession("Учитель", (int) (Math.random() * 15));
        Profession professionCook = new Profession("Повар", (int) (Math.random() * 15));
        Profession professionDoctor = new Profession("Врач", (int) (Math.random() * 15));
        Profession professionExtra = new Profession("Статист", (int) (Math.random() * 15));
        Profession[] professions = new Profession[8];
        professions[0] = professionIngineer;
        professions[1] = professionProgrammer;
        professions[2] = professionEconomist;
        professions[3] = professionAccountant;
        professions[4] = professionTeacher;
        professions[5] = professionCook;
        professions[6] = professionDoctor;
        professions[7] = professionExtra;
        return professions;
    }

}
