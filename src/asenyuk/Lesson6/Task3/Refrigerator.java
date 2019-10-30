package asenyuk.Lesson6.Task3;

public class Refrigerator extends HomeDevice {

    double temperature;

    double  setTemperature (double temperature) {
     return    this.temperature=temperature;
    }

     double getTemperature() {
        return temperature;
    }

    Refrigerator (String title,int power,String production, double coast,double temperature) {
        super(title, power, production, coast);
        this.temperature = temperature;
    }

       double increaseTemperature ( ) {
            return setTemperature(getTemperature() *2);
        }

    @Override
    void parametrOfDevice () {
        System.out.println("Device have several paramets :" + getTitle() + "; " + getPower() + ";  " + getProduction()+ "; " + getCoast() + ";  " +getTemperature());
    }

   }

