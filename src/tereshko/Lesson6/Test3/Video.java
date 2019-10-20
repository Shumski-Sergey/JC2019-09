package tereshko.Lesson6.Test3;

public class Video extends Appliances{
    private double dioganal;
    private String matrix;
    private boolean OLEDtehnology;
    private boolean LCD;

    public double getDioganal() {
        return dioganal;
    }

    public void setDioganal(double dioganal) {
        this.dioganal = dioganal;
    }

    public String getMatrix() {
        return matrix;
    }

    public void setMatrix(String matrix) {
        this.matrix = matrix;
    }

    public boolean isOLEDtehnology() {
        return OLEDtehnology;
    }

    public void setOLEDtehnology(boolean OLEDtehnology) {
        this.OLEDtehnology = OLEDtehnology;
    }

    public boolean isLCD() {
        return LCD;
    }

    public void setLCD(boolean LCD) {
        this.LCD = LCD;
    }
}