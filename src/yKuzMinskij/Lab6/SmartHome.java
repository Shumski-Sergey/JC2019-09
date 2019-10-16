package yKuzMinskij.Lab6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Создать иерархию классов, описывающих бытовую технику. Создать
 * несколько объектов описанных классов, часть из них включить в розетку.
 * Иерархия должна иметь хотя бы три уровня.
 */

public class SmartHome {
    public static void main (String[] args) throws IOException {
        Household_Appliances.Refrigerator X_2401_100 = new Household_Appliances.Refrigerator
                ("ATLANT", "WHITE", 20.2,  "Х 2401-100", 85.0, true);
        Household_Appliances.Refrigerator T_1414_Comfort = new Household_Appliances.Refrigerator
                ("Liebherr", "WHITE", 22.0, "T 1414 Comfort", 83, true);
    X_2401_100.act();
    T_1414_Comfort.act();
    }
}

interface pit{
    void act () throws IOException;
}

class Household_Appliances {
    private static String brand;
    private static String color;
    private static double power;

    public Household_Appliances (String brand, String color, double power) {
        this.brand = brand;
        this.color = color;
        this.power = power;
    }
    public static class Refrigerator extends Household_Appliances implements pit {
        private String model;
        private double height;
        private boolean frizer;

        public Refrigerator (String brand, String color, double power, String model, double height, boolean frizer) {
            super(brand, color, power);
            this.model = model;
            this.height = height;
            this.frizer = frizer;
        }
        public String getBrand (){return brand;}
        public String getColor (){return color;}
        public double getPower (){return power;}
        public String getModel () {
            return model;
        }
        public double getHeight(){return height;
        }
        @Override
        public void act () throws IOException {
            System.out.println("Вкулючить холодильник " + Refrigerator.this.model + "?");
            System.out.println("Если да - введите \"Y\"\nЕсли нет - \"N\"");
            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
            String answer = sc.readLine();
            if (answer.contains("[Yy]")) {
                System.out.println("Холодильник " + this.getBrand()+ " " + this.getModel() +
                        "\nЦвет" + getColor() + "\nВключён в розетку");
            }else {System.out.println("Холодильник не подключён");}
        }
    }
}