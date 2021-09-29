package co.com.sofka.ddd.domain.order.domainevents;

import co.com.sofka.ddd.domain.order.value.ClientID;
import co.com.sofka.domain.generic.DomainEvent;

public class ClientReviewCreated extends DomainEvent {

    private final ClientID clientID;
    private final Integer value;


    public ClientReviewCreated(ClientID clientID,Integer value) {
        super("sofka.order.clientReviewCreated");
        this.clientID = clientID;
        this.value = value;
    }

    public ClientID getClientID() {
        return clientID;
    }

    public Integer getValue() {
        return value;
    }
}
