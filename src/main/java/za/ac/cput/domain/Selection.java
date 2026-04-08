package za.ac.cput.domain;



public class Selection {
    private String selectionId;
    private String customerId;
    private String fuelId;
    private String fuelType;
    private String fuelName;
    private int litre;
    private double price;

    public Selection(Builder builder) {
        this.selectionId = builder.selectionId;
        this.customerId = builder.customerId;
        this.fuelId = builder.fuelId;
        this.fuelType = builder.fuelType;
        this.fuelName = builder.fuelName;
        this.litre = builder.litre;
        this.price = builder.price;
    }

    public String getSelectionId() {
        return selectionId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFuelId() {
        return fuelId;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getFuelName() {
        return fuelName;
    }

    public int getLitre() {
        return litre;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Selection{" +
                "selectionId='" + selectionId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", fuelId='" + fuelId + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", fuelName='" + fuelName + '\'' +
                ", litre=" + litre +
                ", price=" + price +
                '}';
    }

    public static class Builder{
        private String selectionId;
        private String customerId;
        private String fuelId;
        private String fuelType;
        private String fuelName;
        private int litre;
        private double price;

        public Builder(String selectionId,String customerId, String fuelId, String fuelType, String fuelName,int litre,double price){
            this.selectionId = selectionId;
            this.customerId = customerId;
            this.fuelId = fuelId;
            this.fuelType = fuelType;
            this.fuelName = fuelName;
            this.litre = litre;
            this.price = price;

        }
        public Selection build(){
            this.selectionId = SelectionIdGenerator.getInstance().getSelectionId();
            this.customerId = CustomerIdGenerator.getInstance().getCustomerId();
            this.fuelId = FuelIdGenerator.getInstance().getFuelId();
            return new Selection(this);
        }

    }
}
