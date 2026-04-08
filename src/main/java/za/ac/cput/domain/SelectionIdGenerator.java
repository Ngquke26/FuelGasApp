package za.ac.cput.domain;

public class SelectionIdGenerator {
    private static SelectionIdGenerator instance;
    private final String id = "FS";
    private int count = 20000;

    private SelectionIdGenerator(){

    }
    public static SelectionIdGenerator getInstance(){
        if(instance == null){
            instance = new SelectionIdGenerator();
        }
        return instance;
    }
    public String getId(){
        count++;
        return id+count;
    }
}
