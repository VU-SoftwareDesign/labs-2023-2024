package orderingSystem.payment;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

public abstract class Payment {
 
    @Getter @Setter
    private UUID paymentID;


    public Payment() {
        this.paymentID = UUID.randomUUID();
       
    }

    public void makePayment(){
        System.out.println("The payment is forwarded to payment system");
    }

    public Payment getPayment() {
        return this;
    }
}
