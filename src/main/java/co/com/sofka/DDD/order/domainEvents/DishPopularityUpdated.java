package co.com.sofka.DDD.order.domainEvents;

import co.com.sofka.domain.generic.DomainEvent;

public class DishPopularityUpdated extends DomainEvent {

    public DishPopularityUpdated() {
        super("sofka.order.voucherAddedToClient");
    }
}
