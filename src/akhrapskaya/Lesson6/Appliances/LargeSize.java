package akhrapskaya.Lesson6.Appliances;

public class LargeSize extends App {
    private int height;
    private int width;
    protected LargeSize(int power, int enCon) {
        super(power, enCon);

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
    protected void match(){
        super.match();
        System.out.println("Мои размеры: " + getH() + " - высота и " + getW() + " - ширина.");
    }

}
