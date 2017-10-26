package main.chapter2.item03_singleton.method;

public class Elvis {
    private static final Elvis INSTANCE = new Elvis();

    private Elvis(){

    }

    public static Elvis getInstance(){
        return INSTANCE;
    }

    public void leaveTheBuilding(){
        System.out.println("I am out");
    }


    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();
    }
}
