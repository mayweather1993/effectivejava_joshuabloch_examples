package main.chapter2.item03_singleton.enumeration;

public enum  Elvis {
    INSTANCE;

    public void leaveTheBulding(){
        System.out.println("WHoa baby , i am outta here!");
    }

    //this code would normally appear outside the class
    public static void main(String[] args) {
        Elvis.INSTANCE.leaveTheBulding();
    }
}
