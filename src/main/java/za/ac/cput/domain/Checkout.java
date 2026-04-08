package za.ac.cput.domain;

public class Checkout {
    private String customerId;
    private String checkoutId;
    private String fuelType;
    private String fuelName;
    private double subTotal;
    private double serviceFee;
    private String numberPlate;
    private String cardId;
    private double total;

    public Checkout(Builder builder) {
        this.customerId = builder.customerId;
        this.checkoutId = builder.checkoutId;
        this.fuelType = builder.fuelType;
        this.fuelName = builder.fuelName;
        this.subTotal = builder.subTotal;
        this.serviceFee = builder.serviceFee;
        this.numberPlate = builder.numberPlate;
        this.cardId = builder.cardId;
        this.total = builder.total;
    }

    public static class Builder {
        private String customerId;
        private String checkoutId;
        private String fuelType;
        private String fuelName;
        private double subTotal;
        private double serviceFee;
        private String numberPlate;
        private String cardId;
        private double total;

        public Builder(String customerId, String checkoutId, String fuelType, String fuelName, double subTotal, double serviceFee, String numberPlate, String cardId, double total) {
            this.customerId = customerId;
            this.checkoutId = checkoutId;
            this.fuelType = fuelType;
            this.fuelName = fuelName;
            this.subTotal = subTotal;
            this.serviceFee = serviceFee;
            this.numberPlate = numberPlate;
            this.cardId = cardId;
            this.total = total;
        }

        public Checkout build() {
            return new Checkout(this);
        }
    }
}