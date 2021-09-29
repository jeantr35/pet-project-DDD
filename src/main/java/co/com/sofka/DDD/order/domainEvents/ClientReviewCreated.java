package co.com.sofka.DDD.order.domainEvents;

import co.com.sofka.DDD.order.valueObjects.ClientID;
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
