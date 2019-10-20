package stitov.Lesson2.Lesson6.HomeGadget;

public class SmartDevice extends ElectronicDevice {
    public SmartDevice(String name, String ipAddress) {
        super(name);
        this.ipAddress = ipAddress;
    }
    private String ipAddress;

    public String getIpAddress() {
        return this.ipAddress;
    }
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public void plugOff() {
        super.plugOff();
    }
}
