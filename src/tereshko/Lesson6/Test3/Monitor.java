package tereshko.Lesson6.Test3;

public class Monitor extends Video{
    private boolean VGA;
    private boolean HDMI;

    public boolean isVGA() {
        return VGA;
    }

    public void setVGA(boolean VGA) {
        this.VGA = VGA;
    }

    public boolean isHDMI() {
        return HDMI;
    }

    public void setHDMI(boolean HDMI) {
        this.HDMI = HDMI;
    }

    public String getDisplayresolution() {
        return displayresolution;
    }

    public void setDisplayresolution(String displayresolution) {
        this.displayresolution = displayresolution;
    }

    private String displayresolution;
}