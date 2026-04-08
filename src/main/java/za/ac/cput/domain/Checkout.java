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

    public String getCustomerId() {
        return customerId;
    }

    public String getCheckoutId() {
        return checkoutId;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getFuelName() {
        return fuelName;
    }

    public double getSubTotal(int litre, double price) {
        subTotal = litre*price;
        return subTotal;
    }

    public double getServiceFee() {
        return serviceFee;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public String getCardId() {
        return cardId;
    }

    public double getTotal() {
        total = subTotal+serviceFee;
        return total;
    }

    @Override
    public String toString() {
        return "Checkout{" +
                "customerId='" + customerId + '\'' +
                ", checkoutId='" + checkoutId + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", fuelName='" + fuelName + '\'' +
                ", subTotal=" + subTotal +
                ", serviceFee=" + serviceFee +
                ", numberPlate='" + numberPlate + '\'' +
                ", cardId='" + cardId + '\'' +
                ", total=" + total +
                '}';
    }

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
            this.customerId = FuelIdGenerator.getInstance().getFuelId();
            this.checkoutId = CheckoutIdGenerator.getInstance().getCheckoutId();

            return new Checkout(this);
        }
    }
}