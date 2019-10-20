package stitov.Lesson2.Lesson6.HomeGadget;

public class Main {
    public static void main(String[] args){
        SmartDevice sDevice = new SmartDevice("TV","192.16.80.1");
        String str;
        str = sDevice.getIpAddress();
        sDevice.setIpAddress("192.16.80.1");
        System.out.println(str);
        System.out.println(sDevice.getState());
        sDevice.plugIn();
        System.out.println(sDevice.getState());
        sDevice.plugIn();
        System.out.println(sDevice.getState());
        sDevice.plugOff();
        System.out.println(sDevice.getState());
    }
}
