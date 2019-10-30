package asenyuk.Lesson6.Task3;

abstract class Device {
   private String title;
    private   int power;
    private   String production;

    Device (String title,int power,String production) {
        this.title=title;
        this.power=power;
        this.production=production;
    }

    void  setTitle (String title) {
        this.title=title;
    }

    int setPower (int power) {
        this.power=power;
        return power;
    }

    void  setProduction (String production) {
        this.production=production;
    }

    String getTitle () {
    return  title;
    }

    int getPower() {
        return  power;
    }
    String getProduction () {
    return production;
    }

    void parametrOfDevice () {

        System.out.println("Device have these paramets " + getTitle() + " " + getPower() + " " + getProduction());
    }

    abstract int switchOf ();

    abstract int switchOn ();



    }


