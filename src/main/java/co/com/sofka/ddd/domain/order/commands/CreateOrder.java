package co.com.sofka.ddd.domain.order.commands;

import co.com.sofka.ddd.domain.order.Client;
import co.com.sofka.ddd.domain.order.Dish;
import co.com.sofka.ddd.domain.order.value.Billing;
import co.com.sofka.ddd.domain.order.value.OrderID;
import co.com.sofka.domain.generic.Command;

import java.util.List;

public class CreateOrder extends Command {

    private final OrderID orderId;
    private final List<Dish> dishList;
    private final Client client;
    private final Billing billing;

    public CreateOrder(OrderID orderId, List<Dish> dishList, Client client, Billing billing) {
        this.orderId = orderId;
        this.dishList = dishList;
        this.client = client;
        this.billing = billing;
    }

    public OrderID getOrderId() {
        return orderId;
    }

    public List<Dish> getDishList() {
        return dishList;
    }

    public Client getClient() {
        return client;
    }

    public Billing getBilling() {
        return billing;
    }
}
