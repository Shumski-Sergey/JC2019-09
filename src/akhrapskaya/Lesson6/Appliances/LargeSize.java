package akhrapskaya.Lesson6.Appliances;

public class LargeSize extends App {
    private int height;
    private int width;
    protected LargeSize(int power, int enCon, int height, int width) {
        super(power, enCon);
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
    protected void match(){
        super.match();
        System.out.println("Мои размеры: " + getH() + " - высота и " + getW() + " - ширина.");
    }

}
