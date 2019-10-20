package asenyuk.Lesson6.Task3;

 class HomeDevice extends Device {
    private double coast;

     void  setCoast (double coast) {
         this.coast=coast;
     }

     double getCoast() {
         return coast;
     }

     HomeDevice (String title,int power,String production, double coast) {
         super(title,power,production);
         this.coast=coast;
     }

      int switchOf () {
         return setPower(0);
      }

     int switchOn () {
         return setPower(1);
     }

     @Override
     void parametrOfDevice () {
         System.out.println("Device have several paramets " + getTitle() + " " + getPower() + " " + getProduction()+ " " + getCoast() );
     }
}
