package co.com.sofka.ddd.domain.order.domainevents;

import co.com.sofka.ddd.domain.order.Client;
import co.com.sofka.ddd.domain.order.Dish;
import co.com.sofka.ddd.domain.order.value.Billing;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class OrderCreated extends DomainEvent {

    private final List<Dish> dishList;
    private final Client client;
    private final Billing billing;



    public OrderCreated(List<Dish> dishList, Client client, Billing billing) {
        super("sofka.order.ordercreated");
        this.dishList = dishList;
        this.client = client;
        this.billing = billing;
    }

    public List<Dish> getDishList(){
        return dishList;
    }

    public Client getClient() {
        return client;
    }

    public Billing getBilling() {
        return billing;
    }


}
