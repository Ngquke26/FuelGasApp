package za.ac.cput.domain;

public class CheckoutIdGenerator {
    private static CheckoutIdGenerator instance;
    private final String id = "CO";
    private int count =200000;

    private CheckoutIdGenerator(){

    }
    public static CheckoutIdGenerator getInstance(){
    if(instance == null){
        instance = new CheckoutIdGenerator();
    }
    return instance;
}
public String getCheckoutId(){
    count++;
    return id+count;
    }
}