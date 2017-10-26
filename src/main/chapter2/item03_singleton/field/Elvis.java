package main.chapter2.item03_singleton.field;

public class Elvis {
    public static final Elvis Instance = new Elvis();
    private Elvis(){

    }

    public void leaveTHeBuilding(){
        System.out.println("I am out");
    }

    //easy code
    public static void main(String[] args) {
        Elvis elvis = Elvis.Instance;
        elvis.leaveTHeBuilding();
    }
}
