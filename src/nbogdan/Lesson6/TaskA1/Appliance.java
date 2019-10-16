package nbogdan.Lesson6.TaskA1;

class Appliance {
    private int power;
    private boolean energy;
    Appliance(boolean energy, int power) {
        this.power = power;
        this.energy = energy;
    }
    void setEnergy(boolean energy) {this.energy = energy;}
    boolean getEnergy() {return energy;}
    void setPower(int power) {this.power = power;}
    int getPower() {return power;}
}
