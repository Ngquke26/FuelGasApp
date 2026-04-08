package za.ac.cput.factory;

import za.ac.cput.domain.Selection;

public class SelectionFactory {
    public static Selection createSelection(String customerId, String fuelId, String fuelType, String fuelName, int litre, double price) {
        return new Selection.Builder(customerId, fuelId, fuelType, fuelName, litre, price)
                .build();
    }
}
