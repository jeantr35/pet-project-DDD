package co.com.sofka.DDD.order.domainEvents;

import co.com.sofka.DDD.order.valueObjects.Status;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Set;

public class StatusUpdated extends DomainEvent {

    private final Status status;

    public StatusUpdated(Status status) {
        super("sofka.order.statusUpdated");
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}
