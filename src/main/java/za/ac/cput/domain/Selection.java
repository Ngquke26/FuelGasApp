package za.ac.cput.domain;



public class Selection {
    private String customerId;
    private String fuelId;
    private String fuelType;
    private String fuelName;
    private int litre;
    private double price;

    public Selection(Builder builder) {
        this.customerId = builder.customerId;
        this.fuelId = builder.fuelId;
        this.fuelType = builder.fuelType;
        this.fuelName = builder.fuelName;
        this.litre = builder.litre;
        this.price = builder.price;
    }
    public static class Builder{
        private String customerId;
        private String fuelId;
        private String fuelType;
        private String fuelName;
        private int litre;
        private double price;

        public Builder(String customerId, String fuelId, String fuelType, String fuelName,int litre,double price){
            this.customerId = customerId;
            this.fuelId = fuelId;
            this.fuelType = fuelType;
            this.fuelName = fuelName;
            this.litre = litre;
            this.price = price;

        }
        public Selection build(){
            return new Selection(this);
        }

    }
}
