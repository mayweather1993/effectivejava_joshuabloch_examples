package main.chapter2.item05_objects;

public class Sum {
    //slow program, can u find a problem in one char?
    public static void main(String[] args) {
        Long sum = 0L;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
