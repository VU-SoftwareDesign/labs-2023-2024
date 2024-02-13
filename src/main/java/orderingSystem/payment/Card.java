package orderingSystem.payment;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

public class Card extends Payment {
 
    @Getter @Setter
    private String type;
    @Getter @Setter
    private Integer number;
    @Getter @Setter
    private LocalDate expiryDate;


    public Card(String type, Integer number, LocalDate expiryDate) {
        this.type = type;
        this. number = number;
        this.expiryDate = expiryDate;
       
    }


}
