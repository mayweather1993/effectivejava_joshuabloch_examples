package main.chapter2.item03_singleton.serializable;

public class Elvis {
    public static final Elvis INSTANCE = new Elvis();

    private Elvis(){}


    public void leaveTheBuilding(){
        System.out.println("I am out");
    }
    private Object readResolve() {
        // Return the one true Elvis and let the garbage collector
        // take care of the Elvis impersonator.
        return INSTANCE;
    }

    // This code would normally appear outside the class!
    public static void main(String[] args) {
        Elvis.INSTANCE.leaveTheBuilding();
    }
}

