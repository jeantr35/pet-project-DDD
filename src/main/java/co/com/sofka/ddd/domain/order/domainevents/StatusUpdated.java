package co.com.sofka.ddd.domain.order.domainevents;

import co.com.sofka.ddd.domain.order.value.Status;
import co.com.sofka.domain.generic.DomainEvent;

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
