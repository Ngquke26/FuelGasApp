package za.ac.cput.domain;

public class FuelIdGenerator {
    private static FuelIdGenerator instance;
    private final String id = "FD";
    private int count = 200000;

    private FuelIdGenerator() {

    }

    public static FuelIdGenerator getInstance() {
        if (instance == null) {
            instance = new FuelIdGenerator();
        }
    return instance;
    }
    public String getFuelId(){
        count++;
        return id+count;
    }
}