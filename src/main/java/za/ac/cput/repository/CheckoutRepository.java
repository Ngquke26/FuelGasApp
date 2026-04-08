package za.ac.cput.repository;

import za.ac.cput.domain.Checkout;

import java.util.HashMap;
import java.util.Map;

public class CheckoutRepository implements ICheckoutRepository {
    private static CheckoutRepository instance = null;
    private Map<String, Checkout> checkoutMap;

    private CheckoutRepository(){
        checkoutMap = new HashMap<>();
    }
    public static CheckoutRepository getInstance(){
        if(instance == null){
            instance = new CheckoutRepository();
        }
        return instance;
    }
    @Override
    public void create(Checkout checkout) {

    }

    @Override
    public void save(Checkout checkout) {
    checkoutMap.put(checkout.getCheckoutId(),checkout);
    }
/*
    @Override
    public Checkout read(String id) {

        return null;
    }
*/
    @Override
    public Checkout findById(String id) {
        return checkoutMap.get(id);

    }

    @Override
    public void delete(String id) {
        checkoutMap.remove(id);
    }
}
