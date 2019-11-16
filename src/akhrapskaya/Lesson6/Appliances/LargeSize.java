package akhrapskaya.Lesson6.Appliances;

public abstract class LargeSize extends App {
    private int height;
    private int width;
    protected LargeSize(int power) {
        super(power);
    }
    protected void setSize(int height, int width){
        this.height = height;
        this.width = width;
    }
    private int getH(){
        return height;
    }
    private int getW(){
        return width;
    }
    @Override
    protected void info(){
        System.out.println("Мои размеры: " + getH() + " - высота и " + getW() + " - ширина.");
        super.info();
    }

}
