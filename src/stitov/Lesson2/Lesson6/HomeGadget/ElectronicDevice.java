package stitov.Lesson2.Lesson6.HomeGadget;

public class ElectronicDevice extends HomeGadget implements PlugIn {
   ElectronicDevice(String name){
       super(name);
   }
   public void plugIn() {
       if (this.getState()) {
           this.setState(true);
       }
   }
   public void plugOff() {
       if (this.getState()) {
           this.setState(false);
       }
   }
}
