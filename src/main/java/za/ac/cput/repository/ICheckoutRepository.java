package za.ac.cput.repository;

import za.ac.cput.domain.Checkout;

public interface ICheckoutRepository {
    void create(Checkout checkout);
    void save(Checkout checkout);
   // Checkout read(String id);
    Checkout findById(String id);
    void delete(String id);
}
