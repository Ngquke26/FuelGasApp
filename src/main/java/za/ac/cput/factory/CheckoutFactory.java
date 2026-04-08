package za.ac.cput.factory;

import za.ac.cput.domain.Checkout;

public class CheckoutFactory {
    public static Checkout createCheckout(String customerId, String checkoutId, String fuelType, String fuelName, double subTotal, double serviceFee, String numberPlate, String cardId, double total) {
        return new Checkout.Builder(customerId, checkoutId, fuelType, fuelName, subTotal, serviceFee, numberPlate, cardId, total)
                .build();
    }

    }

