package co.com.sofka.ddd.domain.order.domainevents;

import co.com.sofka.domain.generic.DomainEvent;

public class DishPopularityUpdated extends DomainEvent {

    public DishPopularityUpdated() {
        super("sofka.order.voucherAddedToClient");
    }
}
