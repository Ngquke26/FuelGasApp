package za.ac.cput;

import za.ac.cput.domain.Checkout;
import za.ac.cput.domain.Selection;
import za.ac.cput.factory.CheckoutFactory;
import za.ac.cput.factory.SelectionFactory;
import za.ac.cput.repository.CheckoutRepository;
import za.ac.cput.repository.ICheckoutRepository;
import za.ac.cput.repository.ISelectionRepository;
import za.ac.cput.repository.SelectionRepository;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    ISelectionRepository srepo = SelectionRepository.getInstance();
    Selection sel = SelectionFactory.createSelection("FS20000","CM20000","FL20000","Diesel","Castrol Vecton",25,26);
    System.out.println(sel);
    srepo.create(sel);
    srepo.save(sel);
    srepo.findById("FS20000");

    ICheckoutRepository crepo = CheckoutRepository.getInstance();
    Checkout check = CheckoutFactory.createCheckout("CM20000","CO20000","Diesel","Castrol Vecton",650,25.00,"FYX264WC","664748378476387883",675.00);
    System.out.println(check);
    crepo.create(check);
    crepo.save(check);
    }
}