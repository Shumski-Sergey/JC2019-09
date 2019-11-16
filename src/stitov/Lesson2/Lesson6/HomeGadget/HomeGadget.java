package stitov.Lesson2.Lesson6.HomeGadget;

class HomeGadget {
    private String name;
    private boolean state;

    boolean getState(){
        return this.state;
    }
    void setState(boolean flag){
        this.state = flag;
    }
    HomeGadget(String name){
        this.name = name;
        this.state = false;
    }
}
