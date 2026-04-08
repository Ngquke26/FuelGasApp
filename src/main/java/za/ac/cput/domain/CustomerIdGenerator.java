package za.ac.cput.domain;

public class CustomerIdGenerator {
    private static CustomerIdGenerator instance;
    private final String id = "CM";
    private int count = 200000;

    private CustomerIdGenerator(){

    }
    public static CustomerIdGenerator getInstance(){
        if(instance == null){
            instance = new CustomerIdGenerator();
        }
        return instance;
    }
    public String getId(){
        count++;
        return id+count;
    }
}
